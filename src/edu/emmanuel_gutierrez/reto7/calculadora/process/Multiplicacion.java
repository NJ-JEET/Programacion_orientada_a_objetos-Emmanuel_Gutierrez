package edu.emmanuel_gutierrez.reto7.calculadora.process;

/**
 * Clase que representa la operación de multiplicación.
 * Hereda de la clase Suma para mantener coherencia y facilitar la implementación.
 */
public class Multiplicacion extends Suma {
    /**
     * Constructor de la clase Multiplicacion.
     * @param numero1 El primer factor.
     * @param numero2 El segundo factor.
     */
    public Multiplicacion(double numero1, int numero2) {
        super((int)numero1, numero2);
    }

    /**
     * Realiza la operación de multiplicación utilizando sumas sucesivas.
     * @return El resultado de la multiplicación.
     */
    @Override
    public double ejecutar() {
        int resultado = 0;

        // Verificar si uno de los números es cero
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        }

        // Realizar la multiplicación utilizando sumas sucesivas
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
