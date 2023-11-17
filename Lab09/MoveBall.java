/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class MoveBall extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 400.0;
        final double SCENE_HEIGHT = 400.0;

        final double START_X = 200.0, START_Y = 40.0;
        final double RADIUS = 40.0;
        final double STEP = 10.0;

        Circle ball = new Circle(START_X, START_Y, RADIUS);
        ball.setFill(Color.RED);

        Pane pane = new Pane(ball);

        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        scene.setOnKeyPressed(event -> {
            double x = ball.getCenterX();
            double y = ball.getCenterY();
            
            if(event.getCode() == KeyCode.DOWN && y < (SCENE_HEIGHT - RADIUS)) {
                ball.setCenterY(y + STEP);
            }
            
            if (event.getCode() == KeyCode.UP && y > RADIUS) {
                ball.setCenterY(y - STEP);
            }
            
            if (event.getCode() == KeyCode.RIGHT && x < (SCENE_WIDTH - RADIUS)) {
                ball.setCenterX(x + STEP);
            }
            
            if (event.getCode() == KeyCode.LEFT && x > RADIUS) {
                ball.setCenterX(x - STEP);
            }
            
        });
        primaryStage.setTitle("The MoveBall Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
