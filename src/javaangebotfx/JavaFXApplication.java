/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaangebotfx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXColorPicker;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;

//import demos.MainDemo;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXListView;
import javafx.scene.control.ListView;

/**
 *
 * @author aladhari
 */
public class JavaFXApplication extends Application {

    
    @Override
    public void start(Stage stage) throws Exception {

        
        
       FlowPane main = new FlowPane();
		main.setVgap(20);
		main.setHgap(20);
		
                /*
                Simple date picker
                */
		DatePicker datePicker = new DatePicker();
		main.getChildren().add(datePicker);
                
                /*
                Jfx DatePicker
                */
		JFXDatePicker datePickerFX = new JFXDatePicker();
		main.getChildren().add(datePickerFX);
		datePickerFX.setPromptText("pick a date");
                
                
                 /*
                Jfx DatePicker hours
                */
		JFXDatePicker blueDatePicker = new JFXDatePicker();
		blueDatePicker.setDefaultColor(Color.valueOf("#3f51b5"));
		blueDatePicker.setOverLay(true);
		blueDatePicker.setShowTime(true);
		main.getChildren().add(blueDatePicker);
		
                /*
                color picker
                */
                javafx.scene.control.ColorPicker picker = new javafx.scene.control.ColorPicker(Color.RED);
		picker.getStyleClass().add("button");
		
		
		main.getChildren().add(picker);
                main.getChildren().add(new JFXColorPicker());
                
                
          
                
                
                StackPane pane = new StackPane();
		pane.getChildren().add(main);
		StackPane.setMargin(main, new Insets(100));
                pane.setStyle("-fx-background-color:WHITE");
                
		final Scene scene = new Scene(pane, 400, 700);
//		scene.getStylesheets().add(MainDemo.class.getResource("/resources/css/jfoenix-fonts.css").toExternalForm());
//		scene.getStylesheets().add(MainDemo.class.getResource("/resources/css/jfoenix-design.css").toExternalForm());
		stage.setTitle("JFX Date Picker Demo");
		stage.setScene(scene);
		stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
