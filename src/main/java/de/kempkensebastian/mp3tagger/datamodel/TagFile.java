package de.kempkensebastian.mp3tagger.datamodel;

import java.util.HashMap;
import java.util.Map;

import de.kempkensebastian.mp3tagger.enums.ID3Tag;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class TagFile {
	
	private String path;
	
	private String fileName;
	
	private Map<ID3Tag,TagPair> data;
	
	private boolean iD3v1Present;
	
	private boolean iD3v2Present;
	
	private BooleanProperty selected = new SimpleBooleanProperty(true);
	
	public TagFile() {
		this.setData(new HashMap<>());
	}
	public TagFile(String fileName) {
		this();
		this.fileName = fileName;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public Map<ID3Tag, TagPair> getData() {
		return data;
	}

	public void setData(Map<ID3Tag, TagPair> data) {
		this.data = data;
	}

	public boolean isiD3v1Present() {
		return iD3v1Present;
	}

	public void setiD3v1Present(boolean iD3v1Present) {
		this.iD3v1Present = iD3v1Present;
	}

	public boolean isiD3v2Present() {
		return iD3v2Present;
	}

	public void setiD3v2Present(boolean iD3v2Present) {
		this.iD3v2Present = iD3v2Present;
	}

	public BooleanProperty isSelected() {
		return selected;
	}

	public void setSelected(BooleanProperty selected) {
		this.selected = selected;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + (iD3v1Present ? 1231 : 1237);
		result = prime * result + (iD3v2Present ? 1231 : 1237);
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		result = prime * result + ((selected == null) ? 0 : selected.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TagFile other = (TagFile) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (iD3v1Present != other.iD3v1Present)
			return false;
		if (iD3v2Present != other.iD3v2Present)
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		if (selected == null) {
			if (other.selected != null)
				return false;
		} else if (!selected.equals(other.selected))
			return false;
		return true;
	}

}
