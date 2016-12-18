package de.kempkensebastian.mp3tagger.services;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import com.mpatric.mp3agic.Mp3File;

@RunWith(PowerMockRunner.class)
@PrepareForTest(FileHandler.class)
public class FileHandlerTest {

    private static final String PATH = "dummypath";

    @InjectMocks
    private FileHandler fileHandler;

    @Mock
    private File fileDirectory;

    @Mock(answer = Answers.CALLS_REAL_METHODS)
    private FilePathService filePathService;

    @Mock
    private Mp3File mp3File;

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Before
    public void setUp() throws Exception {
        PowerMockito.whenNew(File.class).withArguments(PATH).thenReturn(fileDirectory);
        PowerMockito.whenNew(Mp3File.class).withAnyArguments().thenReturn(mp3File);
    }

    @Test
    public void testReadDirectory() throws IOException {
        Mockito.when(fileDirectory.listFiles()).thenReturn(new File[] {folder.newFile("test.mp3")});
        List<Mp3File> mp3Files = fileHandler.readDirectory(PATH);
        assertThat(mp3Files.get(0), is(mp3File));

    }

    @Test
    public void containsConvertableFilesTrue() throws IOException {
        File[] directoryContent = new File[] {folder.newFile("test.mp3"), folder.newFile("test.xml")};
        Mockito.when(fileDirectory.listFiles()).thenReturn(directoryContent);
        boolean result = fileHandler.containsConvertableFiles(PATH);
        assertThat(result, is(equalTo(true)));
    }

    @Test
    public void containsConvertableFilesFalse() throws IOException {
        File[] directoryContent = new File[] {folder.newFile("test.txt"), folder.newFile("test.xml")};
        Mockito.when(fileDirectory.listFiles()).thenReturn(directoryContent);
        boolean result = fileHandler.containsConvertableFiles(PATH);
        assertThat(result, is(equalTo(false)));
    }

}
