package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController  implements Initializable{

	@FXML private TableView<Student> table;
	@FXML private TableColumn<Student,Integer> id;
	@FXML private TableColumn<Student,String> name;
	@FXML private TableColumn<Student,String> surname;
	@FXML private TableColumn<Student,Integer> age;
	public ObservableList<Student> list=FXCollections.observableArrayList(
			new Student(1,"abc","d",30),
			new Student(1,"qwe","r",40),
			new Student(1,"asd","f",27),
			new Student(1,"zxc","v",34)
			
			);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	    id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id")); 
	    name.setCellValueFactory(new PropertyValueFactory<Student,String>("name")); 
	    surname.setCellValueFactory(new PropertyValueFactory<Student,String>("surname")); 
	    age.setCellValueFactory(new PropertyValueFactory<Student,Integer>("age")); 
		table.setItems(list);	
	}

}
