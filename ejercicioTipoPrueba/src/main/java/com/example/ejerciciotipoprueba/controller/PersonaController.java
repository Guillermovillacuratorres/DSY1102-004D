package com.example.ejerciciotipoprueba.controller;

import com.example.ejerciciotipoprueba.model.Docente;
import com.example.ejerciciotipoprueba.model.Estudiante;
import com.example.ejerciciotipoprueba.model.Persona;
import com.example.ejerciciotipoprueba.repository.PersonaRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PersonaController {

    private static final String TIPO_DOCENTE = "Docente";
    private static final String TIPO_ESTUDIANTE = "Estudiante";

    private final PersonaRepository personaRepository = new PersonaRepository();
    private final ObservableList<Persona> personas = FXCollections.observableArrayList();

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtSueldo;

    @FXML
    private TextField txtNivel;

    @FXML
    private ComboBox<String> cmbTipo;

    @FXML
    private TableView<Persona> tblPersonas;

    @FXML
    private TableColumn colId;

    @FXML
    private TableColumn colNombre;

    @FXML
    private TableColumn colCasado;

    @FXML
    private TableColumn colEdad;

    @FXML
    private CheckBox chbCasado;



    @FXML
    public void initialize(){
        cmbTipo.getItems().setAll(TIPO_DOCENTE, TIPO_ESTUDIANTE);
    }




    @FXML
    public void agregar(){
        String  tipoPersona = cmbTipo.getValue();
        Persona persona;

        try{
            int idPersona = personaRepository.listar().size() + 1;
            int edad =  Integer.parseInt(txtEdad.getText());
            String nombre = txtNombre.getText();
            boolean casado =  chbCasado.isSelected();

            if (TIPO_DOCENTE.equals(tipoPersona)){
                String titulo = txtTitulo.getText();
                int sueldo = Integer.parseInt(txtSueldo.getText());

                Docente docenteNuevo = new Docente(idPersona,edad,nombre,casado,titulo,sueldo);
                persona = docenteNuevo;
            }else{
                String nivel =  txtNivel.getText();
                persona = new Estudiante(idPersona,edad,nombre,casado,nivel);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }

        try{
            personaRepository.agregar(persona);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        personas.setAll(personaRepository.listar());



    }

    @FXML
    public void eliminar(){

    }

    @FXML
    public void cambiarTipo(){

    }

}
