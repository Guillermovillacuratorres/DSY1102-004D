package org.example;
import java.util.ArrayList;
import java.util.List;

public class Socio {
    public String rut;
    public String nombre;
    public List<Material> listaMaterialesPrestados=new ArrayList<>();

    public Socio(String rut, String nombre, List<Material> listaMaterialesPrestados) {
        this.rut = rut;
        this.nombre = nombre;
        this.listaMaterialesPrestados = listaMaterialesPrestados;
    }

    public Socio() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Material> getListaMaterialesPrestados() {
        return listaMaterialesPrestados;
    }

    public void setListaMaterialesPrestados(List<Material> listaMaterialesPrestados) {
        this.listaMaterialesPrestados = listaMaterialesPrestados;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaMaterialesPrestados=" + listaMaterialesPrestados +
                '}';
    }

    public boolean solicitarPrestamo(Material m){
        if(m.isPrestado()==false && listaMaterialesPrestados.size()<3){
            listaMaterialesPrestados.add(m);
            System.out.println("Material prestado");
            return true;
        }else{
            System.out.println("Material no prestado");
            return false;
        }
    }
    public void devolverMaterial(Material m){
        listaMaterialesPrestados.remove(m);
        m.prestado = false;
        System.out.println("Material devuelto");
    }
}
