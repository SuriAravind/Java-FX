package application;

import java.io.File;
import java.util.Collection;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController {

	@FXML
	private ListView listview;
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
    
	public void btn1Action(ActionEvent event)
	{
		FileChooser file=new FileChooser();
		file.setInitialDirectory(new File("C:\\"));
		file.getExtensionFilters().addAll(new ExtensionFilter("png files","*.png"));
		File selectFile=file.showOpenDialog(null); 
		if(selectFile!=null)
		{
			listview.getItems().add(selectFile.getAbsolutePath());
		}
		else
		{
			System.out.println("thers not exist");
		}
	}
	public void btn2Action(ActionEvent event)
	{
		FileChooser file=new FileChooser();
		file.setInitialDirectory(new File("D:\\"));
		file.getExtensionFilters().addAll(new ExtensionFilter("Pdf files","*.pdf"));
		List<File> selectFiles=file.showOpenMultipleDialog(null);
		if(selectFiles!=null)
		{
			for(int i=0;i<selectFiles.size();i++) 
			{
			  listview.getItems().add(selectFiles.get(i).getAbsolutePath());
			}
		}
		else
		{
			System.out.println("thers not exist");
		}
	}
}
