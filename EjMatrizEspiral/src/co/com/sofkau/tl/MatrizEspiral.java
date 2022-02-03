package co.com.sofkau.tl;
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
        System.out.println("Por favor ingresar el nÃºmero de la cantidad de filas de la matriz.");
        cantidadFilas = entrada.nextInt();
        System.out.println("Por favor ingresar el nÃºmero de la cantidad de columnas de la matriz.");
        cantidadColumnas = entrada.nextInt();
        matriz = new int[cantidadFilas][cantidadColumnas];
    }

    public void llenarMatrizIzquierdaDerecha() {
        System.out.println("Desde que nÃºmero desea que se llene la matriz?");
        int contador = entrada.nextInt();
        System.out.println("Por favor ingresar la posiciÃ³n de la fila de inicio.");
        int fila = entrada.nextInt() - 1;

        for (int f = fila; f < fila + 1; f++) {
            for (int c = 0; c < cantidadColumnas; c++) {
                matriz[f][c] = contador++;
            }
        }
    }

    public void llenarMatrizDerechaIzquierda() {
        System.out.println("Desde que nÃºmero desea que se llene la matriz?");
        int contador = entrada.nextInt();
        System.out.println("Por favor ingresar la posiciÃ³n de la fila de inicio.");
        int fila = entrada.nextInt() - 1;

        for (int f = fila; f < fila + 1; f++) {
            for (int c = cantidadColumnas - 1; c >= 0; c--) {
                matriz[f][c] = contador++;
            }
        }
    }

    public void llenarColumnaAscendente() {
        System.out.println("Desde que nÃºmero desea que se llene la matriz?");
        int contador = entrada.nextInt();
        System.out.println("Por favor ingresar la posiciÃ³n de la columna de inicio.");
        int fila = entrada.nextInt() - 1;

        for (int f = fila; f < fila + 1; f++) {
            for (int c = cantidadColumnas - 1; c >= 0; c--) {
                matriz[c][f] = contador++;
            }
        }
    }

    public void llenarColumnaDescendente() {
        System.out.println("Desde que nÃºmero desea que se llene la matriz?");
        int contador = entrada.nextInt();
        System.out.println("Por favor ingresar la posiciÃ³n de la columna de inicio.");
        int fila = entrada.nextInt() - 1;

        for (int f = fila; f < fila + 1; f++) {
            for (int c = 0; c < cantidadColumnas; c++) {
                matriz[c][f] = contador++;
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
