package edu.emmanuel_gutierrez.reto7.calculadora.process;
/**
 * Clase que representa la operación de multiplicación.
 * Hereda de la clase OperacionMatematica.
 */
public class Multiplicacion extends OperacionMatematica {
    /**
     * Constructor de la clase Multiplicacion.
     * @param numero1 El primer factor.
     * @param numero2 El segundo factor.
     */
    public Multiplicacion(int numero1, int numero2) {
        super(numero1, numero2);
    }

    /**
     * Realiza la operación de multiplicación utilizando solo sumas y restas.
     * @return El resultado de la multiplicación.
     */
    @Override
    public double ejecutar() {
        // Manejar caso especial si uno de los números es 0
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        }

        // Mantener un acumulador para el resultado de la multiplicación
        int resultado = 0;

        // Realizar la multiplicación utilizando solo sumas
        for (int i = 0; i < Math.abs(numero2); i++) {
            resultado += Math.abs(numero1);
        }

        // Determinar el signo del resultado en base a los números originales
        if ((numero1 < 0 && numero2 > 0) || (numero1 > 0 && numero2 < 0)) {
            return -resultado;
        } else {
            return resultado;
        }
    }
}
