package de.kempkensebastian.mp3tagger.step;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.kempkensebastian.mp3tagger.enums.Step;

@Component
public class StepManager {
	
	@Autowired
	private List<AbstractStep> beans;
	
	private Map<Step,AbstractStep> steps;
	
	public AbstractStep getStep(Step key){
		return steps.get(key);
	}
	
	
	@PostConstruct
	public void init(){
		final Map<Step,AbstractStep> steps = new HashMap<>();
		beans.forEach( s -> steps.put(s.getClass().getAnnotation(StepTrigger.class).value(),s));
		this.steps = Collections.unmodifiableMap(steps);
	}
	
	

}
