package org.example.proyectojavafx;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonPersonaDao implements PersonaDAO{

    private final String RUTA = "personas.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public List<Persona> cargar() {
        if(!new File(RUTA).exists()){
            return new ArrayList<>();
        }
        try(FileReader reader = new FileReader(RUTA)){
            Persona[] arreglo = gson.fromJson(reader,Persona[].class);
            if (arreglo == null){
                return new ArrayList<>();
            }
            return new ArrayList<>(Arrays.asList(arreglo));
        }catch (IOException | JsonSyntaxException e){
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public void guardar(List<Persona> personas) {
        try(FileWriter writer = new FileWriter(RUTA)){
            gson.toJson(personas,writer);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}


