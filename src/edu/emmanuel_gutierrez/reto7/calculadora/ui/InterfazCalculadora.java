package edu.emmanuel_gutierrez.reto7.calculadora.ui;

import edu.emmanuel_gutierrez.reto7.calculadora.data.OperacionData;
import edu.emmanuel_gutierrez.reto7.calculadora.process.*;

import javax.swing.*;

public class InterfazCalculadora {
    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            String opcionString = JOptionPane.showInputDialog(null,
                    """
                            Seleccione la operación a realizar:
                            1. Suma
                            2. Resta
                            3. Multiplicación
                            4. División
                            5. Residuo
                            6. Raíz
                            7. Logaritmo
                            8. Potencia
                            9. Salir
                            """);

            int opcion = Integer.parseInt(opcionString);
            double resultado = 0;

            if (opcion >= 1 && opcion <= 5) {
                int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                OperacionData datos = new OperacionData(numero1, numero2);
                switch (opcion) {
                    case 1:
                        resultado = new Suma(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, "La suma de " + datos.getNumero1() + " + " + datos.getNumero2() + " es: " + resultado);
                        break;
                    case 2:
                        resultado = new Resta(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, "La resta de " + datos.getNumero1() + " - " + datos.getNumero2() + " es: " + resultado);
                        break;
                    case 3:
                        resultado = new Multiplicacion(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, "La multiplicación de " + datos.getNumero1() + " * " + datos.getNumero2() + " es: " + resultado);
                        break;
                    case 4:
                        resultado = new Division(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, "La división de " + datos.getNumero1() + " / " + datos.getNumero2() + " es: " + resultado);
                        break;
                    case 5:
                        resultado = new Modulo(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, "El residuo de " + datos.getNumero1() + " / " + datos.getNumero2() + " es: " + resultado);
                        break;
                }
            } else if (opcion == 6) {
                double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número:"));
                int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice de la raíz:"));
                resultado = new Raiz(numero, indice).ejecutar();
                JOptionPane.showMessageDialog(null, "La raíz " + indice + " de " + numero + " es: " + resultado);
            } else if (opcion == 7) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número:"));
                int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del logaritmo:"));
                resultado = new Logaritmo(numero, base).ejecutar();
                JOptionPane.showMessageDialog(null, "El logaritmo de " + numero + " en base " + base + " es: " + resultado);
            } else if (opcion == 8) {
                int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base:"));
                int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente:"));
                resultado = new Potencia(base, exponente).ejecutar();
                JOptionPane.showMessageDialog(null, base + " elevado a la " + exponente + " es: " + resultado);
            } else if (opcion == 9) {
                salir = true;
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
