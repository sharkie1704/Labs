/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class BullsEye extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 640.0;
        final double SCENE_HEIGHT = 480.0;
        
        final double CENTER_X = 320.0;
        final double CENTER_Y = 240.0;
        
        final double RING1_RADIUS = 240.0;
        final double RING2_RADIUS = 150.0;
        final double RING3_RADIUS = 75.0;
        final double RING4_RADIUS = 25.0;

        Circle ring1 = new Circle(CENTER_X, CENTER_Y, RING1_RADIUS, Color.BLACK);
        Circle ring2 = new Circle(CENTER_X, CENTER_Y, RING2_RADIUS, Color.RED);
        Circle ring3 = new Circle(CENTER_X, CENTER_Y, RING3_RADIUS, Color.BLACK);
        Circle ring4 = new Circle(CENTER_X, CENTER_Y, RING4_RADIUS, Color.RED);

        Pane pane = new Pane(ring1, ring2, ring3, ring4);

        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("The BullsEye Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
