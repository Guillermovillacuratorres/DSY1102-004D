package org.example;

public class Vendedor extends Empleado{
    private double comisionPorVenta;
    private int numeroVentas;

    public Vendedor(String nombre, double sueldoBase, double comisionPorVenta, int numeroVentas) {
        super(nombre, sueldoBase);
        this.comisionPorVenta = comisionPorVenta;
        this.numeroVentas = numeroVentas;
    }

    public Vendedor(double comisionPorVenta, int numeroVentas) {
        this.comisionPorVenta = comisionPorVenta;
        this.numeroVentas = numeroVentas;
    }

    public Vendedor() {
    }


    public double getComisionPorVenta() {
        return comisionPorVenta;
    }

    public void setComisionPorVenta(double comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "comisionPorVenta=" + comisionPorVenta +
                ", numeroVentas=" + numeroVentas +
                ", nombre='" + nombre + '\'' +
                ", sueldoBase=" + sueldoBase +
                '}';
    }


}
