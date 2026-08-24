package org.example;

public class Producto {

    private String nombreProducto, codigo;
    private double precioProducto;
    private int cantidadEnStock;


    public Producto() {
    }

    public Producto(String nombreProducto, String codigo, double precioProducto, int cantidadEnStock) {
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.precioProducto = precioProducto;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public String toString() {
        return "org.example.Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", codigo='" + codigo + '\'' +
                ", precioProducto=" + precioProducto +
                ", cantidadEnStock=" + cantidadEnStock +
                '}';
    }


    public double calcularValorTotal(){
        return precioProducto*cantidadEnStock;
    }

    public void aplicarDescuento(double porcentaje){
        //                                  500 * 10  -  0.1
        this.precioProducto = this.precioProducto - (this.precioProducto*(porcentaje/100));
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Codigo: " + codigo);
    }


    public boolean hayStock(){
        if (cantidadEnStock > 0){
            return true;
        }else {
            return  false;
        }
    }
}
