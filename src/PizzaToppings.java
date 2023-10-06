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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class PizzaToppings extends Application {

    CheckBox pepperoniCheckBox;
    CheckBox cheeseCheckBox;
    CheckBox anchoviesCheckBox;
    Label totalLabel;

    @Override
    public void start(Stage primaryStage) {
        
        pepperoniCheckBox = new CheckBox("Pepperoni $3.00");
        cheeseCheckBox = new CheckBox("Cheese $2.00");
        anchoviesCheckBox = new CheckBox("Anchovies $1.00");
        
        Button totalButton = new Button("Get total");
        totalButton.setOnAction(new TotalButtonHandler());
        
        totalLabel = new Label("$0.00");
        
        VBox checkBoxVBox = new VBox(10, pepperoniCheckBox, cheeseCheckBox, anchoviesCheckBox);
        VBox mainVBox = new VBox(10, checkBoxVBox, totalButton, totalLabel);
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setPadding(new Insets(10));
        
        Scene scene = new Scene(mainVBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    class TotalButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
        double result = 0;
        
        if(pepperoniCheckBox.isSelected())
            result += 3.0;
        if(cheeseCheckBox.isSelected())
            result += 2.0;
        if(anchoviesCheckBox.isSelected())
            result += 1.0;
        
        totalLabel.setText(String.format("$%.2f", result));
        }      
    }
}