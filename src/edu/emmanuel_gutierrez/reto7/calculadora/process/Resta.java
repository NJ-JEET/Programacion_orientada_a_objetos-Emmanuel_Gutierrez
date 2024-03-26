// Clase Resta
package edu.emmanuel_gutierrez.reto7.calculadora.process;

/**
 * Clase que representa la operación de resta.
 * Esta clase hereda de la clase OperacionMatematica y realiza la resta entre dos números.
 */
public class Resta extends OperacionMatematica {
    /**
     * Constructor de la clase Resta.
     * @param numero1 El primer número de la operación.
     * @param numero2 El segundo número de la operación.
     */
    public Resta(int numero1, int numero2) {
        super(numero1, numero2); // Llama al constructor de la superclase con los argumentos
    }

    /**
     * Realiza la resta entre los dos números.
     * @return El resultado de la resta.
     */
    @Override
    public double ejecutar() {
        return numero1 - numero2;
    }
}
