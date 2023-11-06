/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Ishrak Mellah
 */
public class RotateBox extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 300.0;
        final double SCENE_HEIGHT = 300.0;

        final double X = 50.0, Y = 70.0;
        final double WIDTH = 200.0, HEIGHT = 150.0;
        final double ANGLE = 45.0;

        Rectangle box = new Rectangle(X, Y, WIDTH, HEIGHT);
        box.setRotate(ANGLE);

        Pane pane = new Pane(box);

        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("The RotateBox Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
