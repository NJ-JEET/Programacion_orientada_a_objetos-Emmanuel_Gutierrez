package edu.emmanuel_gutierrez.reto3.ParImpar.process;

import java.util.Random;

/**
 * Esta clase proporciona métodos para generar números aleatorios,
 * contar la cantidad de pares e impares generados e imprimir los números aleatorios generados organizados por filas y columnas.
 */
public class ParesEImpares {

    /**
     * Genera una matriz de números aleatorios ordenados según lo especificado.
     *
     * @param filas    Número de filas en la matriz.
     * @param columnas Número de columnas en la matriz.
     * @return Una matriz de números aleatorios.
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
     * Cuenta el número de pares e impares generados en la matriz.
     *
     * @param matriz Matriz de números.
     */
    public static void contarParesImpares(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Contar por filas
        for (int i = 0; i < filas; i++) {
            int pares = 0;
            int impares = 0;
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Cantidad de pares: " + pares + ", impares: " + impares + " en la fila " + (i + 1));
        }
        System.out.println(); // Agregar un salto de línea después del conteo por filas

        // Contar por columnas
        for (int j = 0; j < columnas; j++) {
            int pares = 0;
            int impares = 0;
            for (int i = 0; i < filas; i++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Cantidad de pares: " + pares + ", impares: " + impares + " en la columna " + (j + 1));
        }
        System.out.println(); // Agregar un salto de línea después del conteo por columnas
    }

    /**
     * Imprime los números generados aleatoriamente en filas y columnas.
     *
     * @param matriz Matriz de números.
     */
    public static void imprimirNumerosAleatorios(int[][] matriz) {
        System.out.println("Numeros generados de manera aleatoria y organizados en filas y columnas:");
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
