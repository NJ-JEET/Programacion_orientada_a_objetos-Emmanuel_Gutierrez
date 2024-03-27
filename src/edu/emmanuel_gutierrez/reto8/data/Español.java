package edu.emmanuel_gutierrez.reto8.data;

public class Español extends Idioma {
    @Override
    public String getMenu() {
        return "Seleccione la operación a realizar:\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. División\n"
                + "5. Residuo\n"
                + "6. Raíz cuadrada\n"
                + "7. Logaritmo\n"
                + "8. Potencia\n"
                + "9. Salir";
    }

    // Implementa los métodos para la solicitud de datos y la presentación de resultados
    @Override
    public String getEnterFirstNumberMessage() {
        return "Ingrese el primer número:";
    }

    @Override
    public String getEnterSecondNumberMessage() {
        return "Ingrese el segundo número:";
    }

    @Override
    public String getResultMessage(double result) {
        return "El resultado es: " + result;
    }

    @Override
    public String getGoodbyeMessage() {
        return "¡Hasta luego!";
    }

    @Override
    public String getInvalidOption() {
        return "Opción no válida";
    }

    @Override
    public String getEnterNumberMessage() {
        return "Ingrese el número:";
    }

    @Override
    public String getLogarithmBaseMessage() {
        return "Ingrese la base del logaritmo:";
    }

    @Override
    public String getPowerMessage(int base, int exponente, double resultado){
        return "El resultado de" + base + " ^ " + exponente + " es: " + resultado;
    }

    @Override
    public String getEnterExponentMessage() {
        return "Ingrese el exponente:";
    }

    @Override
    public String getRootIndex(){
        return "Ingrese el índice de la raíz:";
    }

    //MENSAJES PARA MOSTRAR RESULTADOS
    @Override
    public String getAdditionResultMessage(int numero1, int numero2, double resultado) {
        return "La suma entre " + numero1 + " - " + numero2 + " es: " + resultado;
    }

    @Override
    public String getSubtractionResultMessage(int numero1, int numero2, double resultado) {
        return "La resta entre " + numero1 + " - " + numero2 + " es " + resultado;
    }

    @Override
    public String getMultiplicationResultMessage(int numero1, int numero2, double resultado) {
        return "La multiplicación entre " + numero1 + " * " + numero2 + " es: " + resultado;
    }

    @Override
    public String getDivisionResultMessage(int numero1, int numero2, double resultado) {
        return "La división entre " + numero1 + " / " + numero2 + " es: " + resultado;
    }

    @Override
    public String getRemainderResultMessage(int numero1, int numero2, double resultado) {
        return "El residuo de " + numero1 + " / " + numero2 + " es: " + resultado;
    }

    @Override
    public String getSquareRootMessage(double numero, int indice, double resultado) {
        return "La raíz cuadrada de " + numero + " es: " + resultado;
    }

    @Override
    public String getLogarithmMessage(int numero, int base, double resultado) {
        return "El logaritmo de " + numero + " en base " + base + " es: " + resultado;
    }

}
