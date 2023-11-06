/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author 2279307
 */
public class ColorAdjustDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double MIN = -1.0, MAX = 1.0, INITIAL = 0.0;

        ColorAdjust colorAdjust = new ColorAdjust();

        Image image = new Image("file:flower.png");
        ImageView imageView = new ImageView(image);
        imageView.setEffect(colorAdjust);

        Label hueLabel = new Label("       Hue :");
        Label satLabel = new Label("Saturation :");
        Label briLabel = new Label("Brightness :");
        Label conLabel = new Label("  Contrast :");

        hueLabel.setFont(new Font("Courier New", 12));
        satLabel.setFont(new Font("Courier New", 12));
        briLabel.setFont(new Font("Courier New", 12));
        conLabel.setFont(new Font("Courier New", 12));

        Slider hueSlider = new Slider(MIN, MAX, INITIAL);
        hueSlider.setShowTickMarks(true);
        hueSlider.setShowTickLabels(true);
        hueSlider.setMajorTickUnit(0.25f);
        hueSlider.setBlockIncrement(0.1f);

        hueSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            colorAdjust.setHue(newvalue.doubleValue());
        });

        Slider satSlider = new Slider(MIN, MAX, INITIAL);
        satSlider.setShowTickMarks(true);
        satSlider.setShowTickLabels(true);
        satSlider.setMajorTickUnit(0.25f);
        satSlider.setBlockIncrement(0.1f);

        satSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            colorAdjust.setSaturation(newvalue.doubleValue());
        });

        Slider brightSlider = new Slider(MIN, MAX, INITIAL);
        brightSlider.setShowTickMarks(true);
        brightSlider.setShowTickLabels(true);
        brightSlider.setMajorTickUnit(0.25f);
        brightSlider.setBlockIncrement(0.1f);

        brightSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            colorAdjust.setBrightness(newvalue.doubleValue());
        });

        Slider contrastSlider = new Slider(MIN, MAX, INITIAL);
        contrastSlider.setShowTickMarks(true);
        contrastSlider.setShowTickLabels(true);
        contrastSlider.setMajorTickUnit(0.25f);
        contrastSlider.setBlockIncrement(0.1f);

        contrastSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            colorAdjust.setContrast(newvalue.doubleValue());
        });

        HBox hbox = new HBox(imageView);

        BorderPane hueBorderPane = new BorderPane(hueSlider);
        BorderPane satBorderPane = new BorderPane(satSlider);
        BorderPane briBorderPane = new BorderPane(brightSlider);
        BorderPane conBorderPane = new BorderPane(contrastSlider);
        hueBorderPane.setLeft(hueLabel);
        satBorderPane.setLeft(satLabel);
        briBorderPane.setLeft(briLabel);
        conBorderPane.setLeft(conLabel);
        
        VBox vbox = new VBox(10, hueBorderPane, satBorderPane, briBorderPane, conBorderPane);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(hbox);
        borderPane.setBottom(vbox);
        
        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("The ColorAdjust Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
