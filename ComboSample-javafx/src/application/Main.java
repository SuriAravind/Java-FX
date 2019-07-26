package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("ComboBoxSample");
		Scene scene = new Scene(new Group(), 450, 250);

		ComboBox emailComboBox = new ComboBox();
		emailComboBox.getItems().addAll("A", "B", "C", "D", "E");
		emailComboBox.setValue("A");
		System.out.println(emailComboBox.getValue());

		GridPane grid = new GridPane();
		grid.setVgap(4);
		grid.setHgap(10);
		grid.setPadding(new Insets(5, 5, 5, 5));
		grid.add(new Label("To: "), 0, 0);
		grid.add(emailComboBox, 1, 0);

		Group root = (Group) scene.getRoot();
		root.getChildren().add(grid);
		stage.setScene(scene);
		stage.show();

	}
}
