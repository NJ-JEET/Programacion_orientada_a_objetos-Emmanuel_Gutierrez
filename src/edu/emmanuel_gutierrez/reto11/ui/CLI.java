package edu.emmanuel_gutierrez.reto11.ui;

import javax.swing.*;
import static edu.emmanuel_gutierrez.reto11.process.FileProcessor.*;

public class CLI {
    private static final String RUTA_BASE = "C:\\Users\\cg750\\IdeaProjects\\Programacion_orientada_a_objetos-Emmanuel_Gutierrez\\src\\edu\\emmanuel_gutierrez\\reto11\\resources\\";

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

        // Crear un array con los nombres de los libros según el idioma seleccionado
        String[] libros;
        if (idiomaSeleccionado.equals("1")) {
            libros = new String[]{"el_hobbit.txt", "el_principito.txt", "el_padrino.txt", "1984.txt", "rebelion_en_la_granja.txt"};
        } else {
            libros = new String[]{"The Hobbit", "The Little Prince", "The Godfather", "1984", "Animal Farm"};
        }

        // Crear un JComboBox con los nombres de los libros
        JComboBox<String> comboBox = new JComboBox<>(libros);

        // Mostrar el JComboBox en un JOptionPane y obtener la selección del usuario
        int result = JOptionPane.showConfirmDialog(null, comboBox, idioma.getSeleccioneLibro(), JOptionPane.OK_CANCEL_OPTION);

        // Si el usuario hace clic en "OK", obtener el nombre del libro seleccionado
        String fileName;
        if (result == JOptionPane.OK_OPTION) {
            fileName = RUTA_BASE + comboBox.getSelectedItem();
            System.out.println("Ruta del archivo seleccionado: " + fileName); // Mensaje de depuración
        } else {
            // Si el usuario hace clic en "Cancelar" o cierra la ventana, salir de la aplicación
            return;
        }

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
