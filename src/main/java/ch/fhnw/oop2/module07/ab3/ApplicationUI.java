package ch.fhnw.oop2.module07.ab3;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox{
	
	int counter;
	
	public ApplicationUI() {
		TextField textField = new TextField("Slider Value:");
		Slider slider = new Slider(0, 10, 5);
		StringConverter<Number> converter = new NumberStringConverter();
		textField.textProperty().bindBidirectional(slider.valueProperty(), converter);
		
		getChildren().add(textField);
		getChildren().add(slider);
	}
}
