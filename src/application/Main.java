package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, Color.DARKGREY);
		
		Image icon = new Image("icon.png");
		stage.getIcons().add(icon);
		stage.setTitle("Password Manager");
		stage.setWidth(600);
		stage.setHeight(400);
		stage.setResizable(false);
		
		stage.setScene(scene);
		stage.show();
	}
}
