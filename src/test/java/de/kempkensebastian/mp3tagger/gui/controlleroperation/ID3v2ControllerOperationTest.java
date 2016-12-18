package de.kempkensebastian.mp3tagger.gui.controlleroperation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import de.kempkensebastian.mp3tagger.datamodel.TagPair;
import de.kempkensebastian.mp3tagger.datamodel.access.TagPairOperation;
import de.kempkensebastian.mp3tagger.enums.ID3Tag;
import de.kempkensebastian.mp3tagger.enums.ID3v2;
import de.kempkensebastian.mp3tagger.gui.controller.ControllerProcessor;
import de.kempkensebastian.mp3tagger.gui.controller.ID3v2Controller;
import de.kempkensebastian.mp3tagger.utils.JavaFXThreadingRule;
import de.kempkensebastian.mp3tagger.utils.TestDataGenerator;
import javafx.scene.control.TextField;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class ID3v2ControllerOperationTest {

    @Mock
    private ControllerProcessor controllerProcessor;

    @InjectMocks
    private ID3v2ControllerOperation controllerOperation;

    @Rule
    public JavaFXThreadingRule rule = new JavaFXThreadingRule();

    private ID3v2Controller controller;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        controller = new ID3v2Controller();
        Field declaredField = controllerOperation.getClass().getDeclaredField("controller");
        declaredField.setAccessible(true);
        declaredField.set(controllerOperation, controller);

        Mockito.when(controllerProcessor.parseGetterAfter(controller))
            .thenReturn(new ControllerProcessor().parseGetterAfter(controller));
        controllerOperation.setUp();
        Mockito.when(controllerProcessor.parseGetterBefore(controller))
            .thenReturn(new ControllerProcessor().parseGetterBefore(controller));
        controllerOperation.setUp();

        List<Field> declaredFields = Arrays.stream(controller.getClass().getDeclaredFields())//
            .filter(f -> f.getType().equals(TextField.class))//
            .collect(Collectors.toList());
        declaredFields.forEach(f -> f.setAccessible(true));

        for (Field field : declaredFields) {
            field.set(controller, new TextField());
        }

    }

    @Test
    public void shouldMapDataModelToGui() throws IllegalArgumentException, IllegalAccessException {
        Map<ID3Tag, TagPair> data = TestDataGenerator.generateID3v2();
        TagPairOperation tagPairOperation = new TagPairOperation(data);
        controllerOperation.mapDataModelToGui(data);
        for (ID3v2 id3v2 : ID3v2.getUsableValues()) {
            String tagValueAfterTagging = controllerOperation.getTagValueAfterTagging(id3v2);
            String tagValueBeforeTagging = controllerOperation.getTagValueBeforeTagging(id3v2);
            assertThat(tagValueAfterTagging, is(equalTo(tagPairOperation.getTagAfterTagging(id3v2))));
            assertThat(tagValueBeforeTagging, is(equalTo(tagPairOperation.getTagBeforeTagging(id3v2))));
        }
    }

    @Test
    public void shouldMapToDataModel() throws IllegalArgumentException, IllegalAccessException {
        Map<ID3Tag, TagPair> expected = TestDataGenerator.generateID3v2();
        TagPairOperation tagPairOperation = new TagPairOperation(expected);
        for (ID3v2 id3v2 : ID3v2.getUsableValues()) {
            controllerOperation.setTagValueAfterTagging(id3v2, tagPairOperation.getTagAfterTagging(id3v2));
            controllerOperation.setTagValueBeforeTagging(id3v2, tagPairOperation.getTagBeforeTagging(id3v2));
        }
        Map<ID3Tag, TagPair> result = new HashMap<>();
        controllerOperation.mapToDataModel(result);
        for (ID3v2 id3v2 : ID3v2.getUsableValues()) {
            assertThat(result.get(id3v2).getValueBeforeTagging(), is(equalTo(expected.get(id3v2).getValueBeforeTagging())));
            assertThat(result.get(id3v2).getValueAfterTagging(), is(equalTo(expected.get(id3v2).getValueAfterTagging())));
        }
    }

    @Test
    public void shouldSetTagValueBeforeTagging() {
        controllerOperation.setTagValueAfterTagging(ID3v2.ALBUM, "album");
        assertThat(controller.getAlbumAfterTagging().getText(), is(equalTo("album")));
    }

    @Test
    public void shouldSetTagValueAfterTagging() {
        controllerOperation.setTagValueBeforeTagging(ID3v2.ALBUM, "album");
        assertThat(controller.getAlbumBeforeTagging().getText(), is(equalTo("album")));
    }

    @Test
    public void shouldGetTagValueAfterTagging() {
        controller.getAlbumAfterTagging().setText("album");
        String result = controllerOperation.getTagValueAfterTagging(ID3v2.ALBUM);
        assertThat(result, is(equalTo("album")));

    }

    @Test
    public void shouldGetTagValueBeforeTagging() {
        controller.getAlbumBeforeTagging().setText("album");
        String result = controllerOperation.getTagValueBeforeTagging(ID3v2.ALBUM);
        assertThat(result, is(equalTo("album")));
    }

}
