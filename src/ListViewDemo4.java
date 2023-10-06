/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class ListViewDemo4 extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double WIDTH = 120.0, HEIGHT = 140.0;

        ListView<String> listView = new ListView();
        listView.setPrefSize(WIDTH, HEIGHT);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.getItems().addAll("January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December");
        
        ListView<String> listView2 = new ListView();
        listView2.setPrefSize(WIDTH, HEIGHT);
        
        Button getButton = new Button("Get selections");
        getButton.setOnAction(event -> {
            ObservableList<String> selections = listView.getSelectionModel().getSelectedItems();
            listView2.getItems().setAll(selections);
        });
        
        VBox vbox = new VBox(10, listView, listView2, getButton);
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
