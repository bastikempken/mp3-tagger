package de.kempkensebastian.mp3tagger.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.kempkensebastian.mp3tagger.datamodel.TagFile;
import de.kempkensebastian.mp3tagger.enums.Action;
import de.kempkensebastian.mp3tagger.gui.MainViewInitialiser;
import de.kempkensebastian.mp3tagger.workflow.WorkflowManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

@Component
public class MainViewController implements Initializable{
	
	@Autowired
	private WorkflowManager workflowManager;
	
	@Autowired
	private MainViewInitialiser mainViewInitialiser;
	
	@FXML
	private ID3v2Controller id3v2PaneController; 

	@FXML
	private ID3v1Controller id3v1PaneController;
	
	@FXML
	private TextField fileNameOfSelection;
	
	@FXML
	private TableView<TagFile> tableView;
	
	@FXML
	private TableColumn<TagFile, CheckBox> selected;
	
	@FXML
    private TableColumn<TagFile, String> fileName;
	
	@FXML
	private TableColumn<TagFile, Boolean> iD3v1Present;
	
	@FXML
	private TableColumn<TagFile, Boolean> iD3v2Present;
	
	@FXML
	protected void openButtonPressed(){
		workflowManager.getWorkflow(Action.OPEN_FILE_PATH).handleWorklflow();
	}
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mainViewInitialiser.iniitTableView(this);
	}


	public MainViewInitialiser getMainViewInitialiser() {
		return mainViewInitialiser;
	}


	public void setMainViewInitialiser(MainViewInitialiser mainViewInitialiser) {
		this.mainViewInitialiser = mainViewInitialiser;
	}


	public TableView<TagFile> getTableView() {
		return tableView;
	}


	public void setTableView(TableView<TagFile> tableView) {
		this.tableView = tableView;
	}


	public TableColumn<TagFile, CheckBox> getSelected() {
		return selected;
	}


	public void setSelected(TableColumn<TagFile, CheckBox> selected) {
		this.selected = selected;
	}


	public TableColumn<TagFile, String> getFileName() {
		return fileName;
	}


	public void setFileName(TableColumn<TagFile, String> fileName) {
		this.fileName = fileName;
	}


	public TableColumn<TagFile, Boolean> getiD3v1Present() {
		return iD3v1Present;
	}


	public void setiD3v1Present(TableColumn<TagFile, Boolean> iD3v1Present) {
		this.iD3v1Present = iD3v1Present;
	}


	public TableColumn<TagFile, Boolean> getiD3v2Present() {
		return iD3v2Present;
	}


	public void setiD3v2Present(TableColumn<TagFile, Boolean> iD3v2Present) {
		this.iD3v2Present = iD3v2Present;
	}


	public TextField getFileNameOfSelection() {
		return fileNameOfSelection;
	}


	public void setFileNameOfSelection(TextField fileNameOfSelection) {
		this.fileNameOfSelection = fileNameOfSelection;
	}
}
