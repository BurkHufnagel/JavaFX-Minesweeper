package com.demo.minesweeper;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MineSweeperApplication {
    public static void main(String[] args) {
        Application.launch(MinesweeperFxApp.class, args);
    }
}
