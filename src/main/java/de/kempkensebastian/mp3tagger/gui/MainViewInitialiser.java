package de.kempkensebastian.mp3tagger.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import de.kempkensebastian.mp3tagger.context.State;
import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.datamodel.TagFile;
import de.kempkensebastian.mp3tagger.gui.controller.MainViewController;
import de.kempkensebastian.mp3tagger.gui.factory.IsSelectedValueFactory;
import de.kempkensebastian.mp3tagger.gui.listener.ListChangeListener;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;

@Component
@Scope("prototype")
public class MainViewInitialiser {
	
	@Autowired
	private State state;
	
	@Autowired
	private ListChangeListener listChangeListener;

	public void iniitTableView(MainViewController mainViewController) {
		mainViewController.getSelected().setCellValueFactory(new IsSelectedValueFactory());
		mainViewController.getFileName().setCellValueFactory(new PropertyValueFactory<TagFile,String>("fileName"));
		mainViewController.getiD3v1Present().setCellValueFactory(f -> new SimpleBooleanProperty(f.getValue().isiD3v1Present()));
		mainViewController.getiD3v1Present().setCellFactory(tc -> new CheckBoxTableCell<>());
		
		mainViewController.getiD3v2Present().setCellValueFactory(f -> new SimpleBooleanProperty(f.getValue().isiD3v2Present()));
		mainViewController.getiD3v2Present().setCellFactory(tc -> new CheckBoxTableCell<>());
		
		DataModel dataModel = state.getFromState(State.KEY_DATA_MODEL, DataModel.class);
		mainViewController.getTableView().setItems(dataModel.getTagFiles());
		mainViewController.getTableView().getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		mainViewController.getTableView().getSelectionModel().getSelectedIndices().addListener(listChangeListener);
	}

}
