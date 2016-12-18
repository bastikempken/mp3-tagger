package de.kempkensebastian.mp3tagger.datamodel.access;

import java.util.Map;

import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.datamodel.TagPair;
import de.kempkensebastian.mp3tagger.enums.ID3Tag;

public class DataModelAccess {
	
	public static TagPairOperation of(Map<ID3Tag,TagPair> data){
		return new TagPairOperation(data);
	}
	
	public static DataModelOperation of(DataModel dataModel){
		return new DataModelOperation(dataModel);
	}

}
