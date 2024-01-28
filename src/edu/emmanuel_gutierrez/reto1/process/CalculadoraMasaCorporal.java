package edu.emmanuel_gutierrez.reto1.process;

public class CalculadoraMasaCorporal {
    public static double calculadorIndiceMasaCorporal(float peso, float estatura) {
        double estaturaMetros = estatura / 100;
        double indiceMasaCorporal = peso / (estatura / 100 * estatura * 100);
        return indiceMasaCorporal;
    }

    public static double calculadorMasaCorporalMagra(String genero, float peso, float estatura) {
        double estaturaMetros = estatura / 100.0;
        double masaCorporalMagra;

        if (genero.equalsIgnoreCase("hombre")) {
            masaCorporalMagra = (1.10 * peso) - (128 * Math.pow((peso / 10), 2) / Math.pow(estaturaMetros, 2));
        } else if (genero.equalsIgnoreCase("mujer")) {
            masaCorporalMagra = (1.07 * peso) - (148 * Math.pow((peso / 10), 2) / Math.pow(estaturaMetros, 2));
        } else {
            System.out.println("El género ingresado no es válido");
            return Double.NaN; // Valor que indica un error
        }

        return masaCorporalMagra;
    }

    public static double calculadorMetabolismoBasal(String genero, float peso, float estatura, int edad) {
        double metabolismoBasal;

        if (genero.equalsIgnoreCase("hombre")) {
            metabolismoBasal = (655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad));
        } else if (genero.equalsIgnoreCase("mujer")) {
            metabolismoBasal = (66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad));
        } else {
            System.out.println("El género ingresado no es válido");
            return Double.NaN; // Valor que indica un error
        }

        return metabolismoBasal;
    }
}

