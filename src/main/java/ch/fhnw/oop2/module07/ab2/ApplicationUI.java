package ch.fhnw.oop2.module07.ab2;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox{
	
	int counter;
	
	public ApplicationUI() {
		Label label = new Label("Slider Value:");
		Slider slider = new Slider(0, 10, 5);
		slider.valueProperty().addListener(
				(obs, oldValue, newValue) -> label.setText("Slider Value: " + newValue.toString())
				);
		
		getChildren().add(label);
		getChildren().add(slider);
	}
}
