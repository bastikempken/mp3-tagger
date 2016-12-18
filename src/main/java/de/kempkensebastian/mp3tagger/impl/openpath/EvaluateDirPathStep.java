package de.kempkensebastian.mp3tagger.impl.openpath;

import org.springframework.beans.factory.annotation.Autowired;

import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.notification.NotificationID;
import de.kempkensebastian.mp3tagger.notification.NotificationManager;
import de.kempkensebastian.mp3tagger.services.FileHandler;
import de.kempkensebastian.mp3tagger.step.AbstractStep;
import de.kempkensebastian.mp3tagger.step.StepTrigger;

@StepTrigger(Step.EVALUATE_DIR_PATH)
public class EvaluateDirPathStep extends AbstractStep {
	
	@Autowired
	private NotificationManager notificationManager;
	
	@Autowired
	private FileHandler fileHandler;
	
	@Override
	public Step process(DataModel dataModel) {
		if(fileHandler.containsConvertableFiles(dataModel.getFilePath())){
			return Step.READ_IN_MP3_FILES;
		}
		notificationManager.showNotification(NotificationID.NOTIFY_001);
		return Step.STOP_WORKFLOW;	
	}
}
