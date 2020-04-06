package ch.fhnw.oop2.module07.ab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(new ApplicationUI(), 500, 500);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
