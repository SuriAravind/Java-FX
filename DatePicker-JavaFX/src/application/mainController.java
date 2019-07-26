package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class mainController {

	@FXML public DatePicker dp;
	@FXML public Label label;
	public void showdate(ActionEvent event)
	{
		label.setText(dp.getValue().toString());
	}
}
