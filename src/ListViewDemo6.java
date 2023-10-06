/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class ListViewDemo6 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double WIDTH = 425.0, HEIGHT = 200.0;
        
        Image aceSpadesImage = new Image("file:C:\\Users\\2279307\\Pictures\\Ace_Spades.png");
        Image kingSpadesImage = new Image("file:C:\\Users\\2279307\\Pictures\\King_Spades.png");
        Image queenSpadesImage = new Image("file:C:\\Users\\2279307\\Pictures\\Queen_Spades.png");
        
        ImageView aceSpadesIV = new ImageView(aceSpadesImage);
        ImageView kingSpadesIV = new ImageView(kingSpadesImage);
        ImageView queenSpadesIV = new ImageView(queenSpadesImage);
        
        ListView<ImageView> listView = new ListView();
        listView.setPrefSize(WIDTH, HEIGHT);
        listView.setOrientation(Orientation.HORIZONTAL);
        listView.getItems().addAll(aceSpadesIV, kingSpadesIV, queenSpadesIV);
        
        String[] cardNames = {"Ace of Spades", "King of Spades", "Queen of Spades"};
        
        Label outputLabel = new Label("Select a card");
        listView.getSelectionModel().selectedItemProperty().addListener(event -> {
            int index = listView.getSelectionModel().getSelectedIndex();
            outputLabel.setText(cardNames[index]);
        });
        
        VBox vbox = new VBox(10, listView, outputLabel);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    } 
}
