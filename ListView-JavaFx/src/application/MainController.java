package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable{

	@FXML
	public Label label;
	public ListView listview;
	ObservableList<String> list=FXCollections.observableArrayList("mark","john","hari","ram");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listview.setItems(list);
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
	
	public void buttonAction(ActionEvent event)
	{
		ObservableList<String> listNames;
		listNames=listview.getSelectionModel().getSelectedItems();
	    String selectedNames="";
		for(String name:listNames)
	    {
	    	selectedNames=selectedNames+name+" ";
	    }
		label.setText(selectedNames);
	}
}
