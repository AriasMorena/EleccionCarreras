package eleccioncarreras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ELECCIONCARRERAS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        arbolBinario arbol = new arbolBinario();

        int opcion;

        do {

            System.out.println("\nOrientador Vocacional");

            System.out.println("1- Contruir árbol");
            System.out.println("2- Consultar carrera");
            System.out.println("3- Salir");
            System.out.println("Seleccione una opció1n: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    arbol.crearArbol();
                    break;

                case 2:
                    arbol.recomendarCarrera();
                    break;

                case 3:
                    System.out.println("Programa Finalizado");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 3);
    }
}
