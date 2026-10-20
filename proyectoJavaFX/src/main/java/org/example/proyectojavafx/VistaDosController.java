package org.example.proyectojavafx;

import javafx.fxml.FXML;

public class VistaDosController {

    @FXML
    private void volver(){
        AppNavigator.mostrarVista("vista-uno.fxml", "Vista Uno");
    }
}
