package de.kempkensebastian.mp3tagger.datamodel;

import org.apache.commons.lang3.tuple.MutablePair;

public abstract class AbstractTagPair <S> {
	
	MutablePair<S, S> pair;
	
	public AbstractTagPair(S valueBeforeTagging, S valueAfterTagging) {
		this.pair = MutablePair.of(valueBeforeTagging, valueAfterTagging);
	}
	
	public S getValueBeforeTagging(){
		return pair.getLeft();
	}
	
	public S getValueAfterTagging(){
		return pair.getRight();
	}
	
	public void setValueBeforeTagging(S value){
		pair.setLeft(value);
	}
	
	public void setValueAfterTagging(S value){
		pair.setRight(value);
	}

}
