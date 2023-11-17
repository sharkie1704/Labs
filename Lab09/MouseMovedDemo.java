/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class MouseMovedDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double SCENE_WIDTH = 300.0;
        final double SCENE_HEIGHT = 200.0;
        
        Label label = new Label("Move the mouse.");
        
        HBox hbox = new HBox(label);
        hbox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(hbox, SCENE_WIDTH, SCENE_HEIGHT);
        
        scene.setOnMouseMoved(event -> {
            double x = event.getSceneX();
            double y = event.getSceneY();
            
            label.setText(String.format("%.0f, %.0f", x, y));
        });
        
        primaryStage.setTitle("The MouseMovedDemo Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }   
}
