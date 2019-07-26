package application;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable {

	@FXML
	public TreeView treeview;
	public Label label;
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> root = new TreeItem<>("Root");
		TreeItem<String> A = new TreeItem<>("A");
		TreeItem<String> B = new TreeItem<>("B");
		TreeItem<String> C = new TreeItem<>("C");
		root.getChildren().addAll(A, B, C);
		TreeItem<String> a = new TreeItem<>("a");
		A.getChildren().add(a);
		TreeItem<String> b = new TreeItem<>("b");
		B.getChildren().add(b);
		TreeItem<String> c = new TreeItem<>("c");
		C.getChildren().add(c);
		treeview.setRoot(root);
   }
   public void mouseclick(MouseEvent event)
   {
	   if(event.getClickCount()==2) {
		   StringBuilder pathBuilder = new StringBuilder();
			for (TreeItem<String> item = (TreeItem<String>) treeview.getSelectionModel().getSelectedItem();
			    item != null ; item = item.getParent()) {

			    pathBuilder.insert(0, item.getValue());
			    pathBuilder.insert(0, "/");
			}
			String path = pathBuilder.toString();
			//System.out.println(((TreeItem<String>) treeview.getSelectionModel().getSelectedItem()).getValue());
			label.setText(path);
	   }
   }
	public void buttonAction(ActionEvent event) {
		StringBuilder pathBuilder = new StringBuilder();
		for (TreeItem<String> item = (TreeItem<String>) treeview.getSelectionModel().getSelectedItem();
		    item != null ; item = item.getParent()) {

		    pathBuilder.insert(0, item.getValue());
		    pathBuilder.insert(0, "/");
		}
		String path = pathBuilder.toString();
		//System.out.println(((TreeItem<String>) treeview.getSelectionModel().getSelectedItem()).getValue());
		label.setText(path);
	}

}
