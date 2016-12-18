package de.kempkensebastian.mp3tagger.workflow;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.kempkensebastian.mp3tagger.enums.Action;

@Component
public class WorkflowManager {
	
	@Autowired
	private List<AbstractWorkflow> beans;
	
	private Map<Action,AbstractWorkflow> workflows;
	
	public AbstractWorkflow getWorkflow(Action key){
		return workflows.get(key);
	}
	
	
	@PostConstruct
	public void init(){
		workflows = new HashMap<>();
		beans.forEach( s -> workflows.put(s.getClass().getAnnotation(WorkflowTrigger.class).value(),s));
		this.workflows = Collections.unmodifiableMap(workflows);
	}
}
