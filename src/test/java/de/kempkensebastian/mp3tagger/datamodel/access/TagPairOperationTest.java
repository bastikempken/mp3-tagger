
package de.kempkensebastian.mp3tagger.datamodel.access;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import de.kempkensebastian.mp3tagger.datamodel.TagPair;
import de.kempkensebastian.mp3tagger.enums.ID3Tag;
import de.kempkensebastian.mp3tagger.enums.ID3v1;

public class TagPairOperationTest {

    private static final String TAG_BEFORE_TAGGING = "tagBeforeTagging";

    private static final String TAG_AFTER_TAGGING = "tagAfterTagging";

    private Map<ID3Tag, TagPair> tagValues;

    private TagPairOperation tagPairOperation;

    @Before
    public void setUp() {
        tagValues = new HashMap<>();
        tagValues.put(ID3v1.ALBUM, new TagPair(StringUtils.EMPTY, StringUtils.EMPTY));
        tagPairOperation = new TagPairOperation(tagValues);
    }

    @Test
    public void testSetTagBeforeTagging() {
        assertThat(tagPairOperation.setTagBeforeTagging(ID3v1.ALBUM, StringUtils.EMPTY),
            is(instanceOf(TagPairOperation.class)));
    }

    @Test
    public void testSetTagAfterTagging() {
        assertThat(tagPairOperation.setTagAfterTagging(ID3v1.ALBUM, StringUtils.EMPTY), is(instanceOf(TagPairOperation.class)));
    }

    @Test
    public void testGetTagBeforeTagging() {
        tagPairOperation.setTagBeforeTagging(ID3v1.ALBUM, TAG_BEFORE_TAGGING);
        assertThat(tagPairOperation.getTagBeforeTagging(ID3v1.ALBUM), is(equalTo(TAG_BEFORE_TAGGING)));
    }

    @Test
    public void testGetTagAfterTagging() {
        tagPairOperation.setTagAfterTagging(ID3v1.ALBUM, TAG_AFTER_TAGGING);
        assertThat(tagPairOperation.getTagAfterTagging(ID3v1.ALBUM), is(equalTo(TAG_AFTER_TAGGING)));
    }
}
