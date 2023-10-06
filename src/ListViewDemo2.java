/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class ListViewDemo2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        ListView<String> listView = new ListView();
        listView.setPrefSize(120, 100);
        listView.getItems().addAll("Steve", "Bethany", "Will", "Katrina");
        
        Label selectedNameLabel = new Label("Select a name");
        
        Button getButton = new Button("Get the selection");
        getButton.setOnAction(event -> {
            if (listView.getSelectionModel().getSelectedIndex() != -1) {
                String selected = listView.getSelectionModel().getSelectedItem();
                selectedNameLabel.setText(selected);
            } else {
                selectedNameLabel.setText("Nothing selected");
            }
        });
        
        VBox vbox = new VBox(10, listView, selectedNameLabel, getButton);
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
