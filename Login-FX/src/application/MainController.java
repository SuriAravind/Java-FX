package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
    
	@FXML
	private Label lblstatus;
	@FXML
	private TextField txtusername;
	@FXML
	private TextField txtpassword;
	public void loginAction(ActionEvent event)throws Exception
	{
		String username="hi";
		String password = "asd";
		if(txtusername.getText().equals(username)&&txtpassword.getText().equals(password))
		{
			
			Stage primaryStage=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			lblstatus.setText("Login Success");
		}
		else
		{
			lblstatus.setText("Login Failed");
		}
	}
}
