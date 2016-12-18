package de.kempkensebastian.mp3tagger.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum Action{
	
	OPEN_FILE_PATH("openFilePath"),
	
	TAGGEN("taggen"),
	
	JUNIT("junit");
	
	private String buttonId;
	
	
	
	private static final Map<String,Action> buttonIdToAction = Collections.unmodifiableMap(new HashMap<String,Action>(){
		
		private static final long serialVersionUID = 1L;

		{
			Arrays.stream(Action.values()).forEach(a -> put(a.buttonId, a));
		}
	});
	
	public String getButtonId() {
		return buttonId;
	}


	private Action(String buttonId) {
		this.buttonId = buttonId;
	}
	
	public static Action getActionFromButtonId(String buttonId){
		return buttonIdToAction.get(buttonId);
	}
}
