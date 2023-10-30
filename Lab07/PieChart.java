/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class PieChart extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double SCENE_WIDTH = 320.0;
        final double SCENE_HEIGHT = 240.0;

        final double X = 160.0;
        final double Y = 120.0;
        final double X_RAD = 100.0;
        final double Y_RAD = 100.0;
        
        final double PIE1_START = 0.0;
        final double PIE1_LENGTH = 45.0;

        final double PIE2_START = 45.0;
        final double PIE2_LENGTH = 90.0;
        
        final double PIE3_START = 135.0;
        final double PIE3_LENGTH = 120.0;
        
        Circle outline = new Circle(X, Y, X_RAD, Color.WHITE);
        outline.setStroke(Color.BLACK);
        
        Arc pieSlice1 = new Arc(X, Y, X_RAD, Y_RAD, PIE1_START, PIE1_LENGTH);
        pieSlice1.setFill(Color.RED);
        pieSlice1.setType(ArcType.ROUND);
        
        Arc pieSlice2 = new Arc(X, Y, X_RAD, Y_RAD, PIE2_START, PIE2_LENGTH);
        pieSlice2.setFill(Color.LIGHTGREEN);
        pieSlice2.setType(ArcType.ROUND);
        
        Arc pieSlice3 = new Arc(X, Y, X_RAD, Y_RAD, PIE3_START, PIE3_LENGTH);
        pieSlice3.setFill(Color.BLACK);
        pieSlice3.setType(ArcType.ROUND);
        
        Pane pane = new Pane(outline, pieSlice1, pieSlice2, pieSlice3);
        
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        
        primaryStage.setTitle("The PieChart Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }  
}
