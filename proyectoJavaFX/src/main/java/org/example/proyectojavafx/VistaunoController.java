package org.example.proyectojavafx;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class VistaunoController {

    private final PersonaRepository repositorio = new PersonaRepository();

    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    Alert alertError = new Alert(Alert.AlertType.ERROR);


    Helper helper = new Helper();





    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;


    @FXML
    private void salir(){
        Platform.exit();
    }

    @FXML
    private void guardar(){


        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();

        //System.out.println(nombre + " " + apellido);


        if (nombre.isBlank()){
            //alertError.setContentText("");
            helper.mostrarError("Error de validacion", "Agregar usuario","El nombre no debe estar vacio.");
            return;
        }


        JsonPersonaDao pDao = new JsonPersonaDao();
        int idPersona = pDao.cargar().size() + 1;


        repositorio.agregar(new Persona(idPersona,nombre,apellido));
        alert.setTitle("Información");
        alert.setHeaderText("Agregar persona");
        alert.setContentText("Persona agregada correctamente!!!");
        alert.show();

    }

    @FXML
    private void navegarVistaDos(){
        AppNavigator.mostrarVista("vista-dos.fxml","Vista Dos");
    }
}
