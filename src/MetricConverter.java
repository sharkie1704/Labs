/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class MetricConverter extends Application {

    private TextField kiloTextField;
    private Label resultLabel;
    private RadioButton milesButton;
    private RadioButton feetButton;
    private RadioButton inchesButton;

    @Override
    public void start(Stage primaryStage) {

        Label promptLabel = new Label("Enter a distance in kilometers:");
        kiloTextField = new TextField();

        milesButton = new RadioButton("Convert to miles");
        feetButton = new RadioButton("convert to feet");
        inchesButton = new RadioButton("convert to inches");

        milesButton.setSelected(true);

        ToggleGroup radioGroup = new ToggleGroup();
        milesButton.setToggleGroup(radioGroup);
        feetButton.setToggleGroup(radioGroup);
        inchesButton.setToggleGroup(radioGroup);

        Button calcButton = new Button("Convert");
        calcButton.setOnAction(new CalcButtonHandler());

        resultLabel = new Label();

        HBox promptHBox = new HBox(10, promptLabel, kiloTextField);
        HBox radioHBox = new HBox(20, milesButton, feetButton, inchesButton);

        VBox mainVBox = new VBox(10, promptHBox, radioHBox, calcButton, resultLabel);
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setPadding(new Insets(10));

        Scene scene = new Scene(mainVBox);
        primaryStage.setTitle("Metric Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    class CalcButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            final double MILES_CONVERSION = 0.6214;
            final double FEET_CONVERSION = 3281.0;
            final double INCHES_CONVERSION = 39370.0;
            
            double result = 0;
            double kilometers = Double.parseDouble(kiloTextField.getText());
            
            if(milesButton.isSelected())
                result = kilometers * MILES_CONVERSION;
            if(feetButton.isSelected())
                result = kilometers * FEET_CONVERSION;
            if(inchesButton.isSelected())
                result = kilometers * INCHES_CONVERSION;
            
            resultLabel.setText(String.format("%.2f", result));
        }
    }
}
