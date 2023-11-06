/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author 2279307
 */
public class ScaleTransitionText extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 350.0;
        final double SCENE_HEIGHT = 200.0;

        final double FIVE_SEC = 5000.0;
        final double START_SCALE = 1.0;
        final double END_SCALE = 5.0;
        
        Text text = new Text("Hello World");
        
        ScaleTransition strans = new ScaleTransition(new Duration(FIVE_SEC), text);
        strans.setFromX(START_SCALE);
        strans.setFromY(START_SCALE);
        strans.setToX(END_SCALE);
        strans.setToY(END_SCALE);
        
        HBox hbox = new HBox(text);
        hbox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(hbox, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("The ScaleTransition Application");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        strans.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
