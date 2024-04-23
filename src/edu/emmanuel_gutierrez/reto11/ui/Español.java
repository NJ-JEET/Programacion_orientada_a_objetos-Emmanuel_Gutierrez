package edu.emmanuel_gutierrez.reto11.ui;

import edu.emmanuel_gutierrez.reto8.data.Idioma;

public interface Español extends Idioma {
    @Override
    public String getMenu() {
        return null;
    }

    @Override
    public String getEnterFirstNumberMessage() {
        return null;
    }

    @Override
    public String getEnterSecondNumberMessage() {
        return null;
    }

    @Override
    public String getResultMessage(double result) {
        return null;
    }

    @Override
    public String getGoodbyeMessage() {
        return null;
    }

    @Override
    public String getInvalidOption() {
        return null;
    }

    @Override
    public String getEnterNumberMessage() {
        return null;
    }

    @Override
    public String getLogarithmBaseMessage() {
        return null;
    }

    @Override
    public String getPowerMessage(int base, int exponente, double resultado) {
        return null;
    }

    @Override
    public String getEnterExponentMessage() {
        return null;
    }

    @Override
    public String getRootIndex() {
        return null;
    }

    @Override
    public String getAdditionResultMessage(int numero1, int numero2, double resultado) {
        return null;
    }

    @Override
    public String getSubtractionResultMessage(int numero1, int numero2, double resultado) {
        return null;
    }

    @Override
    public String getMultiplicationResultMessage(int numero1, int numero2, double resultado) {
        return null;
    }

    @Override
    public String getDivisionResultMessage(int numero1, int numero2, double resultado) {
        return null;
    }

    @Override
    public String getRemainderResultMessage(int numero1, int numero2, double resultado) {
        return null;
    }

    @Override
    public String getSquareRootMessage(double numero, int indice, double resultado) {
        return null;
    }

    @Override
    public String getLogarithmMessage(int numero, int base, double resultado) {
        return null;
    }

    @Override
    public String getSeleccionIdioma() {
        return "Seleccione su idioma / Select your language:";
    }

    @Override
    public String getSeleccioneLibro() {
        return "Seleccione el libro que desea ver:";
    }

    @Override
    public String getMenuLibros() {
        return "1. el_hobbit.txt\n2. el_principito.txt\n3. el_padrino.txt\n4. 1984.txt\n5. rebelion_en_la_granja.txt";
    }

    @Override
    public String getOpcionInvalida() {
        return "Opción inválida";
    }

    @Override
    public String getIdiomaNoDisponible() {
        return "Idioma no disponible";
    }

    @Override
    public String getOpcionNoValida() {
        return "Opción no válida";
    }
}
