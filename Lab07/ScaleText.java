/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ishrak Mellah
 */
public class ScaleText extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double SCENE_WIDTH = 265.0;
        final double SCENE_HEIGHT = 200.0;

        final double X1 = 30.0, Y1 = 100.0;
        final double X2 = 30.0, Y2 = 130.0;
        final double X3 = 30.0, Y3 = 150.0;
        final double FONT_SIZE = 38;
        final double SCALE_HALF = 0.5;
        final double SCALE_QTR = 0.25;
        
        Text text1 = new Text(X1, Y1, "Hello World");
        text1.setFont(new Font("SansSerif", FONT_SIZE));
        
        Text text2 = new Text(X2, Y2, "Hello World");
        text2.setFont(new Font("SansSerif", FONT_SIZE));
        text2.setScaleX(SCALE_HALF);
        text2.setScaleY(SCALE_HALF);
        
        Text text3 = new Text(X3, Y3, "Hello World");
        text3.setFont(new Font("SansSerif", FONT_SIZE));
        text3.setScaleX(SCALE_QTR);
        text3.setScaleY(SCALE_QTR);
        
        Pane pane = new Pane(text1, text2, text3);
        
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        
        primaryStage.setTitle("The ScaleText Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    } 
}
