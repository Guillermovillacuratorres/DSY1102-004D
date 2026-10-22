package org.example.proyectojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VistaDosController {

    private final PersonaRepository repo = new PersonaRepository();

    Helper helper = new Helper();

    @FXML
    private void volver(){
        AppNavigator.mostrarVista("vista-uno.fxml", "Vista Uno");
    }



    @FXML
    private TableView<Persona> tblPersonas;

    @FXML
    private TableColumn<Persona, Integer> colId;

    @FXML
    private TableColumn<Persona, String> colNombre;

    @FXML
    private TableColumn<Persona, String> colApellido;

    @FXML
    private Button btnEliminar;


    public void initialize(){
        btnEliminar.setDisable(true);
        colId.setCellValueFactory(new PropertyValueFactory<>("id_persona"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        repo.cargarDesdeJson();
        tblPersonas.setItems(repo.getPersonas());
    }

    @FXML
    private void eliminar(){
        Persona personaSelecionada =  tblPersonas.getSelectionModel().getSelectedItem();
        if(personaSelecionada == null){
            helper.mostrarError("Error","Error de validacion", "No selecciono una persona para eliminar.");
            return;
        }
        repo.eliminar(personaSelecionada);
    }




}
