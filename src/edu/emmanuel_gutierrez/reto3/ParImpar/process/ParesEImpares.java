package edu.emmanuel_gutierrez.reto3.ParImpar.process;

import java.util.Random;

/**
 * Esta clase proporciona metodos para generar numeros aleatorios,
 * contar la cantidad de pares e inpares generados y
 * imprime los numeros aleatorios generados organizados por filas y columnas intrducidas por el ususario.
 */
public class ParesEImpares {

    /**
     * Genera una matriz de numeros aleatorios ordenados segun lo especificado.
     * @param filas Numero de filas en la matriz.
     * @param columnas Numero de columnas en la matriz.
     * @return Una matriz de numeros aleatorios.
     */
    public static int[][] generarNumerosAleatorios(int filas, int columnas) {
        Random aleatorio = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
            }
        }
        return matriz;
    }

    /**
     * Cuenta el numero de pares e imparez generados en la matriz.
     * @param matriz Matriz de numeros.
     */
    public static void contarParesImpares(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int pares = 0;
            int impares = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Cantidad de pares: " + pares + ", impares: " + impares + " en la fila " + (i + 1));
        }
    }

    /**
     * Imprime los numerdos generados aleatoriamente en filas y columnas.
     * @param matriz Matriz de numeros.
     */
    public static void imprimirNumerosAleatorios(int[][] matriz) {
        System.out.println("Numeros generados de manera aleatoria y organizados en filas y columnas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
