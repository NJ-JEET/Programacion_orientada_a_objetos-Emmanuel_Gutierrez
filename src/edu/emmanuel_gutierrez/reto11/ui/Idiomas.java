package edu.emmanuel_gutierrez.reto11.ui;

public class Idiomas {

    private final String MENU;

    public Idiomas(String MENU) {
        this.MENU = MENU;
    }

    public static Idioma getInstance(String idioma) {
        switch (idioma.toUpperCase()) {
            case "ESP":
                return new Español();
            case "ENG":
                return new Ingles();
            default:
                throw new IllegalArgumentException("Idioma invalido / Invalid language");
        }
    }

    public String getMenu() {
        return MENU;
    }
}
