package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String txtUno = "hola";
        String txtDos = "hola";
        int edad = 10;
        float altura = 1.72f;
        double peso = 90.85;//soporta mas decimales
        boolean casado = true;
        char genero = 'F';

        if(txtUno.equals(txtDos)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }


        float n1 = 5;
        float n2 = 2;

        System.out.println(n1 / n2);

        System.out.println(5.0/2.0);

        if(casado == true){
            System.out.println("Casado");
        }else{
            System.out.println("No esta casado.");
        }


        if(n1 > n2){
            System.out.println("Es mayor el n1");
        }

        if(edad > 21 && (edad < 21 || edad == 10)){
            System.out.println("Verdadero");
        }else{
            System.out.println("falso");
        }


        System.out.println(2 + 3 * 4);

        int opc = 1;


        if(edad > 21){
            System.out.println();
        }else if(edad > 22){
            System.out.println();
        }else if(edad == 9){
            System.out.println();
        }else{
            System.out.println();
        }


        switch(opc){
            case 1:
                System.out.println("opc 1");
                break;
            case 2:
                System.out.println("opc 2");
                break;
            case 3:
                System.out.println("opc 3");
                break;
        }



        String estadoCivil = casado ? "Esta casado" : "No esta casado";

        System.out.println(estadoCivil);


    }
}


