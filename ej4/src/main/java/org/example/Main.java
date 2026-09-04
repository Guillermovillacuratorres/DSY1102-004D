package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Gerente g1 = new Gerente();
        g1.setNombre("Juanito");
        Vendedor v1 = new Vendedor();
        v1.setNombre("Pedrito");
        Vendedor v2 = new Vendedor();
        v2.setNombre("Dieguito");

        Empresa e1 = new Empresa("Los tres gatitos",g1,v1,v2);
        System.out.println("Vendedor 1: " + e1.getVendedor1().getNombre());
    }
}
