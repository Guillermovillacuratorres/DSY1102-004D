package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner entradaNumeros = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);
        int opcion = 0;
        List<Cancion> canciones = new ArrayList<>();

        while(true){
            System.out.println("[1]  - Ver canciones");
            System.out.println("[2]  - Agrega cancion");
            System.out.println("[3]  - Eliminar cancion");
            System.out.println("[4]  - Salir");
            opcion = entradaNumeros.nextInt();


            if(opcion == 1){
                if (canciones.size()==0){
                    System.out.println("No hay canciones");
                }else{
                    for(Cancion i : canciones){
                        System.out.println("Id: " + i.getIdCancion());
                        System.out.println("Nombre: "+i.getNombreCancion());
                        System.out.println("Duracion: "+i.getDuracionCancion());
                        System.out.println("Artista: "+i.getArtistaCancion());

                    }
                }
            }

            if(opcion == 2){
                Cancion c1 = new Cancion();
                System.out.println("Ingrese el id de la cancion: ");
                c1.setIdCancion(entradaNumeros.nextInt());
                System.out.println("Ingrese el nombre de la cancion: ");
                c1.setNombreCancion(entradaTexto.next());
                System.out.println("Ingrese el duracion de la cancion: ");
                c1.setDuracionCancion(entradaNumeros.nextInt());
                System.out.println("Ingrese el artista de la cancion: ");
                c1.setArtistaCancion(entradaNumeros.next());
                canciones.add(c1);
                System.out.println("Cancion agregada correctamente!!!!!!!");
            }


            if(opcion == 3){
                System.out.println("Ingrese el id de la cancion: ");
                int idCancionEliminar = entradaNumeros.nextInt();
                int contador = 0;
                for(Cancion i : canciones){
                    contador++;
                    if(i.getIdCancion() == idCancionEliminar){
                        canciones.remove(i);
                        System.out.println("Cancion eliminada correctamente!!!!!!!");
                        break;
                    }

                }
                System.out.println("Cancion no encontrada!!!!!!!");
            }

            if(opcion == 4){
                System.out.println("Saliendo");
                break;
            }


            if(opcion != 1 && opcion != 2 && opcion != 3){
                System.out.println("opcion incorrecta");
            }


        }


    }
}
