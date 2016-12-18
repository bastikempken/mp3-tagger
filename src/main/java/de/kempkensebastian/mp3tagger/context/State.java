 	package de.kempkensebastian.mp3tagger.context;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import de.kempkensebastian.mp3tagger.datamodel.DataModel;

@Component
public class State {
	
	public static final String KEY_DATA_MODEL = "keyDataModel";
	
	private Map<String,Object> map = new HashMap<>();

	
	public<T> void addToState(String key, T value){
		map.put(key, value);
	}
	
	public<T> T getFromState(String key,Class<T> clazz){
		return clazz.cast(map.get(key));
	}
	
	@PostConstruct
	public void init(){
		addToState(KEY_DATA_MODEL, new DataModel());
	}

}
