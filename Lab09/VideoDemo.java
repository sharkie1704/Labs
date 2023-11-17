/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class VideoDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double WIDTH = 640.0, HEIGHT = 480.0;
        
        File videoFile = new File("TakeOff.mp4");
        Media media = new Media(videoFile.toURI().toString());
        
        MediaPlayer player = new MediaPlayer(media);
        player.setAutoPlay(true);
        
        MediaView view = new MediaView(player);
        
        view.setFitWidth(WIDTH);
        view.setFitHeight(HEIGHT);
        
        HBox hbox = new HBox(view);
        
        Scene scene = new Scene(hbox);
        primaryStage.setTitle("The VideoDemo Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }   
}
