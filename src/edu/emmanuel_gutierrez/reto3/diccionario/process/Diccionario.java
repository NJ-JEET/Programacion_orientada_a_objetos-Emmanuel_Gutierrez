package edu.emmanuel_gutierrez.reto3.diccionario.process;

import javax.swing.JOptionPane;
import java.text.Normalizer;


public class Diccionario { //Esta clase proporciona las diferentes funciones solicitadas para el reto 3

    //Arreglos para almacenar palabras y sus resppectivos significados.
    private static final String[] palabras = {"Mamífero", "Reptil", "Anfibio", "Ave", "Invertebrado", "Carnívoro", "Herbívoro", "Omnívoro", "Depredador", "Presas"};
    private static final String[] significados = {"Tipo de animal vertebrado que se caracteriza por tener glándulas mamarias y cabello en su cuerpo", "Clase de animales vertebrados que se caracterizan por su piel escamosa y la capacidad de regular su temperatura corporal mediante la exposición al sol", "Clase de animales vertebrados que generalmente tienen una fase larval acuática y una fase adulta terrestre", "Clase de animales vertebrados caracterizados por tener plumas y la capacidad de volar", "Tipo de animal que no tiene columna vertebral", "Animal que se alimenta principalmente de carne", "Animal que se alimenta principalmente de plantas", "Animal que se alimenta tanto de carne como de plantas", "Animal que caza y se alimenta de otros animales", "Animales que son cazados y comidos por depredadores"};

    //Metodo para enlistar todas las palabras del diccionario.
    public static void enlistarPalabras() {
        StringBuilder listaPalabras = new StringBuilder("Palabras del diccionario:\n");
        for (String palabra : palabras) {
            listaPalabras.append(palabra).append("\n");//aqui se agrega .append para agregar cada palabra del arreglo y posteriormente un salto de linea despues de cada palabra.
        }
        JOptionPane.showMessageDialog(null, listaPalabras.toString());
    }


    //Metodo que busca la palabra ingresada por el usuario y muestra su significado.

    public static void buscarPalabra() {
        String palabraBuscada = JOptionPane.showInputDialog("Ingrese la palabra que desea buscar: ").toLowerCase();

        palabraBuscada = Normalizer.normalize(palabraBuscada, Normalizer.Form.NFD)//Uso de Normalizer para el caso de que el usuario ingrese la palabra sin acentos o cualquier otro  simbolo que contenga la palabra.
                .replaceAll("\\p{InCOMBINING_DIACRITICAL_MARKS}+", "");

        boolean palabraEncontrada = false;
        for (int i = 0; i < palabras.length; i++) {

            String palabraDiccionario = Normalizer.normalize(palabras[i], Normalizer.Form.NFD)
                    .replaceAll("\\p{InCOMBINING_DIACRITICAL_MARKS}+",  "");

            if (palabraDiccionario.equalsIgnoreCase(palabraBuscada)) {
                JOptionPane.showMessageDialog(null, "La palabra \"" + palabras[i] + "\" significa: " + significados[i]);
                palabraEncontrada = true;
                break;
            }
        }

        if (!palabraEncontrada) {
            JOptionPane.showMessageDialog(null, "La palabra no se encuentra en el diccionario.");
        }
    }

    public static void mostrarDetalle() {
        StringBuilder detalleDiccionario = new StringBuilder("Detalle del diccionario:\n");
        detalleDiccionario.append("Cantidad de palabras del diccionario: ").append(palabras.length).append("\n");
        detalleDiccionario.append("Lista de palabras del diccionario:\n");
        for (int i = 0; i < palabras.length; i++) {
            int longitudPalabra = palabras[i].length();
            int longitudSignificado = significados[i].length();
            detalleDiccionario.append(palabras[i])
                    .append(" - Longitud palabra: ").append(longitudPalabra)
                    .append(", Longitud significado: ").append(longitudSignificado)
                    .append(", Significado : ").append(significados[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, detalleDiccionario.toString());
    }
}
