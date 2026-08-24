package org.example;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();


        p1.setCodigo("123");
        p1.setCantidadEnStock(10);
        p1.setNombreProducto("Teclado");
        p1.setPrecioProducto(1000);


        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();


        p1.aplicarDescuento(15);
        System.out.println(p1.getPrecioProducto());

        System.out.println("El valor total es: " + p1.calcularValorTotal());

        if(p1.hayStock()){
            System.out.println("Tenemos stock");
        }else{
            System.out.println("No hay stock");
        }

    }
}
