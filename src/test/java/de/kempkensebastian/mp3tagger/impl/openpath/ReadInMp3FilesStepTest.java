package de.kempkensebastian.mp3tagger.impl.openpath;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.mpatric.mp3agic.Mp3File;
import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.mapper.Mp3FileMapper;
import de.kempkensebastian.mp3tagger.services.FileHandler;

@RunWith(MockitoJUnitRunner.class)
public class ReadInMp3FilesStepTest {

    @InjectMocks
    private ReadInMp3FilesStep readInMp3FilesStep;

    @Mock
    private FileHandler fileHandler;

    @Mock
    private Mp3FileMapper mp3FileMapper;

    @Mock
    private Mp3File mp3File;

    List<Mp3File> listOfMp3Files;

    private DataModel dataModel;

    @Before
    public void setUp() throws Exception {
        dataModel = new DataModel();
        listOfMp3Files = new ArrayList<>();
        listOfMp3Files.add(mp3File);
        Mockito.when(fileHandler.readDirectory(Mockito.anyString())).thenReturn(listOfMp3Files);
    }

    @Test
    public void testProcess() throws Exception {
        Step result = readInMp3FilesStep.process(dataModel);
        assertThat(dataModel.getTagFiles().size(), is(equalTo(listOfMp3Files.size())));
        assertThat(result, is(equalTo(Step.STOP_WORKFLOW)));
    }

}
