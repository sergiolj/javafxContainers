package br.edu.ucsal.sergiolj.containers;

import br.edu.ucsal.sergiolj.containers.navigation.Navigation;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Navigation.setStage(stage);
        //Navigation.loadNumKeypadReg();
        Navigation.loadNumKeypadExp();

    }

    public static void main(String[] args) {
        launch();
    }
}