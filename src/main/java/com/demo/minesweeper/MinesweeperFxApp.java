package com.demo.minesweeper;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MinesweeperFxApp extends Application {
    private Scene scene;


    @Override
    public void start(Stage stage) {
        scene = new Scene(createContent());

        stage.setScene(scene);
        stage.show();
    }

    private Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(200, 50); // Width, Height

        return root;
    }
}
