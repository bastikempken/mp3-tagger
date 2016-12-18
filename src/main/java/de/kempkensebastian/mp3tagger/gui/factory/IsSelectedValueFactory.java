package de.kempkensebastian.mp3tagger.gui.factory;

import de.kempkensebastian.mp3tagger.datamodel.TagFile;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

public class IsSelectedValueFactory implements Callback<TableColumn.CellDataFeatures<TagFile,CheckBox> , ObservableValue<CheckBox>> {

	@Override
	public ObservableValue<CheckBox> call(CellDataFeatures<TagFile, CheckBox> param) {
		TagFile mp3TaggingFile = param.getValue();
		CheckBox checkBox = new CheckBox();
		checkBox.selectedProperty().setValue(mp3TaggingFile.isSelected().getValue());
		checkBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
					Boolean newValue) {
				mp3TaggingFile.setSelected(new SimpleBooleanProperty(newValue));
			}
		});
		return new SimpleObjectProperty<CheckBox>(checkBox);
	}



	
}
