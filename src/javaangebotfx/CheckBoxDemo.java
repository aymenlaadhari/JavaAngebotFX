/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaangebotfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import com.jfoenix.controls.JFXCheckBox;

/**
 *
 * @author aladhari
 */
public class CheckBoxDemo extends Application {
    public int i = 0;
	public int step = 1;
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane main = new FlowPane();
		main.setVgap(20);
		main.setHgap(20);
		
		CheckBox cb = new CheckBox("CheckBox");
		JFXCheckBox jfxCheckBox = new JFXCheckBox("JFX CheckBox");
		JFXCheckBox customJFXCheckBox = new JFXCheckBox("JFX CheckBox");
		customJFXCheckBox.getStyleClass().add("custom-jfx-check-box");
		
		main.getChildren().add(cb);
		main.getChildren().add(jfxCheckBox);
		main.getChildren().add(customJFXCheckBox);
				
		StackPane pane = new StackPane();
		pane.getChildren().add(main);
		StackPane.setMargin(main, new Insets(100));
		pane.setStyle("-fx-background-color:WHITE");
		
		final Scene scene = new Scene(pane, 600, 200);
		primaryStage.setTitle("JFX CheckBox Demo ");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
