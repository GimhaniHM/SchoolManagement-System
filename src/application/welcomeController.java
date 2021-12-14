package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class welcomeController {
	@FXML
	private Button browse;
	
	private Scene scene;
	private Parent root;
	
	Stage stage;
	
	public void browseTo(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("loging.fxml"));
		root = loader.load();
		
		loginController object = loader.getController();
		object.displayLogingInfor();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		scene = new Scene(root);
		stage.setScene(new Scene(root));
		stage.show();
	}
	

}
