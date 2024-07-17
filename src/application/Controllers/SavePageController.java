package application.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SavePageController {
	@FXML
	Button saveButton;
	
	@FXML
	TextField usernameInput;
	
	@FXML
	TextField passwordInput;
	
	@FXML
	Text progressText;
	
	public void SaveButtonClicked()
	{
		progressText.setText("Encrypting..");
		System.out.println("Save Clicked");
	}
}
