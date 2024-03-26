package edu.emmanuel_gutierrez.reto7.calculadora.process;

/**
 * Clase que representa la operación de módulo.
 * Esta clase hereda de la clase Resta y calcula el módulo de dos números.
 */
public class Modulo extends Resta {
    /**
     * Constructor de la clase Modulo.
     * @param numero1 El dividendo.
     * @param numero2 El divisor.
     */
    public Modulo(int numero1, int numero2){
        super(numero1, numero2);
    }

    /**
     * Realiza la operación de módulo utilizando restas repetidas.
     * @return El resultado del módulo.
     * @throws ArithmeticException si se intenta dividir entre cero.
     */
    @Override
    public double ejecutar(){
        if (numero2 == 0){
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        int resultado = 0;
        while (numero1 >= numero2){
            numero1 = (int) super.ejecutar();
            resultado = numero1;
        }
        return resultado;
    }
}
