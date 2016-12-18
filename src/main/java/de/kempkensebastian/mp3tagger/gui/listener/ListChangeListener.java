package de.kempkensebastian.mp3tagger.gui.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import de.kempkensebastian.mp3tagger.context.State;
import de.kempkensebastian.mp3tagger.datamodel.DataModel;
import de.kempkensebastian.mp3tagger.datamodel.TagFile;
import de.kempkensebastian.mp3tagger.gui.controller.MainViewController;
import de.kempkensebastian.mp3tagger.gui.controlleroperation.ID3v1ControllerOperation;
import de.kempkensebastian.mp3tagger.gui.controlleroperation.ID3v2ControllerOperation;

@Component
@Scope("prototype")
public class ListChangeListener implements javafx.collections.ListChangeListener<Integer> {

    @Autowired
    private State state;

    @Autowired
    private MainViewController mainViewController;

    @Autowired
    private ID3v1ControllerOperation iD3v1ControllerOperation;

    @Autowired
    private ID3v2ControllerOperation iD3v2ControllerOperation;

    @Override
    public void onChanged(javafx.collections.ListChangeListener.Change<? extends Integer> c) {
        TagFile selectedItem = mainViewController.getTableView().getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            DataModel dataModel = state.getFromState(State.KEY_DATA_MODEL, DataModel.class);
            dataModel.setCurrentTagFile(selectedItem);
            iD3v1ControllerOperation.mapDataModelToGui(selectedItem.getData());
            iD3v2ControllerOperation.mapDataModelToGui(selectedItem.getData());
        }
    }

}
