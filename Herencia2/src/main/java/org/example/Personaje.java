package org.example;

public abstract class Personaje {
    protected int danio, vida;
    protected String nombre;

    public Personaje() {
    }

    public Personaje(int danio, int vida, String nombre) {
        this.danio = danio;
        this.vida = vida;
        this.nombre = nombre;
    }


    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "danio=" + danio +
                ", vida=" + vida +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    public abstract void caminar();


    public void saludar(){
        System.out.println("Hoola soy un personaje");
    }





}
