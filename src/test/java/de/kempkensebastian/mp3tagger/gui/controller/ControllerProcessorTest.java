package de.kempkensebastian.mp3tagger.gui.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.lang.invoke.MethodHandle;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import de.kempkensebastian.mp3tagger.enums.ID3Tag;
import de.kempkensebastian.mp3tagger.enums.ID3v1;
import de.kempkensebastian.mp3tagger.enums.ID3v2;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class ControllerProcessorTest {

    private ID3v1Controller id3v1Controller;

    private ID3v2Controller id3v2Controller;

    private ControllerProcessor controllerProcessor;

    @Before
    public void setUp() throws Exception {
        id3v1Controller = new ID3v1Controller();
        id3v2Controller = new ID3v2Controller();
        controllerProcessor = new ControllerProcessor();
    }

    @Test
    @Parameters(source = ID3v1.class)
    public void shouldParseAllMethodForBeforeTagging(ID3v1 id3v1) {
        if (id3v1.equals(ID3v1.UNDEFINED))
            return;
        Map<ID3Tag, MethodHandle> getterBeforeTagging = controllerProcessor.parseGetterBefore(id3v1Controller);
        assertThat(getterBeforeTagging.containsKey(id3v1), is(true));
    }

    @Test
    @Parameters(source = ID3v1.class)
    public void shouldParseAllMethodForAfterTagging(ID3v1 id3v1) {
        if (id3v1.equals(ID3v1.UNDEFINED))
            return;
        Map<ID3Tag, MethodHandle> getterAfterTagging = controllerProcessor.parseGetterAfter(id3v1Controller);
        assertThat(getterAfterTagging.containsKey(id3v1), is(true));
    }

    @Test
    @Parameters(source = ID3v2.class)
    public void shouldParseAllMethodForBeforeTagging(ID3v2 id3v2) {
        if (id3v2.equals(ID3v2.UNDEFINED))
            return;
        Map<ID3Tag, MethodHandle> getterBeforeTagging = controllerProcessor.parseGetterBefore(id3v2Controller);
        assertThat(getterBeforeTagging.containsKey(id3v2), is(true));
    }

    @Test
    @Parameters(source = ID3v2.class)
    public void shouldParseAllMethodForAfterTagging(ID3v2 id3v2) {
        if (id3v2.equals(ID3v2.UNDEFINED))
            return;
        Map<ID3Tag, MethodHandle> getterAfterTagging = controllerProcessor.parseGetterAfter(id3v2Controller);
        assertThat(getterAfterTagging.containsKey(id3v2), is(true));
    }
}
