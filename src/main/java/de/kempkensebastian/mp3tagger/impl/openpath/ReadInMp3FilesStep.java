package de.kempkensebastian.mp3tagger.impl.openpath;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mpatric.mp3agic.Mp3File;

import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.datamodel.TagFile;
import de.kempkensebastian.mp3tagger.enums.Step;
import de.kempkensebastian.mp3tagger.mapper.Mp3FileMapper;
import de.kempkensebastian.mp3tagger.services.FileHandler;
import de.kempkensebastian.mp3tagger.step.AbstractStep;
import de.kempkensebastian.mp3tagger.step.StepTrigger;

@StepTrigger(Step.READ_IN_MP3_FILES)
public class ReadInMp3FilesStep extends AbstractStep{
	
	@Autowired
	private FileHandler fileHandler;
	
	@Autowired
	private Mp3FileMapper mp3FileMapper;

	@Override
	public Step process(DataModel dataModel) {
		List<Mp3File> mp3Files = fileHandler.readDirectory(dataModel.getFilePath());
		dataModel.getTagFiles().clear();
		for (Mp3File mp3File : mp3Files) {
			TagFile mp3TaggingFile = new TagFile();
			mp3FileMapper.mapMp3FileToMp3TaggingFile(mp3File, mp3TaggingFile);
			dataModel.getTagFiles().add(mp3TaggingFile);
		}			
		return Step.STOP_WORKFLOW;
	}
}
