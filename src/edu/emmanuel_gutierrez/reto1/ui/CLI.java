package edu.emmanuel_gutierrez.reto1.ui;

import edu.emmanuel_gutierrez.reto1.process.CalculadoraMasaCorporal;

import javax.swing.*;

public class CLI {
    /**
    Muestra un menú utilizando JOptionPane.showInputDialog() donde el usuario puede seleccionar entre tres opciones.
    La opción seleccionada se almacena en la variable opcion.
    **/
    public static void showMenu() {
        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a la calculadora de necesidades nutricionales\n"
                + "1. Cálculo de masa corporal (índice de masa corporal)\n"
                + "2. Cálculo de masa corporal magra\n"
                + "3. Cálculo de metabolismo basal (gasto energético basal)"));

        launchApp(opcion); // Llama a launchApp() con la opción seleccionada
    }

    /**
     * Se declaran las variables que see van a utilizar con su resspectivo de tipo
     * @param opcion
     */
    public static void launchApp(int opcion) { // Añade la opción como parámetro
        float peso = 0, estatura = 0;
        double indiceMasaCorporal, masaCorporalMagra, metabolismoBasal;
        int edad = 0;
        String genero;
/**
 * Dentro del primer caso see le pide al usuario que digite tres valores que se almacenaran:peso y estatura.
 *  Para la opcion 2 solicita al usuario el género, peso y estatura, calcula la masa corporal magra utilizando
 *  Para la opción 3, solicita al usuario el género, peso, estatura y edad, calcula el metabolismo basal utilizando
 * Los datos se solicitan a partir de un JOptionPane
 */
        switch (opcion) {
            case 1:
                peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su peso"));
                estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su estatura"));
                indiceMasaCorporal = CalculadoraMasaCorporal.calculadorIndiceMasaCorporal(peso, estatura);
                if (indiceMasaCorporal <= 18.50) {
                    JOptionPane.showMessageDialog(null, "Peso bajo");
                } else if ((indiceMasaCorporal >= 18.9) && (indiceMasaCorporal <= 24.99)) {
                    JOptionPane.showMessageDialog(null, "Peso normal");
                } else if ((indiceMasaCorporal >= 25) && (indiceMasaCorporal <= 29.99)) {
                    JOptionPane.showMessageDialog(null, "Sobrepeso");
                } else if ((indiceMasaCorporal >= 30) && (indiceMasaCorporal <= 34.99)) {
                    JOptionPane.showMessageDialog(null, "Obesidad leve");
                } else if ((indiceMasaCorporal >= 35) && (indiceMasaCorporal <= 39.99)) {
                    JOptionPane.showMessageDialog(null, "Obesidad media");
                } else if (indiceMasaCorporal >= 40) {
                    JOptionPane.showMessageDialog(null, "Obesidad morbida");
                }
                break;

            case 2:
                genero = JOptionPane.showInputDialog(null, "Ingrese el género del paciente");
                peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su peso"));
                estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su estatura"));

                if (genero.equalsIgnoreCase("hombre")) {
                    masaCorporalMagra = CalculadoraMasaCorporal.calculadorMasaCorporalMagra(genero, peso, estatura);
                    JOptionPane.showMessageDialog(null, masaCorporalMagra);
                } else if (genero.equalsIgnoreCase("mujer")) {
                    masaCorporalMagra = CalculadoraMasaCorporal.calculadorMasaCorporalMagra(genero, peso, estatura);
                    JOptionPane.showMessageDialog(null, masaCorporalMagra);
                } else {
                    JOptionPane.showMessageDialog(null, "El género ingresado no es válido");
                }
                break;

            case 3:
                genero = JOptionPane.showInputDialog(null, "Ingrese el género del paciente");
                peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su peso"));
                estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su estatura"));
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));

                if (genero.equalsIgnoreCase("hombre")) {
                    metabolismoBasal = CalculadoraMasaCorporal.calculadorMetabolismoBasal(genero, peso, estatura, edad);
                    JOptionPane.showMessageDialog(null, metabolismoBasal);
                } else if (genero.equalsIgnoreCase("mujer")) {
                    metabolismoBasal = CalculadoraMasaCorporal.calculadorMetabolismoBasal(genero, peso, estatura, edad);
                    JOptionPane.showMessageDialog(null, metabolismoBasal);
                } else {
                    JOptionPane.showMessageDialog(null, "El género ingresado no es válido");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
        }
    }
}
