import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class HelloWorld extends Application{
@Override
public void start(Stage primaryStage)
{
	Button btn=new Button("Click Me");
	Button exit=new Button("Exit");
	exit.setOnAction(e->
	{
		System.out.println("Exit from the app");
		System.exit(0);
		
	});
	btn.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
		  System.out.println("Hello world!");
		}
	});
	VBox root=new VBox();
	root.getChildren().addAll(btn,exit);
	Scene scene=new Scene(root, 300, 250);
	primaryStage.setTitle("Hello Wolrd!!");
	primaryStage.setScene(scene);
	primaryStage.show();
   }
  public static void main(String[] args)
  {
	  launch(args);
  }
}
