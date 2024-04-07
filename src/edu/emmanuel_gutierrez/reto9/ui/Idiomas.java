package edu.emmanuel_gutierrez.reto9.ui;

/**
 * Clase que proporciona mensajes en diferentes idiomas para la interfaz de usuario.
 */
public class Idiomas {
    private final String idiomaSeleccionado;

    /**
     * Constructor privado de la clase Idiomas.
     *
     * @param idiomaSeleccionado El idioma seleccionado.
     */
    private Idiomas(String idiomaSeleccionado) {
        this.idiomaSeleccionado = idiomaSeleccionado;
    }

    /**
     * Obtiene el mensaje de selección de idioma.
     *
     * @param idioma El idioma seleccionado.
     * @return El mensaje de selección de idioma.
     */
    public static String getSeleccionIdioma(String idioma) {
        switch (idioma) {
            case "ES":
                return Español.getSeleccionIdioma();
            case "ENG":
                return Ingles.getSeleccionIdioma();
            default:
                return "";
        }
    }

    /**
     * Obtiene el menú de libros en el idioma especificado.
     *
     * @param idioma El idioma seleccionado.
     * @return El menú de libros en el idioma especificado.
     */
    public static String getMenu(String idioma) {
        switch (idioma) {
            case "ES":
                return Español.getMenuLibros();
            case "ENG":
                return Ingles.getMenuLibros();
            default:
                return "";
        }
    }

    /**
     * Obtiene el mensaje para seleccionar un libro en el idioma especificado.
     *
     * @param idioma El idioma seleccionado.
     * @return El mensaje para seleccionar un libro en el idioma especificado.
     */
    public static String getSeleccioneLibro(String idioma) {
        switch (idioma) {
            case "ES":
                return Español.getSeleccioneLibro();
            case "ENG":
                return Ingles.getSeleccioneLibro();
            default:
                return "";
        }
    }

    /**
     * Obtiene el mensaje para una opción inválida en el idioma especificado.
     *
     * @param idioma El idioma seleccionado.
     * @return El mensaje para una opción inválida en el idioma especificado.
     */
    public static String getOpcionInvalida(String idioma) {
        switch (idioma) {
            case "ES":
                return Español.getOpcionInvalida();
            case "ENG":
                return Ingles.getOpcionInvalida();
            default:
                return "";
        }
    }

    /**
     * Obtiene el mensaje para un idioma no disponible en el idioma especificado.
     *
     * @param idioma El idioma seleccionado.
     * @return El mensaje para un idioma no disponible en el idioma especificado.
     */
    public static String getIdiomaNoDisponible(String idioma) {
        switch (idioma) {
            case "ES":
                return Español.getIdiomaNoDisponible();
            case "ENG":
                return Ingles.getIdiomaNoDisponible();
            default:
                return "";
        }
    }

    /**
     * Obtiene el mensaje para una opción no válida en el idioma especificado.
     *
     * @param idioma El idioma seleccionado.
     * @return El mensaje para una opción no válida en el idioma especificado.
     */
    public static String getOpcionNoValida(String idioma) {
        switch (idioma) {
            case "ES":
                return Español.getOpcionNoValida();
            case "ENG":
                return Ingles.getOpcionNoValida();
            default:
                return "";
        }
    }
}
