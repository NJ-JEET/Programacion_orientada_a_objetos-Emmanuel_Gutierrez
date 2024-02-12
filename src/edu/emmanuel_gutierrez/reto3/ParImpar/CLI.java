package edu.emmanuel_gutierrez.reto3.ParImpar;

import edu.emmanuel_gutierrez.reto3.ParImpar.process.ParesEImpares;


import javax.swing.JOptionPane;

/**
 * Esta clase incluye un menu donde se solicita al usuario el ingresa el numero de filas y columnas,
 * para asi popder generar una matriz de numero aleatorios, imprimir la matriz y contar el numero de pares e impares,
 * si el usuario ingresa una cantidad diferente para filas y columnas el menu se  repetira hasta que sean equivalentes
 * estos datos que seran guardados en  un vector.
 */
public class CLI {

//Metodo principal  que inicia el programa.
    public static void main(String[] args) {
        int cantidadFilas, cantidadColumnas;

        //Solicita el numer de filas y columnas al usuario.
        do {
            cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la cantidad de filas"));
            cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la cantidad de columnas"));

            if (cantidadFilas != cantidadColumnas) {
                JOptionPane.showMessageDialog(null, "Los valores no son iguales, ingréselos de nuevo");
            }
        } while (cantidadFilas != cantidadColumnas);

        //Genera la matriz de numeros aleatorios y la muestra.
        int[][] matriz = ParesEImpares.generarNumerosAleatorios(cantidadFilas, cantidadColumnas);
        ParesEImpares.imprimirNumerosAleatorios(matriz);

        //Cuenta la cantidad de numero pares e impares.
        ParesEImpares.contarParesImpares(matriz);

        //calcula la suma total de los numeros generados en la matriz.
        int sumaTotal = 0;
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        //Muestra la suma total de los numeros generados en la matriz.
        System.out.println("Suma total de todos los números: " + sumaTotal);
    }
}
