package de.kempkensebastian.mp3tagger.impl.openpath;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.io.File;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.enums.Step;
import javafx.stage.DirectoryChooser;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DirChooserStep.class, DirectoryChooser.class})
public class DirChooserStepTest {

    @InjectMocks
    private DirChooserStep step;

    private DirectoryChooser directoryChooser;

    private DataModel dataModel;

    @Before
    public void setUp() throws Exception {
        directoryChooser = PowerMockito.mock(DirectoryChooser.class);
        PowerMockito.whenNew(DirectoryChooser.class).withNoArguments().thenReturn(directoryChooser);
        dataModel = new DataModel();
    }

    @Test
    public void testProcessNoPathChoosen() {
        Mockito.when(directoryChooser.showDialog(null)).thenReturn(null);
        Step result = step.process(dataModel);
        assertThat(result, is(Step.STOP_WORKFLOW));
    }

    @Test
    public void testProcessPathChoosen() {
        File file = Mockito.mock(File.class);
        final String dummyPath = "dummyPath";
        Mockito.when(file.getAbsolutePath()).thenReturn(dummyPath);
        Mockito.when(directoryChooser.showDialog(null)).thenReturn(file);
        Step result = step.process(dataModel);
        assertThat(dataModel.getFilePath(), is(equalTo(dummyPath)));
        assertThat(result, is(Step.EVALUATE_DIR_PATH));
    }

}
