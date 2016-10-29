package address;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
	Stage window;
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("/address/view/RecordOverview.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public Stage getWindow()
	{
		return window;
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}
