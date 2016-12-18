package de.kempkensebastian.mp3tagger.step;

import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.enums.Step;

public abstract class AbstractStep {
	
	public abstract Step process(DataModel dataModel);
}
