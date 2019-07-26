package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;

public class MainController {

	@FXML public RadioButton rb1;
	@FXML public RadioButton rb2;
	@FXML  public Label label;
 
	public void radioButtonSelected(ActionEvent event) {
		String msg = "";
		if (rb1.isSelected()) {
			msg += rb1.getText() + "\n";
		}
		if (rb2.isSelected()) {
			msg += rb2.getText() + "\n";
		}
		label.setText(msg);

	}

}
