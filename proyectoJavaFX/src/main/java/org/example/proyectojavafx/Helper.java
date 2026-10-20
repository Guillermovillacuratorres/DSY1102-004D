package org.example.proyectojavafx;

import javafx.scene.control.Alert;

public class Helper {

    public void mostrarError(String titulo, String subTitulo, String msg ){
        Alert alertError = new Alert(Alert.AlertType.ERROR);
        alertError.setTitle(titulo);
        alertError.setHeaderText(subTitulo);
        alertError.setContentText(msg);
        alertError.show();
    }
}
