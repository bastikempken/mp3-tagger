package de.kempkensebastian.mp3tagger.impl;

import de.kempkensebastian.mp3tagger.enums.Action;
import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.workflow.AbstractWorkflow;
import de.kempkensebastian.mp3tagger.workflow.WorkflowTrigger;

@WorkflowTrigger(Action.OPEN_FILE_PATH)
public class OpenPathWorkflow extends AbstractWorkflow{

	@Override
	protected Step getStartStep() {
		return Step.OPEN_DIRECTOTY_CHOOSER;
	}
}
