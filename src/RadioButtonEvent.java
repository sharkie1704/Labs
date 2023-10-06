/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class RadioButtonEvent extends Application {

    @Override
    public void start(Stage primaryStage) {

        Image flowerImage = new Image("file:C:\\Users\\2279307\\Pictures\\Flower.jpg");
        Image sunsetImage = new Image("file:C:\\Users\\2279307\\Pictures\\Sunset.jpg");

        ImageView imageView = new ImageView(flowerImage);

        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);

        HBox imageHBox = new HBox(imageView);
        imageHBox.setAlignment(Pos.CENTER);

        RadioButton flowerRadio = new RadioButton("Flower");
        RadioButton sunsetRadio = new RadioButton("Sunset");

        flowerRadio.setSelected(true);

        ToggleGroup radioGroup = new ToggleGroup();
        flowerRadio.setToggleGroup(radioGroup);
        sunsetRadio.setToggleGroup(radioGroup);

        flowerRadio.setOnAction(event -> {
            imageView.setImage(flowerImage);
        });
        
        sunsetRadio.setOnAction(event -> {
            imageView.setImage(sunsetImage);
        });
        
        VBox radioVBox = new VBox(10, flowerRadio, sunsetRadio);
        radioVBox.setPadding(new Insets(30));
        
        VBox mainVBox = new VBox(10, imageHBox, radioVBox);
        
        Scene scene = new Scene(mainVBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
