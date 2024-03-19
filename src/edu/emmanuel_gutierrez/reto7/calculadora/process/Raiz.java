    package edu.emmanuel_gutierrez.reto7.calculadora.process;

    /**
     * Clase que representa la operación de calcular la raíz cuadrada.
     * Esta clase hereda de la clase Resta y utiliza el método de aproximación de Newton-Raphson para calcular la raíz cuadrada.
     */
    public class Raiz extends Resta {
        /**
         * Constructor de la clase Raiz.
         * @param numero1 El número del cual se desea calcular la raíz cuadrada.
         * @param numero2 No se utiliza en esta operación, pero se hereda de la clase Resta.
         */
        public Raiz(int numero1, int numero2){
            super(numero1, numero2);
        }

        /**
         * Calcula la raíz cuadrada del número utilizando el método de aproximación de Newton-Raphson.
         * @return La raíz cuadrada del número.
         * @throws ArithmeticException Si el número es negativo.
         */
        @Override
        public double ejecutar(){
            if (numero1 < 0){
                throw new ArithmeticException("No se puede calcular la raiz cuadrada de un número negativo");
            }
            if (numero1 == 0){
                return 0;
            }
            double x = numero1;
            double y = 1;
            while (Math.abs(x - y) > 0.0001){
                x = (x + y) / 2;
                y = numero1 / x;
            }
            return x;
        }
    }

