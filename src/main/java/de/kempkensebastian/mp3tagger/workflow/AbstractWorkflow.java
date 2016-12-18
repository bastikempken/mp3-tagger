package de.kempkensebastian.mp3tagger.workflow;

import org.springframework.beans.factory.annotation.Autowired;

import de.kempkensebastian.mp3tagger.context.State;
import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.step.AbstractStep;
import de.kempkensebastian.mp3tagger.step.StepManager;

public abstract class AbstractWorkflow {
	
	@Autowired
	private State state;
	
	@Autowired
	private StepManager stepManager;
	
	public AbstractWorkflow() {
		// TODO Auto-generated constructor stub
	}
	
	public void handleWorklflow(){
		DataModel dataModel = state.getFromState(State.KEY_DATA_MODEL, DataModel.class);
		
		AbstractStep step = stepManager.getStep(getStartStep());
		
		if(step == null){
			throw new RuntimeException();
		}
		
		Step nextStep = step.process(dataModel);
		
		while(!Step.STOP_WORKFLOW.equals(nextStep)){
			step = stepManager.getStep(nextStep);
		    if(step == null){
				throw new RuntimeException();
			}
		    nextStep = step.process(dataModel);
		}
	}
	
	protected abstract Step getStartStep();
	
}
