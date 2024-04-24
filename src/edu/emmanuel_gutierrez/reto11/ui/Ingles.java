package edu.emmanuel_gutierrez.reto11.ui;

public class Ingles implements Idioma {
    @Override
    public String getSeleccionIdioma() {
        return "Select your language:";
    }

    @Override
    public String getSeleccioneLibro() {
        return "Select the book you want to consult:";
    }

    @Override
    public String getMenuLibros() {
        return "1. The Hobbit\n2. The Little Prince\n3. The Godfather\n4. 1984\n5. Animal Farm";
    }

    @Override
    public String getOpcionInvalida() {
        return "Invalid option";
    }

    @Override
    public String getIdiomaNoDisponible() {
        return "Language not available";
    }

    @Override
    public String getOpcionNoValida() {
        return "Invalid option";
    }

    @Override
    public String getVerPalabrasComunes() {
        return "View common words";
    }

    @Override
    public String getContarVocales() {
        return "Count vowels";
    }

    @Override
    public String getImprimirPalabrasVocal() {
        return "Print words starting with a vowel";
    }

    @Override
    public String getImprimirPalabrasImpar() {
        return "Print words with odd length";
    }

    @Override
    public String getEncontrarPalabraLarga() {
        return "Find longest word";
    }

    @Override
    public String getEncontrarPalabraCorta() {
        return "Find shortest word";
    }

    @Override
    public String getIdentificarPalabraCondicion() {
        return "Identify words meeting condition";
    }

    @Override
    public String getSalir() {
        return "Exit";
    }
}
