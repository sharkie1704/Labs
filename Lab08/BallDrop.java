/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author 2279307
 */
public class BallDrop extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double SCENE_WIDTH = 300.0;
        final double SCENE_HEIGHT = 300.0;
        
        final double START_X = 150.0, START_Y = 40.0;
        final double END_X = 150.0, END_Y = 250.0;
        final double RADIUS = 50.0;
        
        final double ONE_SEC = 1000.0;
        
        Circle ball = new Circle(RADIUS);
        
        TranslateTransition ttrans = new TranslateTransition(new Duration(ONE_SEC), ball);
        ttrans.setFromX(START_X);
        ttrans.setFromY(START_Y);
        ttrans.setToX(END_X);
        ttrans.setToY(END_Y);
        
        Pane pane = new Pane(ball);
        
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setTitle("The BallDrop Application");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        ttrans.play();
    }

    public static void main(String[] args) {
        launch(args);
    }  
}
