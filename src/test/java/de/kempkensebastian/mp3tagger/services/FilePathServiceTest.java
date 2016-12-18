package de.kempkensebastian.mp3tagger.services;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class FilePathServiceTest {

    private FilePathService filePathService;

    private static final String FILE_ENDING = "Mp3";

    private static final String FILE_NAME = "Artist - Track";

    private static final String FILE_PATH = "/Volumes/A/B/C D/E F/";

    private static final String DUMMY_PATH = FILE_PATH + FILE_NAME + "." + FILE_ENDING;

    @Before
    public void setUp() throws Exception {
        filePathService = new FilePathService();
    }

    @Test
    public void testSeperateFileNameFromPath() throws Exception {
        String[] seperateFileNameFromPath = filePathService.seperateFileNameFromPath(DUMMY_PATH);
        assertThat(seperateFileNameFromPath[FilePathService.INDEX_PATH], is(equalTo(FILE_PATH)));
        assertThat(seperateFileNameFromPath[FilePathService.INDEX_FILE_NAME], is(equalTo(FILE_NAME)));
        assertThat(seperateFileNameFromPath[FilePathService.INDEX_FILE_ENDING], is(equalTo(FILE_ENDING)));
    }

}
