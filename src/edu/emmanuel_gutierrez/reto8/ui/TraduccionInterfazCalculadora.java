package edu.emmanuel_gutierrez.reto8.ui;

import edu.emmanuel_gutierrez.reto7.calculadora.data.OperacionData;
import edu.emmanuel_gutierrez.reto7.calculadora.process.*;
import edu.emmanuel_gutierrez.reto8.data.Idioma;
import edu.emmanuel_gutierrez.reto8.data.SeleccionIdioma;

import javax.swing.*;

public class TraduccionInterfazCalculadora {
    public static void main(String[] args) {
        Idioma idioma = SeleccionIdioma.seleccionarIdioma();

        boolean salir = false;
        while (!salir) {
            String opcionString = JOptionPane.showInputDialog(null, idioma.getMenu());
            int opcion = Integer.parseInt(opcionString);
            double resultado = 0;

            if (opcion >= 1 && opcion <= 5) {
                int numero1 = Integer.parseInt(JOptionPane.showInputDialog(idioma.getEnterFirstNumberMessage()));
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog(idioma.getEnterSecondNumberMessage()));
                OperacionData datos = new OperacionData(numero1, numero2);
                switch (opcion) {
                    case 1:
                        resultado = new Suma(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, idioma.getAdditionResultMessage(numero1, numero2, resultado));
                        break;
                    case 2:
                        resultado = new Resta(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, idioma.getSubtractionResultMessage(numero1, numero2, resultado));
                        break;
                    case 3:
                        resultado = new Multiplicacion(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, idioma.getMultiplicationResultMessage(numero1, numero2, resultado));
                        break;
                    case 4:
                        resultado = new Division(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, idioma.getDivisionResultMessage(numero1, numero2, resultado));
                        break;
                    case 5:
                        resultado = new Modulo(datos.getNumero1(), datos.getNumero2()).ejecutar();
                        JOptionPane.showMessageDialog(null, idioma.getRemainderResultMessage(numero1, numero2, resultado));
                        break;
                }
            } else if (opcion == 6) {
                double numero = Double.parseDouble(JOptionPane.showInputDialog(idioma.getEnterNumberMessage()));
                int indice = Integer.parseInt(JOptionPane.showInputDialog(idioma.getRootIndex()));
                resultado = new Raiz(numero, indice).ejecutar();
                JOptionPane.showMessageDialog(null, idioma.getSquareRootMessage(numero, indice, resultado));
            } else if (opcion == 7) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(idioma.getEnterNumberMessage()));
                int base = Integer.parseInt(JOptionPane.showInputDialog(idioma.getLogarithmBaseMessage()));
                resultado = new Logaritmo(numero, base).ejecutar();
                JOptionPane.showMessageDialog(null, idioma.getLogarithmMessage(numero, base, resultado));
            } else if (opcion == 8) {
                int base = Integer.parseInt(JOptionPane.showInputDialog(idioma.getEnterNumberMessage()));
                int exponente = Integer.parseInt(JOptionPane.showInputDialog(idioma.getEnterExponentMessage()));
                resultado = new Potencia(base, exponente).ejecutar();
                JOptionPane.showMessageDialog(null, idioma.getPowerMessage(base, exponente, resultado));
            } else if (opcion == 9) {
                salir = true;
                JOptionPane.showMessageDialog(null, idioma.getGoodbyeMessage());
            } else {
                JOptionPane.showMessageDialog(null, idioma.getInvalidOption());
            }
        }
    }
}
