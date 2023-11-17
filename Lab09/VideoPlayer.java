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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class VideoPlayer extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double WIDTH = 640.0, HEIGHT = 480.0;

        File videoFile = new File("TakeOff.mp4");
        Media media = new Media(videoFile.toURI().toString());

        MediaPlayer player = new MediaPlayer(media);

        player.setOnEndOfMedia(() -> {
            player.stop();
        });

        MediaView view = new MediaView(player);
        view.setFitWidth(WIDTH);
        view.setFitHeight(HEIGHT);

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

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(view);
        borderPane.setBottom(hbox);

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("The VideoPlayer Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
