/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class SimpleMenu extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double WIDTH = 300.0, HEIGHT = 200.0;

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.getItems().add(exitItem);

        exitItem.setOnAction(event -> {
            primaryStage.close();
        });

        menuBar.getMenus().addAll(fileMenu);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);

        primaryStage.setTitle("Simple Menu Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
