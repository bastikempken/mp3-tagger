package de.kempkensebastian.mp3tagger.step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.enums.Step;

public class StepManagerTest {

    private StepManager stepManager;

    private DummyStep dummyStep;

    @Before
    public void setUp() throws Exception {
        stepManager = new StepManager();
        List<AbstractStep> list = new ArrayList<>();
        dummyStep = new DummyStep();
        list.add(dummyStep);
        Field declaredField = StepManager.class.getDeclaredField("beans");
        declaredField.setAccessible(true);
        declaredField.set(stepManager, list);
        stepManager.init();
    }

    @Test
    public void testGetStep() {
        AbstractStep result = stepManager.getStep(Step.STOP_WORKFLOW);
        assertThat(result, is(equalTo(dummyStep)));
    }

    @StepTrigger(Step.STOP_WORKFLOW)
    private class DummyStep extends AbstractStep {
        @Override
        public Step process(DataModel dataModel) {
            return null;
        }

    }

}
