/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class FoodFacts extends Application {

    private final double BANANA_CAL = 100.0;
    private final double BANANA_FAT = 0.4;
    private final double BANANA_CARB = 27.0;

    private final double POPCORN_CAL = 31.0;
    private final double POPCORN_FAT = 0.4;
    private final double POPCORN_CARB = 27.0;

    private final double MUFFIN_CAL = 385.0;
    private final double MUFFIN_FAT = 9.0;
    private final double MUFFIN_CARB = 67.0;

    @Override
    public void start(Stage primaryStage) {

        Label promptLabel = new Label("Select a Food");

        RadioButton bananaButton = new RadioButton("1 Banana");
        RadioButton popcornButton = new RadioButton("1 Cup Air-Popped Popcorn");
        RadioButton muffinButton = new RadioButton("1 Large Blueberry Muffin");

        ToggleGroup radioGroup = new ToggleGroup();
        bananaButton.setToggleGroup(radioGroup);
        popcornButton.setToggleGroup(radioGroup);
        muffinButton.setToggleGroup(radioGroup);

        bananaButton.setOnAction(event -> {
            displayFoodFacts("1 Banana", BANANA_CAL, BANANA_FAT, BANANA_CARB);
        });

        popcornButton.setOnAction(event -> {
            displayFoodFacts("1 Cup Air-Popped Popcorn", POPCORN_CAL, POPCORN_FAT, POPCORN_CARB);
        });

        muffinButton.setOnAction(event -> {
            displayFoodFacts("1 Large Blueberry Muffin", MUFFIN_CAL, MUFFIN_FAT, MUFFIN_CARB);
        });

        HBox promptHBox = new HBox(promptLabel);
        promptHBox.setAlignment(Pos.CENTER);

        VBox radioHBox = new VBox(10, bananaButton, popcornButton, muffinButton);

        VBox mainVBox = new VBox(10, promptHBox, radioHBox);
        mainVBox.setAlignment(Pos.CENTER);
        mainVBox.setPadding(new Insets(10));

        Scene scene = new Scene(mainVBox);

        primaryStage.setTitle("Food Facts App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void displayFoodFacts(String food, double cal, double fat, double carb) {

        Label foodLabel = new Label(food);
        Label calLabel = new Label(Double.toString(cal) + " calories");
        Label fatLabel = new Label(Double.toString(fat) + " fat grams");
        Label carbLabel = new Label(Double.toString(carb) + " carb grams");

        VBox labelVBox = new VBox(5, foodLabel, calLabel, fatLabel, carbLabel);
        labelVBox.setAlignment(Pos.CENTER);
        labelVBox.setPadding(new Insets(10));

        Stage foodFactsStage = new Stage();

        Scene foodFactsScene = new Scene(labelVBox);

        foodFactsStage.setScene(foodFactsScene);
        foodFactsStage.setTitle("Food Facts");
        foodFactsStage.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
