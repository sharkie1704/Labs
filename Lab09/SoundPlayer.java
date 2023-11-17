/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.File;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class SoundPlayer extends Application {

    @Override
    public void start(Stage primaryStage) {

        File soundFile = new File("guitar.wav");
        Media media = new Media(soundFile.toURI().toString());
        MediaPlayer player = new MediaPlayer(media);

        player.setOnEndOfMedia(()
                -> player.stop());

        Button playButton = new Button("Play");
        Button pauseButton = new Button("Pause");
        Button stopButton = new Button("Stop");

        playButton.setOnAction(event -> {
            player.play();
        });

        pauseButton.setOnAction(event -> {
            player.pause();
        });

        stopButton.setOnAction(event -> {
            player.stop();
        });

        HBox hbox = new HBox(10, playButton, pauseButton, stopButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));

        Scene scene = new Scene(hbox);

        primaryStage.setTitle("The SoundPlayer application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
