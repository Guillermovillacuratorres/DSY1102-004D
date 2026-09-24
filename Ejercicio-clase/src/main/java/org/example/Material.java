package org.example;

public abstract class Material implements Prestable {
    protected String codigo;
    protected String titulo;
    protected boolean prestado;

    public Material() {
    }

    public Material(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        }
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }



    @Override
    public String toString() {
        return "Material{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", prestado=" + prestado +
                '}';
    }

    public abstract int diasMaximoPrestado();



}
