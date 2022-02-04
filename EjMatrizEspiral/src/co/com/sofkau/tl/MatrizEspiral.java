package co.com.sofkau.tl;

import javax.swing.*;
import java.util.Scanner;

// TODO: 2/02/2022 mÃ©todo para recorrer fila izq-der LISTO
// TODO: 2/02/2022 mÃ©todo para recorrer fila der-izq LISTO
// TODO: 2/02/2022 mÃ©todo para recorrer columna desc LISTO
// TODO: 2/02/2022 mÃ©todo para recorrer columna asc LISTO
// TODO: 2/02/2022 mÃ©todo para solicitar tamaÃ±o de matriz a llenar LISTO
// TODO: 2/02/2022 mÃ©todo para imprimir la matriz LISTO
// TODO: 2/02/2022 mÃ©todo para integrar todas las funcionalidades anteriores por medio de un menÃº que se comunique con el usuario

public class MatrizEspiral {

    Scanner entrada = new Scanner(System.in);
    int[][] matriz;
    int cantidadFilas;
    int cantidadColumnas;

    public void crearMatriz() {

        do {
            System.out.println("Por favor ingresar el número de la cantidad de columnas de la matriz.");
            cantidadColumnas = entrada.nextInt();
        }
        while (cantidadColumnas < 1 || cantidadColumnas > 50);

        do {
            System.out.println("Por favor ingresar el número de la cantidad de filas de la matriz.");
            cantidadFilas = entrada.nextInt();
        }
        while (cantidadFilas < 1 || cantidadFilas > 50);

        matriz = new int[cantidadFilas][cantidadColumnas];
    }

    public void llenarMatrizIzquierdaDerecha() {
        System.out.println("Izquierda derecha");
        System.out.println("Desde que número desea que se llene la matriz?");
        int contador = entrada.nextInt();
        System.out.println("Por favor ingresar la posición de la fila de inicio.");
        int fila = entrada.nextInt() - 1;

        for (int f = fila; f < fila + 1; f++) {
            for (int c = 0; c < cantidadColumnas; c++) {
                if (matriz[f][c] == 0) {
                    matriz[f][c] = contador++;
                }
            }
        }
    }

    public void llenarMatrizDerechaIzquierda() {
        System.out.println("Derecha izquierda");
        System.out.println("Desde que número desea que se llene la matriz?");
        int contador = entrada.nextInt();
        System.out.println("Por favor ingresar la posición de la fila de inicio.");
        int fila = entrada.nextInt() - 1;

        for (int f = fila; f < fila + 1; f++) {
            for (int c = cantidadColumnas - 1; c >= 0; c--) {
                if (matriz[f][c] == 0) {
                    matriz[f][c] = contador++;
                }
            }
        }
    }

    public void llenarColumnaAscendente() {
        System.out.println("Columna Ascendente");
        System.out.println("Desde que número desea que se llene la matriz?");
        int contador = entrada.nextInt();
        System.out.println("Por favor ingresar la posición de la columna de inicio.");
        int fila = entrada.nextInt() - 1;

        for (int f = fila; f < fila + 1; f++) {
            for (int c = cantidadColumnas - 1; c >= 0; c--) {
                if (matriz[c][f] == 0) {
                    matriz[c][f] = contador++;
                }
            }
        }
    }

    public void llenarColumnaDescendente() {
        System.out.println("Columna descendente");
        System.out.println("Desde que número desea que se llene la matriz?");
        int contador = entrada.nextInt();
        System.out.println("Por favor ingresar la posición de la columna de inicio.");
        int fila = entrada.nextInt() - 1;

        for (int f = fila; f < fila + 1; f++) {
            for (int c = 0; c < cantidadColumnas; c++) {
                if (matriz[c][f] == 0) {
                    matriz[c][f] = contador++;
                }
            }
        }
    }

    public void mostrarMenu() {
        int seleccion = 0;
        while (seleccion != 5) {
            do {
                System.out.println("Por favor escoja un método para llenar la matriz " + matriz.length + "X" + matriz[0].length);
                System.out.println("1. Recorrer fila de izquierda a derecha.");
                System.out.println("2. Recorrer fila de derecha a izquierda.");
                System.out.println("3. Recorrer columna de arriba a abajo.");
                System.out.println("4. Recorrer columna de abajo a arriba.");
                System.out.println("5. Salir.");

                seleccion = entrada.nextInt();
            } while (seleccion < 1 || seleccion > 5);
            switch (seleccion) {
                case 1:
                    llenarMatrizIzquierdaDerecha();
                    imprimir();
                    break;
                case 2:
                    llenarMatrizDerechaIzquierda();
                    imprimir();
                    break;
                case 3:
                    llenarColumnaAscendente();
                    imprimir();
                    break;
                case 4:
                    llenarColumnaDescendente();
                    imprimir();
                    break;
                case 5:
                    System.out.println("Fin del juego. Gracias");
                    break;

                default:
                    System.out.println("Ingresar una opción valida");

            }
        }
    }

    public void imprimir() {
        System.out.println("Matriz:");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

}
