/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author 2279307
 */
public class RotateImage extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 250.0;
        final double SCENE_HEIGHT = 350.0;

        final double HALF_SEC = 500.0;
        final double FROM_ANGLE = 0.0;
        final double TO_ANGLE = 360.0;

        final double PADDING_SPACE = 20.0;

        BorderPane borderPane = new BorderPane();

        Image image = new Image("file:Ace_Diamonds.png");
        ImageView imageView = new ImageView(image);

        RotateTransition rtrans = new RotateTransition(new Duration(HALF_SEC), imageView);
        rtrans.setFromAngle(FROM_ANGLE);
        rtrans.setToAngle(TO_ANGLE);

        borderPane.setCenter(imageView);

        Button spinButton = new Button("Spin");

        spinButton.setOnAction(event -> {
            rtrans.play();
        });

        HBox hbox = new HBox(spinButton);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(PADDING_SPACE));

        borderPane.setBottom(hbox);

        Scene scene = new Scene(borderPane, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("The RotateImage Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
