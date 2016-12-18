package de.kempkensebastian.mp3tagger.context;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.datamodel.TagFile;
import de.kempkensebastian.mp3tagger.datamodel.access.DataModelAccess;
import javafx.collections.FXCollections;

public class StateTest {

    private static final String FILE_NAME = "fileName";

    private static final String DATA_MODEL_KEY = "keyDataModel";

    private State state;

    @Before
    public void setUp() {
        state = new State();
    }

    @Test
    public void testAddAndGetDataModel() {
        DataModel dataModel = new DataModel();
        TagFile mp3File = new TagFile(FILE_NAME);
        dataModel.setTagFiles(FXCollections.observableArrayList(mp3File));
        state.addToState(DATA_MODEL_KEY, dataModel);
        DataModel result = state.getFromState(DATA_MODEL_KEY, DataModel.class);
        assertThat(DataModelAccess.of(result).getMp3FileByFileName(FILE_NAME), is(equalTo(mp3File)));
    }

}
