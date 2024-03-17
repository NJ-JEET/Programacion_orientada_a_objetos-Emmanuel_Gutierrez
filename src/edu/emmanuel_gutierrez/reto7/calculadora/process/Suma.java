package edu.emmanuel_gutierrez.reto7.calculadora.process;
/**
 * Clase que representa la operación de suma.
 * Esta clase hereda de la clase OperacionMatematica y realiza la suma entre dos números.
 */
public class Suma extends OperacionMatematica {
    /**
     * Constructor de la clase Suma.
     * @param numero1 El primer número de la operación.
     * @param numero2 El segundo número de la operación.
     */
    public Suma(int numero1, int numero2){
        super(numero1, numero2);
    }

    /**
     * Realiza la suma entre los dos números.
     * @return El resultado de la suma.
     */
    @Override
    public double ejecutar(){
        return numero1 + numero2;
    }
}
