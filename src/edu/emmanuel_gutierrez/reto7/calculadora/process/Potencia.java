package edu.emmanuel_gutierrez.reto7.calculadora.process;

/**
 * Clase que representa la operación de potencia.
 * Hereda de la clase Multiplicacion.
 */
public class Potencia extends Multiplicacion {
    /**
     * Constructor de la clase Potencia.
     * @param numero1 La base de la potencia.
     * @param numero2 El exponente de la potencia.
     */
    public Potencia(int numero1, int numero2) {
        super(numero1, numero2);
    }

    /**
     * Realiza la operación de potencia.
     * @return El resultado de la potencia.
     */
    @Override
    public double ejecutar() {
        double resultado = 1;
        for (int i = 0; i < Math.abs(numero2); i++) {
            resultado *= Math.abs(numero1);
        }
        // Determinar el signo del resultado en base a los números originales
        if ((numero1 < 0 && numero2 % 2 != 0) || (numero1 > 0 && numero2 < 0)) {
            return -resultado;
        } else {
            return resultado;
        }
    }
}
