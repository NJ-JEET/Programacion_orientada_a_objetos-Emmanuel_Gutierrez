/**
 * Clase que representa la interfaz de la calculadora.
 * Permite al usuario seleccionar una operación matemática y realizarla utilizando una interfaz gráfica.
 */
package edu.emmanuel_gutierrez.reto7.calculadora.ui;

import edu.emmanuel_gutierrez.reto7.calculadora.data.OperacionData;
import edu.emmanuel_gutierrez.reto7.calculadora.process.*;

import javax.swing.*;

public class InterfazCalculadora {
    /**
     * Método principal que inicia la interfaz de la calculadora.
     * Permite al usuario seleccionar una operación y proporciona una interfaz gráfica para ingresar los números.
     */
    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            // Mostrar el menú de operaciones
            String opcionString = JOptionPane.showInputDialog(null,
                    "Seleccione la operación a realizar:\n"
                            + "1. Suma\n"
                            + "2. Resta\n"
                            + "3. Multiplicación\n"
                            + "4. División\n"
                            + "5. Residuo\n"
                            + "6. Raíz cuadrada\n"
                            + "7. Logaritmo\n"
                            + "8. Salir\n");

            int opcion = Integer.parseInt(opcionString);
            double resultado = 0;

            // Realizar la operación seleccionada por el usuario
            if (opcion >= 1 && opcion <= 5) {
                int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                OperacionData datos = new OperacionData(numero1, numero2);
                switch (opcion) {
                    case 1:
                        resultado = new Suma(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        break;
                    case 2:
                        resultado = new Resta(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        break;
                    case 3:
                        resultado = new Multiplicacion(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        break;
                    case 4:
                        resultado = new Division(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        break;
                    case 5:
                        resultado = new Modulo(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        break;
                }
            } else if (opcion == 6) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número:"));
                resultado = new Raiz(numero, 2).ejecutar();
            } else if (opcion == 7) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número:"));
                int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del logaritmo:"));
                resultado = new Logaritmo(numero, base).ejecutar();
            } else if (opcion == 8) {
                salir = true;
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }

            // Mostrar el resultado de la operación
            if (!salir) {
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            }
        }
    }
}