package de.kempkensebastian.mp3tagger.workflow;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.step.AbstractStep;
import de.kempkensebastian.mp3tagger.step.StepManager;
import de.kempkensebastian.mp3tagger.utils.DummyWorkflow;

@RunWith(MockitoJUnitRunner.class)
public class AbstractWorkflowTest {
	
	@InjectMocks
	private DummyWorkflow abstractWorkflow;
	
	@Mock
	private StepManager stepManager;

	@Mock
	private AbstractStep step1;
	
	@Mock
	private AbstractStep step2;
	
	@Mock
	private AbstractStep step3;

	
	@Before
	public void setUp() throws Exception {
		Mockito.when(stepManager.getStep(Step.J_UNIT_STEP_1)).thenReturn(step1);
		Mockito.when(stepManager.getStep(Step.J_UNIT_STEP_2)).thenReturn(step2);
		Mockito.when(stepManager.getStep(Step.J_UNIT_STEP_3)).thenReturn(step3);
		
		Mockito.when(step1.process(Mockito.any(DataModel.class))).thenReturn(Step.J_UNIT_STEP_2);
		Mockito.when(step2.process(Mockito.any(DataModel.class))).thenReturn(Step.J_UNIT_STEP_3);
		Mockito.when(step3.process(Mockito.any(DataModel.class))).thenReturn(Step.STOP_WORKFLOW);
	}
	
	@Test
	public void test(){
		abstractWorkflow.handleWorklflow();
		Mockito.verify(step1).process(Mockito.any(DataModel.class));
		Mockito.verify(step2).process(Mockito.any(DataModel.class));
		Mockito.verify(step3).process(Mockito.any(DataModel.class));
		Mockito.verify(stepManager, Mockito.times(3)).getStep(Mockito.any());
	}
}
