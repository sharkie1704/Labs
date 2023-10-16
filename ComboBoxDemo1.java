/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class ComboBoxDemo1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        ComboBox<String> comboBox = new ComboBox();
        comboBox.getItems().addAll("England", "Scotland", "Ireland", "Whales");

        Label outputLabel = new Label("Select a country");

        Button button = new Button("Get selection");
        button.setOnAction(event -> {
            outputLabel.setText(comboBox.getValue());
        });

        VBox vbox = new VBox(10, comboBox, outputLabel, button);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
