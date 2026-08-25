package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("El nombre es : " + nombre);




        Guerrero g1 = new Guerrero();
        Guerrero g2 = new Guerrero(20,100,"Maestro Yi",false);



        Mago m1 = new Mago();
        Mago m2 = new Mago(30,100,"Jax",false);


        Personaje g3 = new Guerrero();
        Personaje m3 = new Mago();

        g3.saludar();
        m3.saludar();


        if(m3 instanceof Mago){
            System.out.println("Es un mago");
        }

        System.out.println(g1);
        System.out.println(g2);


        System.out.println(m1);
        System.out.println(m2);



        while(true){
            System.out.println("[1] - Saludar");
            System.out.println("[2] - Conversar");
            System.out.println("[3] - Salir");

            int opc =  sc.nextInt();

            if(opc == 1){
                System.out.println("Hola, como estas?");
            }else if(opc == 2){
                System.out.println("Bien y tu?");
            }else if(opc == 3){
                System.out.println("Saliendo de la app.....");
                break;
            }else{
                System.out.println("Opcion no valida!!");
            }
        }






    }
}
