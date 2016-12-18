package de.kempkensebastian.mp3tagger.impl.openpath;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.notification.NotificationID;
import de.kempkensebastian.mp3tagger.notification.NotificationManager;
import de.kempkensebastian.mp3tagger.services.FileHandler;

@RunWith(MockitoJUnitRunner.class)
public class EvaluateDirPathStepTest {

    @InjectMocks
    private EvaluateDirPathStep evaluateDirPathStep;

    @Mock
    private NotificationManager notificationManager;

    @Mock
    private FileHandler fileHandler;

    private DataModel dataModel;

    @Before
    public void setUp() throws Exception {
        dataModel = new DataModel();
    }

    @Test
    public void testProcessDirPathOK() {
        Mockito.when(fileHandler.containsConvertableFiles(Mockito.anyString())).thenReturn(true);
        Step result = evaluateDirPathStep.process(dataModel);
        Mockito.verify(notificationManager, Mockito.times(0)).showNotification(Matchers.any(NotificationID.class));
        assertThat(result, is(equalTo(Step.READ_IN_MP3_FILES)));

    }

    @Test
    public void testProcessDirPathError() {
        Mockito.when(fileHandler.containsConvertableFiles(Mockito.anyString())).thenReturn(false);
        Step result = evaluateDirPathStep.process(dataModel);
        Mockito.verify(notificationManager, Mockito.times(1)).showNotification(Matchers.any(NotificationID.class));
        assertThat(result, is(equalTo(Step.STOP_WORKFLOW)));

    }

}
