package edu.emmanuel_gutierrez.reto11.ui;

public class Español implements Idioma {
    @Override
    public String getSeleccionIdioma() {
        return "Seleccione su idioma / Select your language:";
    }

    @Override
    public String getSeleccioneLibro() {
        return "Seleccione el libro que desea consultar:";
    }

    @Override
    public String getMenuLibros() {
        return "1. el_hobbit.txt\n2. el_principito.txt\n3. el_padrino.txt\n4. 1984.txt\n5. rebelion_en_la_granja.txt";
    }

    @Override
    public String getOpcionInvalida() {
        return "Opción inválida";
    }

    @Override
    public String getIdiomaNoDisponible() {
        return "Idioma no disponible";
    }

    @Override
    public String getOpcionNoValida() {
        return "Opción no válida";
    }

    @Override
    public String getVerPalabrasComunes() {
        return "Ver palabras comunes";
    }

    @Override
    public String getContarVocales() {
        return "Contar vocales";
    }

    @Override
    public String getImprimirPalabrasVocal() {
        return "Imprimir palabras que empiezan con vocal";
    }

    @Override
    public String getImprimirPalabrasImpar() {
        return "Imprimir palabras con longitud impar";
    }

    @Override
    public String getEncontrarPalabraLarga() {
        return "Encontrar la palabra más larga";
    }

    @Override
    public String getEncontrarPalabraCorta() {
        return "Encontrar la palabra más corta";
    }

    @Override
    public String getIdentificarPalabraCondicion() {
        return "Identificar palabras que cumplen con cierta condición";
    }

    @Override
    public String getSalir() {
        return "Salir";
    }
}
