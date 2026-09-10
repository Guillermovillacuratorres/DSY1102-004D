package org.example;

public class Cancion {
    private int idCancion;
    private String nombreCancion;
    private int duracionCancion;
    private String artistaCancion;


    public Cancion(int idCancion, String nombreCancion, int duracionCancion, String artistaCancion) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.duracionCancion = duracionCancion;
        this.artistaCancion = artistaCancion;
    }

    public Cancion() {
    }


    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public int getDuracionCancion() {
        return duracionCancion;
    }

    public void setDuracionCancion(int duracionCancion) {
        this.duracionCancion = duracionCancion;
    }

    public String getArtistaCancion() {
        return artistaCancion;
    }

    public void setArtistaCancion(String artistaCancion) {
        this.artistaCancion = artistaCancion;
    }


    @Override
    public String toString() {
        return "Cancion{" +
                "idCancion=" + idCancion +
                ", nombreCancion='" + nombreCancion + '\'' +
                ", duracionCancion=" + duracionCancion +
                ", artistaCancion='" + artistaCancion + '\'' +
                '}';
    }
}

