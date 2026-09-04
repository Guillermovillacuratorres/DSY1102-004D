package org.example;

public class Empresa {
    private String nombreEmpresa;
    private Empleado gerente;
    private Empleado vendedor1;
    private Empleado vendedor2;

    public Empresa(String nombreEmpresa, Empleado gerente, Empleado vendedor1, Empleado vendedor2) {
        this.nombreEmpresa = nombreEmpresa;
        this.gerente = gerente;
        this.vendedor1 = vendedor1;
        this.vendedor2 = vendedor2;
    }

    public Empresa() {
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Empleado getGerente() {
        return gerente;
    }

    public void setGerente(Empleado gerente) {
        this.gerente = gerente;
    }

    public Empleado getVendedor1() {
        return vendedor1;
    }

    public void setVendedor1(Empleado vendedor1) {
        this.vendedor1 = vendedor1;
    }

    public Empleado getVendedor2() {
        return vendedor2;
    }

    public void setVendedor2(Empleado vendedor2) {
        this.vendedor2 = vendedor2;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", gerente=" + gerente +
                ", vendedor1=" + vendedor1 +
                ", vendedor2=" + vendedor2 +
                '}';
    }
}
