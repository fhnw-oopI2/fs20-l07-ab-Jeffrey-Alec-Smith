package ch.fhnw.oop2.module07.ab1;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class ApplicationUI extends FlowPane{
	
	int counter;
	
	public ApplicationUI() {
		Button button = new Button("Add label");
		button.setOnAction(event -> {
			Label label = new Label("Label " + (++counter));
			getChildren().add(label);
		});
		
		getChildren().add(button);
	}
}
