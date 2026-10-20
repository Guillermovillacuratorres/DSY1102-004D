package org.example.proyectojavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppNavigator {
    private static Stage mainStage;

    public static void setMainStage(Stage stage){
        mainStage = stage;
    }

    public static void mostrarVista(String fxml, String titulo){
        try{
            Parent root = FXMLLoader.load(AppNavigator.class.getResource(fxml));
            mainStage.setTitle(titulo);
            mainStage.setScene(new Scene(root,800,600));
            mainStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
