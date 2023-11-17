/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class KeyPressedDemo extends Application {

    private int count = 0;

    @Override
    public void start(Stage primaryStage) {
        
        Label label = new Label("0");
        HBox hbox = new HBox(10, label);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));
        
        Scene scene = new Scene(hbox);
        
        scene.setOnKeyPressed(event -> {
            count++;
            label.setText(String.format("%d", count));
        });
   
        primaryStage.setTitle("The KeyPressedDemo Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
