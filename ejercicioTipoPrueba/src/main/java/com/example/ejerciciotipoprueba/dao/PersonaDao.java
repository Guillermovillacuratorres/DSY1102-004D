package com.example.ejerciciotipoprueba.dao;

import com.example.ejerciciotipoprueba.model.Docente;
import com.example.ejerciciotipoprueba.model.Estudiante;

import java.util.List;

public interface PersonaDao {
    List<Docente> cargarDocentes();
    List<Estudiante>  cargarEstudiantes();

    void guardarDocente(List<Docente> docentes);
    void guardarEstudiante(List<Estudiante> estudiantes);
}
