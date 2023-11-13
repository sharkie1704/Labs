/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Point3D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import static javafx.scene.transform.Transform.rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author 2279307
 */
public class Assignment2 extends Application {

    @Override
    public void start(Stage primaryStage) {

        final double SCENE_WIDTH = 500.0;
        final double SCENE_HEIGHT = 400.0;

        final double X = 160.0;
        final double Y = 120.0;
        final double X_RAD_CIRCLE = 100.0;
        final double X_RAD_CIRCLE2 = 90.0;

        final double X_RAD_FAN = 90.0;
        final double Y_RAD_FAN = 90.0;

        final double FAN1_START = 0.0;
        final double FAN1_LENGTH = 40.0;

        final double FAN2_START = 90.0;
        final double FAN2_LENGTH = 40.0;

        final double FAN3_START = 180.0;
        final double FAN3_LENGTH = 40.0;

        final double FAN4_START = 270.0;
        final double FAN4_LENGTH = 40.0;

        final double MIN = 0.0;
        final double MAX = 100.0;
        final double INITIAL = 20.0;

        final double HALF_SEC = 500.0;
        final double FROM_ANGLE = 0.0;

        Button pause = new Button("Pause");
        Button resume = new Button("Resume");
        Button reverse = new Button("Reverse");

        Slider speedSlider = new Slider(MIN, MAX, INITIAL);
        speedSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            //qqch.setqqch(newvalue.doubleValue())
        });

        HBox commonButtons = new HBox(pause, resume, reverse);
        commonButtons.setAlignment(Pos.CENTER);
        commonButtons.setPadding(new Insets(10));

        //First Fan
        Circle circle1 = new Circle(X, Y, X_RAD_CIRCLE, Color.WHITE);
        circle1.setStroke(Color.BLACK);

        Arc fanSlice11 = new Arc(X, Y, X_RAD_FAN, Y_RAD_FAN, FAN1_START, FAN1_LENGTH);
        fanSlice11.setFill(Color.RED);
        fanSlice11.setType(ArcType.ROUND);

        Arc fanSlice12 = new Arc(X, Y, X_RAD_FAN, Y_RAD_FAN, FAN2_START, FAN2_LENGTH);
        fanSlice12.setFill(Color.RED);
        fanSlice12.setType(ArcType.ROUND);

        Arc fanSlice13 = new Arc(X, Y, X_RAD_FAN, Y_RAD_FAN, FAN3_START, FAN3_LENGTH);
        fanSlice13.setFill(Color.RED);
        fanSlice13.setType(ArcType.ROUND);

        Arc fanSlice14 = new Arc(X, Y, X_RAD_FAN, Y_RAD_FAN, FAN4_START, FAN4_LENGTH);
        fanSlice14.setFill(Color.RED);
        fanSlice14.setType(ArcType.ROUND);

        
        Pane paneFan1 = new Pane(circle1, fanSlice11, fanSlice12, fanSlice13, fanSlice14);
        paneFan1.setPadding(new Insets(10));

        GridPane gridPaneFan1 = new GridPane();
        gridPaneFan1.addRow(0, commonButtons);
        gridPaneFan1.addRow(1, paneFan1);

        RotateTransition rtrans = new RotateTransition(Duration.millis(2000), paneFan1);
        rtrans.setFromAngle(FROM_ANGLE);
        rtrans.setToAngle(360);
        rtrans.setInterpolator(Interpolator.LINEAR);
        rtrans.setCycleCount(Animation.INDEFINITE);
        rtrans.play();


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Second Fan
        Circle circle2 = new Circle(X, Y, X_RAD_CIRCLE, Color.WHITE);
        circle2.setStroke(Color.BLACK);

        Arc fanSlice21 = new Arc(X, Y, X_RAD_FAN, Y_RAD_FAN, FAN1_START, FAN1_LENGTH);
        fanSlice21.setFill(Color.RED);
        fanSlice21.setType(ArcType.ROUND);

        Arc fanSlice22 = new Arc(X, Y, X_RAD_FAN, Y_RAD_FAN, FAN2_START, FAN2_LENGTH);
        fanSlice22.setFill(Color.RED);
        fanSlice22.setType(ArcType.ROUND);

        Arc fanSlice23 = new Arc(X, Y, X_RAD_FAN, Y_RAD_FAN, FAN3_START, FAN3_LENGTH);
        fanSlice23.setFill(Color.RED);
        fanSlice23.setType(ArcType.ROUND);

        Arc fanSlice24 = new Arc(X, Y, X_RAD_FAN, Y_RAD_FAN, FAN4_START, FAN4_LENGTH);
        fanSlice24.setFill(Color.RED);
        fanSlice24.setType(ArcType.ROUND);

        Pane paneFan2 = new Pane(circle2, fanSlice21, fanSlice22, fanSlice23, fanSlice24);
        paneFan2.setPadding(new Insets(10));

        GridPane gridPaneFan2 = new GridPane();
        //gridPaneFan2.addRow(0, commonButtons);
        gridPaneFan2.addRow(1, paneFan2);

        pause.setOnAction(event -> {
            rtrans.stop();
           
        });

        resume.setOnAction(event -> {
            rtrans.play();
            
        });

        reverse.setOnAction(event -> {
            rtrans.setAutoReverse(true);
            rtrans.play();
        });

        Button startAll = new Button("Start All");
        Button stopAll = new Button("Stop All");

        startAll.setOnAction(event -> {

        });

        stopAll.setOnAction(event -> {

        });

//        HBox fansHBox = new HBox(gridPaneFan1, gridPaneFan2);
//        fansHBox.setAlignment(Pos.CENTER);
//        fansHBox.setPadding(new Insets(10));
//
//        GridPane finalGridPane = new GridPane();
//        finalGridPane.add(fansHBox, 0, 0);
        Scene scene = new Scene(gridPaneFan1, SCENE_WIDTH, SCENE_HEIGHT);

        primaryStage.setTitle("Ishrak Mellah's Assignment02 Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
