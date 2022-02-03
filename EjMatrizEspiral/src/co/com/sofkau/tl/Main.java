package co.com.sofkau.tl;

public class Main {
    public static void main(String[] args) {

        MatrizEspiral matriz = new MatrizEspiral();
        matriz.crearMatriz();
        matriz.llenarMatrizIzquierdaDerecha();
        matriz.imprimir();
        matriz.llenarMatrizDerechaIzquierda();
        matriz.imprimir();
        matriz.llenarColumnaAscendente();
        matriz.imprimir();
        matriz.llenarColumnaDescendente();
        matriz.imprimir();
    }
}
