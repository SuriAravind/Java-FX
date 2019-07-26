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

public class MainController {

	@FXML
	public CheckBox cb1;
	@FXML
	public CheckBox cb2;
	@FXML
	public CheckBox cb3;
	@FXML
	public CheckBox cb4;
    @FXML
    public Label label;
    @FXML
    public ListView listview;
	List<String> checkedBox=new ArrayList<>();
	public void checkBoxSelected(ActionEvent event)
	{
		int count=0;
		checkedBox.clear();
		if(cb1.isSelected())
		{
			count++;
			checkedBox.add(cb1.getText());
		}
		if(cb2.isSelected())
		{
			count++;
			checkedBox.add(cb2.getText());
		}
		if(cb3.isSelected())
		{
			count++;
			checkedBox.add(cb3.getText());
		}
		if(cb4.isSelected())
		{
			count++;
			checkedBox.add(cb4.getText());
		}
		label.setText(""+count);
		listview.getItems().add(checkedBox.toString());
		
		
	}

}
