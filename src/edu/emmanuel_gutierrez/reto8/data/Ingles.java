package edu.emmanuel_gutierrez.reto8.data;

import edu.emmanuel_gutierrez.reto8.data.Idioma;

public class Ingles extends Idioma {
    @Override
    public String getMenu() {
        return "Select the operation to perform:\n"
                + "1. Addition\n"
                + "2. Subtraction\n"
                + "3. Multiplication\n"
                + "4. Division\n"
                + "5. Remainder\n"
                + "6. Square Root\n"
                + "7. Logarithm\n"
                + "8. Power\n"
                + "9. Exit";
    }

    // Implementa los métodos para la solicitud de datos y la presentación de resultados
    @Override
    public String getEnterFirstNumberMessage() {
        return "Enter the first number:";
    }

    @Override
    public String getEnterSecondNumberMessage() {
        return "Enter the second number:";
    }

    @Override
    public String getResultMessage(double result) {
        return "The result is: " + result;
    }

    @Override
    public String getGoodbyeMessage() {
        return "Goodbye!";
    }

    @Override
    public String getInvalidOption() {
        return "Invalid option";
    }

    @Override
    public String getEnterNumberMessage() {
        return "Enter the number:";
    }

    @Override
    public String getLogarithmBaseMessage() {
        return "Enter the base of the logarithm:";
    }
    @Override
    public String getPowerMessage(int base, int exponente, double resultado){
        return "The result of" + base + " ^ " + exponente + " is: " + resultado;
    }

    @Override
    public String getEnterExponentMessage() {
        return "Enter the exponent:";
    }

    @Override
    public String getRootIndex(){
        return "Enter the root index";
    }

    //MENSAJES PARA MOSTRAR RESULTADOS
    @Override
    public String getAdditionResultMessage(int numero1, int numero2, double resultado) {
        return "The sum of " + numero1 + " + " + numero2 + " is " + resultado;
    }

    @Override
    public String getSubtractionResultMessage(int numero1, int numero2, double resultado) {
        return "The subtraction of " + numero1 + " - " + numero2 + " is " + resultado;
    }

    @Override
    public String getMultiplicationResultMessage(int numero1, int numero2, double resultado) {
        return "The multiplication of " + numero1 + " * " + numero2 + " is " + resultado;
    }

    @Override
    public String getDivisionResultMessage(int numero1, int numero2, double resultado) {
        return "The division of " + numero1 + " / " + numero2 + " is " + resultado;
    }

    @Override
    public String getRemainderResultMessage(int numero1, int numero2, double resultado) {
        return "The remainder of " + numero1 + " % " + numero2 + " is " + resultado;
    }

    @Override
    public String getSquareRootMessage(double numero, int indice, double resultado) {
        return "The square root of " + numero + " is: " + resultado;
    }

    @Override
    public String getLogarithmMessage(int numero, int base, double resultado) {
        return "The logarithm of " + numero + " in base " + base + " is: " + resultado;
    }
}
