package application;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainController implements Initializable {

	@FXML
	public Label label;
	public ComboBox<String> comboid;
	ObservableList<String> list=FXCollections.observableArrayList("mark","john","hari","ram");
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		comboid.setItems(list);
        comboid.setValue(list.get(0));
	}
	public void comboChanged(ActionEvent event)
	{
		String selectedValue=comboid.getValue();
	    label.setText(selectedValue);
	}

}
