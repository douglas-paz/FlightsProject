package myFlight.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class JanelaFX extends Application {

	public static void main(String[] args) {launch(args);}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("My-Flight");
        primaryStage.setResizable(false);
		primaryStage.setFullScreen(true);
		primaryStage.getIcons().add(new Image("file:images/logo.png"));
		Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.show();

	}
}