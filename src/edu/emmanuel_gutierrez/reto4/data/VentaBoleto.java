/**
 * Esta clase representa la venta de boletos de viaje.
 */
package edu.emmanuel_gutierrez.reto4.data;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentaBoleto {
    private String nombreComprador;
    private int cantidadBoletos;
    private ArrayList<Pasajero> pasajerosAdicionales;

    /**
     * @param nombreComprador Nombre del comprador.
     * @param cantidadBoletos La cantidad de boletos comprados.
     */
    public VentaBoleto(String nombreComprador, int cantidadBoletos) {
        this.nombreComprador = nombreComprador;
        this.cantidadBoletos = cantidadBoletos;
        pasajerosAdicionales = new ArrayList<>();
    }

    /**
     * Agrega un pasajero adicional a la lista.
     * @param nombrePasajero El nombre del pasajero adicional.
     */
    public void agregarPasajero(String nombrePasajero) {
        pasajerosAdicionales.add(new Pasajero(nombrePasajero));
    }

    /**
     * Calcula el importe total de la venta de boletos.
     * @return El importe total de la venta.
     */
    public double calcularImporte() {
        return cantidadBoletos * 1250.50;
    }

    /**
     * Obtiene la cantidad total de pasajeros, incluyendo al comprador.
     * @return La cantidad total de pasajeros.
     */
    public int getCantidadTotalPasajeros() {
        return 1 + pasajerosAdicionales.size(); // Se suma 1 por el comprador
    }

    /**
     * Muestra el ticket de la venta con la información relevante.
     */
    public void mostrarTicket() {
        StringBuilder ticket = new StringBuilder();
        ticket.append("Ticket de Venta\n");
        ticket.append("Comprador: ").append(nombreComprador).append("\n");
        ticket.append("Cantidad de boletos: ").append(cantidadBoletos).append("\n");
        ticket.append("Importe total: $").append(calcularImporte());
        JOptionPane.showMessageDialog(null, ticket.toString());
    }

    /**
     * Muestra la lista de pasajeros adicionales.
     */
    public void mostrarListaPasajeros() {
        StringBuilder listaPasajeros = new StringBuilder();
        listaPasajeros.append("Lista de Pasajeros:\n");
        listaPasajeros.append("Comprador: ").append(nombreComprador).append("\n");
        for (Pasajero pasajero : pasajerosAdicionales) {
            listaPasajeros.append("- ").append(pasajero.getNombreCompleto()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaPasajeros.toString());
    }
}
