package de.kempkensebastian.mp3tagger.gui.controlleroperation;

import java.lang.invoke.MethodHandle;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.kempkensebastian.mp3tagger.datamodel.TagPair;
import de.kempkensebastian.mp3tagger.datamodel.access.TagPairOperation;
import de.kempkensebastian.mp3tagger.enums.ID3Tag;
import de.kempkensebastian.mp3tagger.enums.ID3v2;
import de.kempkensebastian.mp3tagger.gui.controller.ControllerProcessor;
import de.kempkensebastian.mp3tagger.gui.controller.ID3v2Controller;
import javafx.scene.control.TextField;

@Component
public class ID3v2ControllerOperation {
	
	@Autowired
	protected ID3v2Controller controller;
	
	@Autowired
	protected ControllerProcessor controllerProcessor;
	
	protected Map<ID3v2,MethodHandle> getterBeforeTagging;
	
	protected Map<ID3v2,MethodHandle> getterAfterTagging;
	
	@PostConstruct
	public void setUp(){
		getterAfterTagging = controllerProcessor.parseGetterAfter(controller);
		getterBeforeTagging = controllerProcessor.parseGetterBefore(controller);
		
	}
	
	public void mapDataModelToGui(Map<ID3Tag,TagPair> data){
		TagPairOperation tagPairOperation = new TagPairOperation(data);
		for(ID3v2 tagValue : ID3v2.getUsableValues()){
			String tagAfterTagging = tagPairOperation.getTagAfterTagging(tagValue);
			setTagValueAfterTagging(tagValue, tagAfterTagging);
			String tagBeforeTagging = tagPairOperation.getTagBeforeTagging(tagValue);
			setTagValueBeforeTagging(tagValue, tagBeforeTagging);
		}
	}
	
	public void mapToDataModel(Map<ID3Tag,TagPair> data){
		TagPairOperation tagPairOperation = new TagPairOperation(data);
		for(ID3v2 tagValue : ID3v2.getUsableValues()){
			tagPairOperation.setTagBeforeTagging(tagValue, getTagValueBeforeTagging(tagValue));
			tagPairOperation.setTagAfterTagging(tagValue, getTagValueAfterTagging(tagValue));
		}
	}
	public void setTagValueBeforeTagging(ID3v2 tagValue, String value){
		getTextFieldBeforeTagging(tagValue).setText(value);
	}
	
	public void setTagValueAfterTagging(ID3v2 tagValue, String value){
		getTextFieldAfterTagging(tagValue).setText(value);
	}

	public String getTagValueAfterTagging(ID3v2 tagValue){
		return StringUtils.defaultString(getTextFieldAfterTagging(tagValue).getText());
	}


	public String getTagValueBeforeTagging(ID3v2 tagValue){
		return StringUtils.defaultString(getTextFieldBeforeTagging(tagValue).getText());
	}
	
	
	private TextField getTextFieldAfterTagging(ID3v2 tagValue) {
		try {
			Object object = getterAfterTagging.get(tagValue).invoke(controller);
			return (TextField) object;
		} catch (Throwable e) {
			return null;
		}
	}
	
	private TextField getTextFieldBeforeTagging(ID3v2 tagValue) {
		try {
			Object object = getterBeforeTagging.get(tagValue).invoke(controller);
			return (TextField) object;
		} catch (Throwable e) {
			return null;
		}
	}
	
	
	
}
