package org.example.proyectojavafx;

import java.util.List;

public interface PersonaDAO {
    List<Persona> cargar();
    void guardar(List<Persona> personas);
}
