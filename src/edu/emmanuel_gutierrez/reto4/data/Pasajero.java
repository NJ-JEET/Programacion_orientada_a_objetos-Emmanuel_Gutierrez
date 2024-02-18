/**
 * Esta clase representa a un pasajero que puede comprar boletos.
 */
package edu.emmanuel_gutierrez.reto4.data;

public class Pasajero {
    private String nombreCompleto;

    /**
     * @param nombreCompleto El nombre completo del pasajero.
     */
    public Pasajero(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Obtiene el nombre completo del pasajero.
     * @return El nombre completo del pasajero.
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
