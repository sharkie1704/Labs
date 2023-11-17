/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.File;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author 2279307
 */
public class MediaDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        File videoFile = new File("sample.mp4");
        Media media = new Media(videoFile.toURI().toString());
        MediaPlayer player = new MediaPlayer(media);
        MediaView view = new MediaView(player);

        Button playButton = new Button(">");
        playButton.setOnAction(event -> {
            if (playButton.getText().equals(">")) {
                player.play();
                playButton.setText("||");
            } else {
                player.pause();
                playButton.setText(">");
            }
        });

        Button rewindButton = new Button("<<");
        rewindButton.setOnAction(event -> player.seek(Duration.ZERO));

        Slider slVolume = new Slider();
        slVolume.setPrefWidth(150);
        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
        slVolume.setMinWidth(30);
        slVolume.setValue(50);

        player.volumeProperty().bind(slVolume.valueProperty().divide(100));

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(playButton, rewindButton, new Label("Volume"), slVolume);

        BorderPane pane = new BorderPane();
        pane.setCenter(view);
        pane.setBottom(hbox);

        Scene scene = new Scene(pane, 650, 500);
        primaryStage.setTitle("The MediaDemo Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
