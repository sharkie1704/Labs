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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class ListViewDemo5 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        final double WIDTH = 120.0, HEIGHT = 100.0;
        
        ListView<Integer> listView = new ListView();
        listView.setPrefSize(WIDTH, HEIGHT);
        listView.getItems().addAll(1, 2, 3, 4, 5);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        Label outputLabel = new Label("Select some numbers");
        
        Button totalButton = new Button("Get the total");
        totalButton.setOnAction(event -> {
            if (listView.getSelectionModel().getSelectedIndex() != -1) {
                ObservableList<Integer> selections = listView.getSelectionModel().getSelectedItems();
                int total = 0;
                
                for (int num : selections) {
                    total += num;
                }
                outputLabel.setText(Integer.toString(total));
            } else {
                outputLabel.setText("Noting selected");
            }
        });
        
        VBox vbox = new VBox(10, listView, outputLabel, totalButton);
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
