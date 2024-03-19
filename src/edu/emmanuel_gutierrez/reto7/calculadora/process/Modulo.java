package edu.emmanuel_gutierrez.reto7.calculadora.process;
/**
 * Clase que representa la operación de módulo.
 * Hereda de la clase Resta.
 */
public class Modulo extends Resta {
    /**
     * Constructor de la clase Modulo.
     * @param numero1 El dividendo.
     * @param numero2 El divisor.
     */
    public Modulo(int numero1, int numero2) {
        super(numero1, numero2);
    }

    /**
     * Realiza la operación de módulo.
     * @return El resultado del módulo.
     * @throws ArithmeticException Si el divisor es cero.
     */
    @Override
    public double ejecutar() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        int resultado = 0;
        while (numero1 >= numero2) {
            numero1 = (int) super.ejecutar();
            resultado = numero1;
        }
        return resultado;
    }
}