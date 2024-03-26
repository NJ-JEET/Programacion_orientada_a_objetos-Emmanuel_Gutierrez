package edu.emmanuel_gutierrez.reto7.calculadora.process;

/**
 * Clase que representa la operación de división.
 * Esta clase hereda de la clase Resta y realiza la división entre dos números.
 */
public class Division extends Resta {

    /**
     * Constructor de la clase Division.
     * @param numero1 El dividendo.
     * @param numero2 El divisor.
     */
    public Division(int numero1, int numero2){
        super(numero1, numero2);
    }

    /**
     * Realiza la división entre los dos números.
     * @return El resultado de la división.
     * @throws ArithmeticException Si se intenta dividir entre cero.
     */
    @Override
    public double ejecutar() throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double) numero1 / numero2;
    }
}
