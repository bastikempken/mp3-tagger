package de.kempkensebastian.mp3tagger.impl.taggen;

import de.kempkensebastian.mp3tagger.enums.Action;
import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.workflow.AbstractWorkflow;
import de.kempkensebastian.mp3tagger.workflow.WorkflowTrigger;

@WorkflowTrigger(Action.TAGGEN)
public class TaggenWorkflow extends AbstractWorkflow{

	@Override
	protected Step getStartStep() {
		// TODO Auto-generated method stub
		return null;
	}

}
