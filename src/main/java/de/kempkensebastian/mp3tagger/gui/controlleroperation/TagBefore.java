package de.kempkensebastian.mp3tagger.gui.controlleroperation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import de.kempkensebastian.mp3tagger.enums.ID3v1;
import de.kempkensebastian.mp3tagger.enums.ID3v2;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface TagBefore {
	ID3v1 iD3v1() default ID3v1.UNDEFINED;
	ID3v2 iD3v2() default ID3v2.UNDEFINED;
}
