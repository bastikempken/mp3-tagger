package de.kempkensebastian.mp3tagger.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public enum ID3v2 implements ID3Tag{
	
	PADDING("Padding",""),
	
	TRACK("Track",""),
	
	PART_OF_SET("Part of Set",""),
	
	GROUPING("Grouping",""),
	
	ARTIST("Artist",""),
	
	ALBUM_ARTIST("Album Artist",""),
	
	TITLE("Title",""),
	
	ALBUM("Album",""),
	
	YEAR("Year",""),
	
	DATE("Date",""),
	
	GENRE("Genre",""),
	
	BPM("BPM",""),
	
	KEY("Key",""),
	
	GENRE_DESCRIPTION("Genre Description",""),
	
	COMMENT("Comment",""),
	
	ITUNES_COMMENT("iTunes Comment",""),
	
	COMPOSER("Composer",""),
	
	PUBLISHER("Publisher",""),
	
	ORIGINAL_ARTIST("Original Artist",""),
	
	COPYRIGHT("Copyright",""),
	
	ARTIST_URL("Artist Url",""),
	
	COMMERCIAL_URL("Commercial Url",""),
	
	COPYRIGHT_URL("Copyright Url",""),
	
	AUDIO_FILE_URL("Audiofile Url",""),
	
	AUDIO_SOURCE_URL("Audio Source Url",""),
	
	RADIOSTATION_URL("Radiostation",""),
	
	PAYMENT_URL("Payment Url",""),
	
	PUBLISHER_URL("Publisher Url",""),
	
	URL("Url",""),
	
	ENCODER("Encoder",""),

	UNDEFINED("Encoder","");
	
	private final String text;
	
	private final String getter;

	private ID3v2(String text, String getter) {
		this.text = text;
		this.getter = getter;
	}
	
private static final List<ID3v2> NO_USABLE_VALUE = Collections.unmodifiableList(new ArrayList<ID3v2>(){
		
		private static final long serialVersionUID = 1L;
		{
			add(UNDEFINED);
		}
	});
	
	public static List<ID3v2> getUsableValues() {
		return Arrays.stream(values())
				.filter(i -> !NO_USABLE_VALUE.contains(i))
				.collect(Collectors.toList());
	}

	public String getText() {
		return text;
	}
	
	
	
	

}
