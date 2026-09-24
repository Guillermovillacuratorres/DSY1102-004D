package org.example;

public class Revista extends  Material{
     private int numeroEdicion;

    public Revista(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public Revista(String codigo, String titulo, int numeroEdicion) {
        super(codigo, titulo);
        this.numeroEdicion = numeroEdicion;
    }

    public Revista() {
    }
    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numeroEdicion=" + numeroEdicion +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", prestado=" + prestado +
                '}';
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public void devolver() {

    }

    @Override
    public int diasMaximoPrestado() {
        return 7;
    }

}
