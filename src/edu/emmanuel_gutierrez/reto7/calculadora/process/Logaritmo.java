package edu.emmanuel_gutierrez.reto7.calculadora.process;

/**
 * Clase que representa la operación de logaritmo.
 * Esta clase hereda de la clase Resta y calcula el logaritmo de un número en una base dada.
 */
public class Logaritmo extends Resta {
    /**
     * Constructor de la clase Logaritmo.
     * @param numero1 El número del cual se calculará el logaritmo.
     * @param numero2 La base del logaritmo.
     */
    public Logaritmo(int numero1, int numero2){
        super(numero1, numero2);
    }

    /**
     * Realiza la operación de logaritmo utilizando restas repetidas.
     * @return El resultado del logaritmo.
     * @throws ArithmeticException si los argumentos son inválidos para el logaritmo.
     */
    @Override
    public double ejecutar(){
        if (numero1 <= 0 || numero2 <= 0 || numero2 == 1){
            throw new ArithmeticException("Argumentos inválidos para el logaritmo");
        }
        double resultado = 0;
        while (numero1 >= numero2){
            numero1 = (int) super.ejecutar();
            resultado++;
        }
        return resultado;
    }
}
