/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ishrak Mellah
 */
public class StopSign extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 280.0;
        final double SCENE_HEIGHT = 280.0;

        final double X1 = 100.0, Y1 = 20.0;
        final double X2 = 180.0, Y2 = 20.0;
        final double X3 = 260.0, Y3 = 100.0;
        final double X4 = 260.0, Y4 = 180.0;
        final double X5 = 180.0, Y5 = 260.0;
        final double X6 = 100.0, Y6 = 260.0;
        final double X7 = 20.0, Y7 = 180.0;
        final double X8 = 20.0, Y8 = 100.0;

        final double TEXT_X = 50.0;
        final double TEXT_Y = 170.0;
        final double FONT_SIZE = 76.0;

        Polygon octagon = new Polygon(X1, Y1, X2, Y2,
                X3, Y3, X4, Y4,
                X5, Y5, X6, Y6,
                X7, Y7, X8, Y8);
        
        octagon.setFill(Color.RED);
        
        Text stopText = new Text(TEXT_X, TEXT_Y, "STOP");
        stopText.setStroke(Color.WHITE);
        stopText.setFill(Color.WHITE);
        stopText.setFont(new Font("SansSerif", FONT_SIZE));
        
        Pane pane = new Pane(octagon, stopText);
        
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("The StopSign Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
