package edu.emmanuel_gutierrez.reto3.diccionario.ui;

import edu.emmanuel_gutierrez.reto3.diccionario.process.Diccionario;

import javax.swing.JOptionPane;



public class CLI {

    public static void iniciarPrograma() {
        char opcion;

        do {
            mostrarMenu();
            opcion = JOptionPane.showInputDialog("Seleccione una opción: ").toUpperCase().charAt(0);//Uso de de UpperCase si el usuario ingresa la opcion en minusculas.


            switch (opcion) {
                case 'A':
                    Diccionario.enlistarPalabras();
                    break;
                case 'B':
                    Diccionario.enlistarPalabras();
                    Diccionario.buscarPalabra();
                    break;
                case 'C':
                    Diccionario.mostrarDetalle();
                    break;
                case 'S':
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 'S');
    }

    private static void mostrarMenu() {
        JOptionPane.showMessageDialog(null, """
                Menú:
                A. Enlistar palabras del diccionario
                B. Buscar palabras en el diccionario
                C. Detalle del diccionario
                S. Finalizar programa""");
    }
}
