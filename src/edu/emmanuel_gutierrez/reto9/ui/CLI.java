package edu.emmanuel_gutierrez.reto9.ui;

import edu.emmanuel_gutierrez.reto9.process.ContadorPalabras;

import javax.swing.*;
import java.util.List;
import java.util.Map;

/**
 * Clase que representa la interfaz de usuario de línea de comandos.
 */
public class CLI {
    /**
     * Método que inicia la aplicación.
     */
    public static void launchApp() {
        String idioma = SeleccionIdioma.seleccionarIdioma();

        boolean continuar = true;
        while (continuar) {
            String nombreArchivo = obtenerNombreArchivo(idioma);
            List<Map.Entry<String, Integer>> listaPalabras = ContadorPalabras.contarPalabras(nombreArchivo);

            StringBuilder mensaje = new StringBuilder();
            for (int i = 0; i < 10 && i < listaPalabras.size(); i++) {
                mensaje.append((i + 1)).append(". ")
                        .append(listaPalabras.get(i).getKey())
                        .append(": ")
                        .append(listaPalabras.get(i).getValue())
                        .append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString());

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ver las palabras de otro libro?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (opcion != JOptionPane.YES_OPTION) {
                continuar = false;
            }
        }
    }

    /**
     * Método que obtiene el nombre del archivo del usuario.
     *
     * @param idioma El idioma seleccionado por el usuario.
     * @return El nombre del archivo seleccionado por el usuario.
     */
    private static String obtenerNombreArchivo(String idioma) {
        String[] libros = {"el_hobbit.txt", "el_principito.txt", "el_padrino.txt", "1984.txt", "rebelion_en_la_granja.txt"};
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Seleccione el libro que desea ver:",
                "Selección de libro",
                JOptionPane.QUESTION_MESSAGE,
                null,
                libros,
                libros[0]);
        if (opcionSeleccionada == null) {
            System.exit(0);
        }
        return opcionSeleccionada;
    }
}
