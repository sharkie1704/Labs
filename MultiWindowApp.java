/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class MultiWindowApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label myLabel = new Label("Click the button to see an image.");

        Button myButton = new Button("Click Me");
        myButton.setOnAction(event -> {
            showSecondWindow();
        });

        VBox vbox = new VBox(10, myLabel, myButton);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 300, 100);

        primaryStage.setTitle("Multi Window App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void showSecondWindow() {
        Image image = new Image("file:BeachSunset.jpg");

        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setFitHeight(300);

        VBox vbox = new VBox(imageView);

        Scene secondScene = new Scene(vbox);

        Stage secondStage = new Stage();
        secondStage.setScene(secondScene);
        secondStage.setTitle("Beach Sunset View");
        secondStage.showAndWait();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
