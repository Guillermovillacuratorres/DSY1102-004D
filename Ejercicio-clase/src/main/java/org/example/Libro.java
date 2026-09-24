package org.example;

public class Libro extends Material{
    private String autor;

    public Libro(String autor, int diasMaximo) {
        this.autor = autor;
    }

    public Libro(String codigo, String titulo, String autor, int diasMaximo) {
        super(codigo, titulo);
        this.autor = autor;
    }

    public Libro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    @Override
    public int diasMaximoPrestado() {
        return 14;
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public void devolver() {

    }

}
