/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class MouseDraggedDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double SCENE_WIDTH = 400.0;
        final double SCENE_HEIGHT = 200.0;
        
        final double CENTER_X = 200.0, CENTER_Y = 100.0;
        final double RADIUS = 40.0;
        
        Circle circle = new Circle(CENTER_X, CENTER_Y, RADIUS);
        
        circle.setOnMouseDragged(event -> {
            double x = event.getSceneX();
            double y = event.getSceneY();
            
            circle.setCenterX(x);
            circle.setCenterY(y);
        });
        
        Pane pane = new Pane(circle);
        
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setTitle("The MouseDraggedDemo Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    } 
}
