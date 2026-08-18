package org.example;

//Clase padre no se debe instanciar (abstract)
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int precio;


    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
    //Metodos abstractos no tienen cuerpo de desarrollo
    public abstract void tocar_bocina();
}
