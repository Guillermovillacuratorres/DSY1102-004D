package org.example;

public class Auto extends Vehiculo{
    private int cantidad_puerta;

    public Auto(int cantidad_puerta) {
        this.cantidad_puerta = cantidad_puerta;
    }

    public Auto(String marca, String modelo, String color, int precio, int cantidad_puerta) {
        super(marca, modelo, color, precio);
        this.cantidad_puerta = cantidad_puerta;
    }


    public int getCantidad_puerta() {
        return cantidad_puerta;
    }

    public void setCantidad_puerta(int cantidad_puerta) {
        this.cantidad_puerta = cantidad_puerta;
    }


    @Override
    public void tocar_bocina() {
        System.out.println("piiiiiiiiiiiiiip");
    }
}
