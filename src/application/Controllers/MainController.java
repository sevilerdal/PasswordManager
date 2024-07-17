package application.Controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void SavePasswordClicked(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("../Views/SavePassword.fxml"));
		stage =(Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void ViewPasswordClicked(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("SavePassword.fxml"));
		stage =(Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();	
	}
	
	public void GeneratePasswordClicked(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("../Views/GeneratePassword.fxml"));
		stage =(Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();	
	}
}
