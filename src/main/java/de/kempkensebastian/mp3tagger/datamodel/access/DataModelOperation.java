package de.kempkensebastian.mp3tagger.datamodel.access;

import java.util.List;

import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.datamodel.TagFile;

public class DataModelOperation {
	
	private DataModel dataModel;

	public DataModelOperation(DataModel dataModel) {
		this.dataModel = dataModel;
	}
	
	public TagFile getMp3FileByFileName(String fileName){
		List<TagFile> mp3Files = dataModel.getTagFiles();
		return mp3Files.stream().filter(f -> f.getFileName().equals(fileName)).findFirst().get();
	}
	

}
