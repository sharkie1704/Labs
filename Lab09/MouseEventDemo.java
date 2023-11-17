/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class MouseEventDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 400.0;
        final double SCENE_HEIGHT = 200.0;

        final double CENTER_X = 200.0, CENTER_Y = 100.0;
        final double RADIUS = 40.0;

        Circle ball = new Circle(CENTER_X, CENTER_Y, RADIUS);

        ball.setOnMouseEntered(event -> {
            ball.setFill(Color.RED);
        });

        ball.setOnMouseExited(event -> {
            ball.setFill(Color.BLACK);
        });

        ball.setOnMousePressed(event -> {
            ball.setFill(Color.GREEN);
        });

        Pane pane = new Pane(ball);

        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
