package de.kempkensebastian.mp3tagger.datamodel;


import de.kempkensebastian.mp3tagger.notification.Notification;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public final class DataModel {
	
	private String filePath;
	
	private ObservableList<TagFile> tagFiles;
	
	private TagFile currentTagFile;

	private Notification notification;
	
	public DataModel() {
		tagFiles = FXCollections.observableArrayList();
	}
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public ObservableList<TagFile> getTagFiles() {
		return tagFiles;
	}

	public void setTagFiles(ObservableList<TagFile> mp3Files) {
		this.tagFiles = mp3Files;
	}

	public TagFile getCurrentTagFile() {
		return currentTagFile;
	}

	public void setCurrentTagFile(TagFile currentMp3TaggingFile) {
		this.currentTagFile = currentMp3TaggingFile;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

}
