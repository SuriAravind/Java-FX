package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class MainController {

	@FXML
	private Label result;
	private long number1=0;
	private String operator="";
	private boolean start=true;
	Model model=new Model();
	@FXML
	public void processNumbers(ActionEvent actionEvent)
	{
		if(start)
		{
			result.setText("");
			start=false;
			
		}
		String  value=((Button)actionEvent.getSource()).getText();
		result.setText(result.getText()+value);
	}
	@FXML
	public void processOperators(ActionEvent actionEvent)
	{
		String  value=((Button)actionEvent.getSource()).getText();
		if(!value.equals("="))
		{
			if(!operator.isEmpty())
			return;
			operator=value;
			number1=Long.parseLong(result.getText());
			result.setText("");
		}
		else {
			if(operator.isEmpty())
			 return;
			long number2=Long.parseLong(result.getText());
		    float output=model.caluculate(number1, number2, operator);
		    result.setText(String.valueOf(output));
		    start=true;
		    operator="";
		}
			
	}
}
//
/*
 * Button btnSave = new Button("Save"); Button btnDelete = new Button("Delete");
 * HBox hBox = HBoxBuilder.create() .spacing(30.0) //In case you are using
 * HBoxBuilder .padding(new Insets(5, 5, 5, 5)) .children(btnSave, btnDelete)
 * .build();
 * 
 * hBox.setSpacing(30.0); //In your case
 */