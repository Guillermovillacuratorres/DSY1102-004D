package com.example.ejerciciotipoprueba.repository;

import com.example.ejerciciotipoprueba.dao.JsonPersonaDao;
import com.example.ejerciciotipoprueba.dao.PersonaDao;
import com.example.ejerciciotipoprueba.dao.PersonaMysqlDao;
import com.example.ejerciciotipoprueba.model.Docente;
import com.example.ejerciciotipoprueba.model.Estudiante;
import com.example.ejerciciotipoprueba.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaRepository {
    //private final PersonaDao dao = new JsonPersonaDao();
    private final PersonaMysqlDao dao =  new PersonaMysqlDao();
    private final List<Persona> personas = new ArrayList<>();


    public void cargar(){
     personas.clear();
     personas.addAll(dao.listarPersonas());
    }


    public List<Persona> listar(){
        return new ArrayList<>(personas);
    }


    public void guardar(){
        List<Docente> docentes = new ArrayList<>();
        List<Estudiante> estudiantes = new ArrayList<>();
        for (Persona p : personas){
            if (p instanceof Docente){
                docentes.add((Docente) p);
            }else if (p instanceof Estudiante){
                estudiantes.add((Estudiante) p);
            }
        }
      //  dao.guardarDocente(docentes);
      //  dao.guardarEstudiante(estudiantes);
    }

    public void agregar(Persona persona){
//        personas.add(persona);
  //      try {
    //        guardar();
      //  }catch (Exception e){
        //    System.out.println(e.getMessage());
          //  personas.remove(persona);
        //}
        dao.insertar(persona);
        cargar();
    }

    public void eliminar(Persona persona){
        //int posicion =  personas.indexOf(persona);
        //if (posicion < 0){
      //      return;
     //   }
      //  personas.remove(posicion);
    //    try{
    //        guardar();
      //  }catch (Exception e){
     //       System.out.println(e.getMessage());
      //      personas.add(persona);
     //   }

        dao.eliminar(persona.getIdPersona());
        cargar();
    }

    public void editar(Persona persona){
        dao.editar(persona);
        cargar();
    }

}
