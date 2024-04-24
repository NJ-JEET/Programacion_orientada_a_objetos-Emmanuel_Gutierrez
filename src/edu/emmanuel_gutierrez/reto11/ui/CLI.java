package edu.emmanuel_gutierrez.reto11.ui;

import javax.swing.*;
import static edu.emmanuel_gutierrez.reto11.process.FileProcessor.*;

public class CLI {
    // Elimina la línea que inicializa el idioma
    // private static final Idioma idioma = SeleccionIdioma.seleccionarIdioma("ESP");

    public static void launchApp() {
        // Solicitar al usuario que seleccione el idioma
        String idiomaSeleccionado = JOptionPane.showInputDialog("Seleccione su idioma / Select your language:\n1. Español \n2. English");

        // Seleccionar el idioma según la entrada del usuario
        Idioma idioma;
        if (idiomaSeleccionado.equals("1")) {
            idioma = SeleccionIdioma.seleccionarIdioma("ESP");
        } else if (idiomaSeleccionado.equals("2")) {
            idioma = SeleccionIdioma.seleccionarIdioma("ENG");
        } else {
            JOptionPane.showMessageDialog(null, "Opción no válida / Invalid option");
            return;
        }

        // Obtener el nombre del archivo según el idioma seleccionado
        String fileName = obtenerNombreArchivo(idioma);

        boolean continuar = true;
        while (continuar) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    idioma.getSeleccionIdioma() + "\n" +
                            "1. " + idioma.getVerPalabrasComunes() + "\n" +
                            "2. " + idioma.getContarVocales() + "\n" +
                            "3. " + idioma.getImprimirPalabrasVocal() + "\n" +
                            "4. " + idioma.getImprimirPalabrasImpar() + "\n" +
                            "5. " + idioma.getEncontrarPalabraLarga() + "\n" +
                            "6. " + idioma.getEncontrarPalabraCorta() + "\n" +
                            "7. " + idioma.getIdentificarPalabraCondicion() + "\n" +
                            "8. " + idioma.getSalir()));

            switch (opcion) {
                case 1:
                    verPalabrasMasComunes(fileName);
                    break;
                case 2:
                    contarVocales(fileName);
                    break;
                case 3:
                    imprimirPalabrasQueEmpiezanConVocal(fileName);
                    break;
                case 4:
                    imprimirPalabrasConLongitudImpar(fileName);
                    break;
                case 5:
                    encontrarPalabraMasLarga(fileName);
                    break;
                case 6:
                    encontrarPalabraMasCorta(fileName);
                    break;
                case 7:
                    identificarPalabraConVocalInicioFinYLongitud(fileName);
                    break;
                case 8:
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, idioma.getOpcionInvalida());
            }
        }
    }
}
