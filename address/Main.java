package address;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
	private Stage window;
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		window = primaryStage;
		
		Parent root = FXMLLoader.load(getClass().getResource("/address/view/RecordOverview.fxml"));
		
		Scene scene = new Scene(root);
		window.setTitle("Example");
		window.setScene(scene);
		window.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
