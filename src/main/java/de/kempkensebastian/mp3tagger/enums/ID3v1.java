package de.kempkensebastian.mp3tagger.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public enum ID3v1 implements ID3Tag {

    ALBUM,

    ARTIST,

    COMMENT,

    GENRE,

    GENRE_DESCRIPTION,

    TITLE,

    TRACK,

    VERSION,

    YEAR,

    UNDEFINED;

    private static final List<ID3v1> NO_USABLE_VALUE = Collections.unmodifiableList(new ArrayList<ID3v1>() {

        private static final long serialVersionUID = 1L;
        {
            add(UNDEFINED);
        }
    });

    public static List<ID3v1> getUsableValues() {
        return Arrays.stream(values()).filter(i -> !NO_USABLE_VALUE.contains(i)).collect(Collectors.toList());
    }

}
