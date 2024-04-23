package edu.emmanuel_gutierrez.reto11.ui;

import javax.swing.*;

public class SeleccionIdioma {
    public static Idioma seleccionarIdioma() {
        String[] idiomas = {"Español", "English"};
        int opcion = JOptionPane.showOptionDialog(null, "Select language", "Language Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, idiomas, idiomas[0]);
        if (opcion == 0) {
            return new Español();
        } else {
            return new Ingles();
        }
    }
}
