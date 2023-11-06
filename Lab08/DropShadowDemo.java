/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class DropShadowDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double SCENE_WIDTH = 400.0;
        final double SCENE_HEIGHT = 400.0;

        final double X = 200.0, Y = 200.0, RADIUS = 100.0;
        
        DropShadow dropShadow = new DropShadow();
        
        Circle myCircle = new Circle(X, Y, RADIUS, Color.RED);
        myCircle.setEffect(dropShadow);
        
        Pane pane = new Pane(myCircle);
        
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("The DropShadow Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }  
}
