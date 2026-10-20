package org.example.proyectojavafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class StartApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        AppNavigator.setMainStage(stage);
        AppNavigator.mostrarVista("vista-uno.fxml","Vista 1");
    }
}
