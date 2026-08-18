package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void saludar(){
        System.out.println("saludar");
    }

    public static void saludar(String nombre){
        System.out.println("saludar a " + nombre);
    }

    public static int sumar(){
        return 10 + 10;
    }

    static void main() {
        saludar();
        System.out.println(sumar());
        saludar("Pedrito");


        Perro perroUno = new Perro();
        Perro perritoDos = new Perro("Firulais", "quiltro", 3);

        perroUno.setEdad(50);
        System.out.println(perroUno);
        System.out.println(perritoDos);


        perritoDos.correr();

    }
}
