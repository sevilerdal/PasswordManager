package application.Controllers;

import application.Models.GeneratePassword;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class GeneratorController {

	GeneratePassword generator;
	
	@FXML
	private Button saveNewPasswordButton;
	
	@FXML
	private TextField passwordDisplay;
	
	@FXML
	private Text passwordTip;
	
	public void GenerateButtonClicked()
	{
		System.out.println("Generate Button");
		generator = new GeneratePassword();
		String password = generator.Generate(12);
		passwordDisplay.setText(password);
		passwordDisplay.setVisible(true);
		passwordTip.setVisible(true);
		saveNewPasswordButton.setVisible(true);
	}
	
	public void CopyPassword()
	{
		System.out.println("Copy password");
	}
	
	public void SaveButtonClicked()
	{
		System.out.println("Save new password button");
	}
}
