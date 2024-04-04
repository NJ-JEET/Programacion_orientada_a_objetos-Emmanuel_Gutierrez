package edu.emmanuel_gutierrez.reto8.data;

public abstract class Idioma {
    public abstract String getMenu();
    public abstract String getEnterFirstNumberMessage();
    public abstract String getEnterSecondNumberMessage();
    public abstract String getResultMessage(double result);
    public abstract String getGoodbyeMessage();
    public abstract String getInvalidOption();
    public abstract String getEnterNumberMessage();
    public abstract String getLogarithmBaseMessage();

    public abstract String getPowerMessage(int base, int exponente, double resultado);

    public abstract String getEnterExponentMessage();

    public abstract String getRootIndex();

    //MENSAJES PARA MOSTRAR RESULTADOS
    public abstract String getAdditionResultMessage(int numero1, int numero2, double resultado);

    public abstract String getSubtractionResultMessage(int numero1, int numero2, double resultado);

    public abstract String getMultiplicationResultMessage(int numero1, int numero2, double resultado);

    public abstract String getDivisionResultMessage(int numero1, int numero2, double resultado);

    public abstract String getRemainderResultMessage(int numero1, int numero2, double resultado);

    public abstract String getSquareRootMessage(double numero, int indice, double resultado);

    public abstract String getLogarithmMessage(int numero, int base, double resultado);
}
