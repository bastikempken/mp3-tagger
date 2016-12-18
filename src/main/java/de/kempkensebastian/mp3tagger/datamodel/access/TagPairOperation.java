package de.kempkensebastian.mp3tagger.datamodel.access;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import de.kempkensebastian.mp3tagger.datamodel.TagPair;
import de.kempkensebastian.mp3tagger.enums.ID3Tag;

public class TagPairOperation {
	
	private Map<ID3Tag, TagPair> tagValues;

	public TagPairOperation(Map<ID3Tag, TagPair> tagPair) {
		this.tagValues = tagPair;
	}
	
	public TagPairOperation setTagBeforeTagging(ID3Tag tag, String value){
		if(!tagValues.containsKey(tag)){
			tagValues.put(tag, new TagPair(StringUtils.EMPTY, StringUtils.EMPTY));
		}
		tagValues.get(tag).setValueBeforeTagging(value);
		return this;
	}
	
	public TagPairOperation setTagAfterTagging(ID3Tag tag, String value){
		if(!tagValues.containsKey(tag)){
			tagValues.put(tag, new TagPair(StringUtils.EMPTY, StringUtils.EMPTY));
		}
		tagValues.get(tag).setValueAfterTagging(value);
		return this;
	}
	
	public String getTagBeforeTagging(ID3Tag tag){
		if(tagValues.get(tag) != null){
			return tagValues.get(tag).getValueBeforeTagging();
		}
		return StringUtils.EMPTY;
	}
	
	public String getTagAfterTagging(ID3Tag tag){
		if(tagValues.get(tag) != null){
			return tagValues.get(tag).getValueAfterTagging();
		}
		return StringUtils.EMPTY;
	}
}
