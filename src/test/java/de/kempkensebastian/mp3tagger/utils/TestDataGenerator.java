package de.kempkensebastian.mp3tagger.utils;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.RandomStringUtils;
import de.kempkensebastian.mp3tagger.datamodel.TagPair;
import de.kempkensebastian.mp3tagger.enums.ID3Tag;
import de.kempkensebastian.mp3tagger.enums.ID3v1;
import de.kempkensebastian.mp3tagger.enums.ID3v2;

public class TestDataGenerator {

    public static Map<ID3Tag, TagPair> generateID3v1() {
        Map<ID3Tag, TagPair> data = new HashMap<>();
        for (ID3v1 id3v1 : ID3v1.getUsableValues()) {
            TagPair tagPair = new TagPair(RandomStringUtils.randomAlphabetic(30), RandomStringUtils.randomAlphabetic(30));
            data.put(id3v1, tagPair);
        }
        return data;
    }

    public static Map<ID3Tag, TagPair> generateID3v2() {
        Map<ID3Tag, TagPair> data = new HashMap<>();
        for (ID3v2 id3v2 : ID3v2.getUsableValues()) {
            TagPair tagPair = new TagPair(RandomStringUtils.randomAlphabetic(30), RandomStringUtils.randomAlphabetic(30));
            data.put(id3v2, tagPair);
        }
        return data;
    }

}
