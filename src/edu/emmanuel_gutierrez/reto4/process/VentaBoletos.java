/**
 * Este paquete contiene clases relacionadas con el proceso de venta de boletos.
 */
package edu.emmanuel_gutierrez.reto4.process;

import edu.emmanuel_gutierrez.reto4.data.VentaBoleto;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Esta clase gestiona el proceso de venta de boletos.
 */
public class VentaBoletos {
    private final ArrayList<VentaBoleto> ventas;

    /**
     * Constructor de la clase VentaBoletos.
     */
    public VentaBoletos() {
        ventas = new ArrayList<>();
    }

    /**
     * Realiza una venta de boletos.
     * @param scanner Un objeto Scanner para la entrada de datos.
     */
    public void realizarVenta(Scanner scanner) {
        String nombreComprador = JOptionPane.showInputDialog("Ingrese nombre completo del comprador:");
        int cantidadBoletos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de boletos:"));

        VentaBoleto venta = new VentaBoleto(nombreComprador, cantidadBoletos);

        // Capturar nombres completos de pasajeros adicionales
        for (int i = 1; i < cantidadBoletos; i++) {
            String nombrePasajero = JOptionPane.showInputDialog("Ingrese nombre completo del pasajero " + i + ":");
            venta.agregarPasajero(nombrePasajero);
        }

        venta.mostrarTicket();
        ventas.add(venta);
    }

    /**
     * Muestra los datos de las ventas realizadas.
     */
    public void mostrarDatosVentas() {
        if (ventas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ventas registradas.");
        } else {
            StringBuilder datosVentas = new StringBuilder();
            for (VentaBoleto v : ventas) {
                datosVentas.append("Importe total: $").append(v.calcularImporte()).append("\n");
                datosVentas.append("Cantidad total de pasajeros: ").append(v.getCantidadTotalPasajeros()).append("\n");
            }
            JOptionPane.showMessageDialog(null, datosVentas.toString());
        }
    }
}
