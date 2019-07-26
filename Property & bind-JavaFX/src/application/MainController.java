package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class MainController implements Initializable{

	MyNumber myno=new MyNumber();
	@FXML
	public Label label;
	@FXML
	public ProgressBar pgbar;
	@FXML
	public ProgressIndicator pgind;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myno.setNumber(0.0);
		myno.numberProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
				label.setText(new Double(myno.getNumber()).toString());
			}
		});
		pgbar.progressProperty().bind(myno.numberProperty());
		pgind.progressProperty().bind(myno.numberProperty());
		
	}
	public void btnClick(ActionEvent event)
	{
		myno.setNumber(myno.getNumber()+0.1);
	}
	public void btn2Click(ActionEvent event)
	{
		myno.setNumber(myno.getNumber()-0.1);
		     	
	}
}
