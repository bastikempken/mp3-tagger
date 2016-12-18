package de.kempkensebastian.mp3tagger.utils;

import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.workflow.AbstractWorkflow;

public class DummyWorkflow extends AbstractWorkflow {

	@Override
	protected Step getStartStep() {
		// TODO Auto-generated method stub
		return Step.J_UNIT_STEP_1;
	}

}
