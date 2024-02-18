/**
 * Este paquete contiene clases relacionadas con la interfaz de usuario para la venta de boletos.
 */
package edu.emmanuel_gutierrez.reto4.ui;

import edu.emmanuel_gutierrez.reto4.process.VentaBoletos;
import javax.swing.JOptionPane;

/**
 * Esta clase representa el menú para la venta de boletos.
 */
public class MenuVentaBoletos {
    /**
     * Método principal que inicia el menú de venta de boletos.
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        VentaBoletos programa = new VentaBoletos();

        char opcion;
        do {
            String opcionStr = JOptionPane.showInputDialog("Menú:\n"
                    + "A. Realizar venta de boleto\n"
                    + "B. Mostrar datos de la lista de ventas\n"
                    + "S. Finalizar programa\n"
                    + "Ingrese una opción:");
            opcion = opcionStr.charAt(0);

            switch (opcion) {
                case 'A':
                    programa.realizarVenta(null); // Pasamos null ya que no se usa el Scanner
                    break;
                case 'B':
                    programa.mostrarDatosVentas();
                    break;
                case 'S':
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 'S');
    }
}
