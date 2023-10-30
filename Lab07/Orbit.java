/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class Orbit extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 450.0;
        final double SCENE_HEIGHT = 120.0;

        final double PLANET_X = 224.0;
        final double PLANET_Y = 59.0;
        final double PLANET_RAD = 25.0;

        final double ORBIT_RAD_X = 200.0;
        final double ORBIT_RAD_Y = 50.0;

        final double MOON_X = 24.0;
        final double MOON_Y = 59.0;
        final double MOON_RAD = 10.0;

        Circle planet = new Circle(PLANET_X, PLANET_Y, PLANET_RAD, Color.BLUE);

        Ellipse orbitPath = new Ellipse(PLANET_X, PLANET_Y, ORBIT_RAD_X, ORBIT_RAD_Y);
        orbitPath.setFill(null);
        orbitPath.setStroke(Color.BLACK);

        Circle moon = new Circle(MOON_X, MOON_Y, MOON_RAD, Color.DARKGREY);

        Pane pane = new Pane(planet, orbitPath, moon);

        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("The Orbit Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
