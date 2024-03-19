package edu.emmanuel_gutierrez.reto7.calculadora.process;

/**
 * Clase que representa la operación de potenciación.
 * Esta clase hereda de la clase Multiplicacion y calcula la potencia de un número.
 */
public class Potencia extends Multiplicacion {
    /**
     * Constructor de la clase Potencia.
     * @param numero1 La base de la potencia.
     * @param numero2 El exponente de la potencia.
     */
    public Potencia(int numero1, int numero2){
        super(numero1, numero2);
    }

    /**
     * Realiza la operación de potenciación utilizando multiplicaciones repetidas.
     * @return El resultado de la potenciación.
     */
    @Override
    public double ejecutar(){
        double resultado = 1;
        for (int i = 0; i < numero2; i++){
            resultado = super.ejecutar();
        }
        return resultado;
    }
}
