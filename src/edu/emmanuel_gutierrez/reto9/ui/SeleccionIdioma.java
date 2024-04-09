package edu.emmanuel_gutierrez.reto9.ui;

import javax.swing.*;

/**
 * Clase que permite al usuario seleccionar el idioma.
 */
public class SeleccionIdioma {
    /**
     * Método que muestra un cuadro de diálogo para que el usuario seleccione el idioma.
     *
     * @return El código del idioma seleccionado ("ES" para español, "ENG" para inglés).
     */
    public static String seleccionarIdioma() {
        String[] idiomas = {"Español", "English"};
        int opcion = JOptionPane.showOptionDialog(null, "Select language", "Language Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, idiomas, idiomas[0]);
        if (opcion == 0) {
            return "ES"; // Español
        } else {
            return "ENG"; // Inglés
        }
    }
}
