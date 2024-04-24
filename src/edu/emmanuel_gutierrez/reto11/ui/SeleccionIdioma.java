package edu.emmanuel_gutierrez.reto11.ui;

public class SeleccionIdioma {
    public static Idioma seleccionarIdioma(String idiomaSeleccionado) {
        return Idiomas.getInstance(idiomaSeleccionado);
    }
}
