package org.example.proyectojavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class PersonaRepository {

    private final PersonaDAO dao = new JsonPersonaDao();
    private final ObservableList<Persona> personas = FXCollections.observableArrayList();


    public ObservableList<Persona> getPersonas(){
        return personas;
    }

    public void cargarDesdeJson(){
        personas.setAll(dao.cargar());
    }

    public void agregar(Persona persona){
        personas.add(persona);
        dao.guardar(new ArrayList<>(personas));
    }

    public void eliminar(Persona persona){
        personas.remove(persona);
        dao.guardar(new ArrayList<>(personas));
    }

}
