/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class InnerShadowDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 300.0;
        final double SCENE_HEIGHT = 300.0;

        final double X = 50.0, Y = 50.0;
        final double WIDTH = 200.0, HEIGHT = 200.0;
        
        InnerShadow innerShadow = new InnerShadow();
        innerShadow.setOffsetX(10);
        innerShadow.setOffsetY(10);
        
        Rectangle box = new Rectangle(X, Y, WIDTH, HEIGHT);
        box.setFill(Color.RED);
        box.setEffect(innerShadow);

        Pane pane = new Pane(box);

        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("The InnerShadow Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
