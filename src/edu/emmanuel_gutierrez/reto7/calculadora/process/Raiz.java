package edu.emmanuel_gutierrez.reto7.calculadora.process;

import javax.swing.*;
import java.text.DecimalFormat;

public class Raiz extends Multiplicacion {
    private final double numero;
    private final int indice;

    public Raiz(double numero, int indice) {
        super(numero, indice);
        if (numero < 0 && indice % 2 == 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        this.numero = numero;
        this.indice = indice;
    }

    @Override
    public double ejecutar() {
        double x = 1.0;
        double precision = 0.0001;

        while (true) {
            double fx = calcularPotencia(x) - numero;
            double dfx = indice * calcularPotencia(x) / x;
            double deltaX = fx / dfx;
            x = x - deltaX;
            if (Math.abs(deltaX) < precision) {
                break;
            }
        }

        double resultado = x;
        // Formatear el resultado para mostrar solo 2 decimales
        DecimalFormat formato = new DecimalFormat("#.##");
        double resultadoFormateado = Double.parseDouble(formato.format(resultado));
        // Mostrar el resultado solo una vez, sin necesidad de llamar a JOptionPane.showMessageDialog() aquí
        return resultadoFormateado;
    }

    private double calcularPotencia(double base) {
        double resultado = 1.0;
        for (int i = 0; i < indice; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
