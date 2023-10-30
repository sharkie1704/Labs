/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class Triangle extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 320.0;
        final double SCENE_HEIGHT = 240.0;
        
        final double TOP_X = 160.0;
        final double TOP_Y = 20.0;
        
        final double BOTTOM_RIGHT_X = 310.0;
        final double BOTTOM_RIGHT_Y = 220.0;
        
        final double BOTTOM_LEFT_X = 20.0;
        final double BOTTOM_LEFT_Y = 220.0;

        Line line1 = new Line(TOP_X, TOP_Y, BOTTOM_RIGHT_X, BOTTOM_RIGHT_Y);

        Line line2 = new Line(TOP_X, TOP_Y, BOTTOM_LEFT_X, BOTTOM_LEFT_Y);

        Line line3 = new Line(BOTTOM_LEFT_X, BOTTOM_LEFT_Y, BOTTOM_RIGHT_X, BOTTOM_RIGHT_Y);

        Pane pane = new Pane(line1, line2, line3);

        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("Triangle using Line Class");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
