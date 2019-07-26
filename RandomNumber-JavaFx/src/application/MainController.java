package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController 
{
	@FXML
	private Label mymessage;
	public void generateRandom(ActionEvent actionEvent) {
		Random rand = new Random();
		int myrand = rand.nextInt(50) + 1;
		mymessage.setText(Integer.toString(myrand));
	}
}