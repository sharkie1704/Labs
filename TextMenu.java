/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class TextMenu extends Application {

    private MenuBar menuBar;
    private Menu fileMenu;
    private Menu textMenu;
    private MenuItem exitItem;
    private RadioMenuItem blackItem;
    private RadioMenuItem redItem;
    private RadioMenuItem greenItem;
    private RadioMenuItem blueItem;
    private RadioMenuItem visibleItem;

    private Label outputLabel;

    @Override
    public void start(Stage primaryStage) {

        final double WIDTH = 300.0, HEIGHT = 200.0;

        outputLabel = new Label("Welcome to Department of Computer Science");
        menuBar = new MenuBar();

        buildFileMenu(primaryStage);

        buildTextMenu();

        menuBar.getMenus().add(fileMenu);
        menuBar.getMenus().add(textMenu);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(outputLabel);

        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void buildFileMenu(Stage primaryStage) {
        fileMenu = new Menu("File");

        exitItem = new MenuItem("Exit");
        exitItem.setOnAction(event -> {
            primaryStage.close();
        });

        fileMenu.getItems().add(exitItem);
    }

    private void buildTextMenu() {
        textMenu = new Menu("Text");

        blackItem = new RadioMenuItem("Black");
        redItem = new RadioMenuItem("Red");
        greenItem = new RadioMenuItem("Green");
        blueItem = new RadioMenuItem("Blue");
        visibleItem = new RadioMenuItem("Visible");

        blackItem.setSelected(true);
        visibleItem.setSelected(true);

        ToggleGroup textToggleGroup = new ToggleGroup();
        blackItem.setToggleGroup(textToggleGroup);
        redItem.setToggleGroup(textToggleGroup);
        greenItem.setToggleGroup(textToggleGroup);
        blueItem.setToggleGroup(textToggleGroup);

        blackItem.setOnAction(event -> {
            outputLabel.setStyle("-fx-text-fill: black");
        });

        redItem.setOnAction(event -> {
            outputLabel.setStyle("-fx-text-fill: red");
        });

        greenItem.setOnAction(event -> {
            outputLabel.setStyle("-fx-text-fill: green");
        });

        blueItem.setOnAction(event -> {
            outputLabel.setStyle("-fx-text-fill: blue");
        });

        visibleItem.setOnAction(event -> {
            if (outputLabel.isVisible()) {
                outputLabel.setVisible(false);
            } else {
                outputLabel.setVisible(true);
            }
        });

        textMenu.getItems().add(blackItem);
        textMenu.getItems().add(redItem);
        textMenu.getItems().add(greenItem);
        textMenu.getItems().add(blueItem);
        textMenu.getItems().add(new SeparatorMenuItem());
        textMenu.getItems().add(visibleItem);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
