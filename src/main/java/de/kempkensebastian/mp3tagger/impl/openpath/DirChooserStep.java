package de.kempkensebastian.mp3tagger.impl.openpath;

import java.io.File;

import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.step.AbstractStep;
import de.kempkensebastian.mp3tagger.step.StepTrigger;
import javafx.stage.DirectoryChooser;


@StepTrigger(Step.OPEN_DIRECTOTY_CHOOSER)
public class DirChooserStep extends AbstractStep{

	@Override
	public Step process(DataModel dataModel) {
		DirectoryChooser chooser = new DirectoryChooser();
	    chooser.setTitle("Open File");
	    File file = chooser.showDialog(null);
	    if(file != null){
	    	dataModel.setFilePath(file.getAbsolutePath());
	    }else{
	    	return Step.STOP_WORKFLOW;
	    }
		return Step.EVALUATE_DIR_PATH;
	}

}
