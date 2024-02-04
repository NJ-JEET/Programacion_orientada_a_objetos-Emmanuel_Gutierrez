/**
 * En esta clase se lleva a cabo ell menu de verificacion de credenciales y el menun de control de compra y venta de cajas de papel.
 * Permite al usuario realizar diferentes acciones como comprar, vender y mostrar un reporte.
 */

package edu.emmanuel_gutierrez.reto2.cajas.ui;

import edu.emmanuel_gutierrez.reto2.cajas.process.GestorCajasPapel;

import javax.swing.JOptionPane;

public class MENUCAJAS {

    public static void main(String[] args) {
        char opcion;

        // Solicitar al usuario que ingrese el usuario y la contraseña, dichas credenciales establecidas con un valor fijo.
        String usuario;
        String contraseña;

        do {
            usuario = JOptionPane.showInputDialog("Ingrese su usuario:");
            contraseña = JOptionPane.showInputDialog("Ingrese su contraseña:");

            // Verificar las credenciales
            if (usuario.equals(usuario) && contraseña.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "Acceso permitido. ¡Bienvenido!");
                break; // Salir del bucle si las credenciales son correctas
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Intente nuevamente.");
            }
        } while (true); // Bucle continuo hasta que las credenciales sean ingresadas correctamente.

        do {
            opcion = showMenu();

            switch (opcion) {

                case 'a':
                    // Registro de compra de cajas de papel
                    float costoCompra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el costo por unidad de caja de papel:"));
                    int cantidadCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cajas compradas:"));
                    GestorCajasPapel.registrarCompra(costoCompra, cantidadCompra);
                    float montoCompra = GestorCajasPapel.getTotalCompras(); // Obteniendo el monto de la compra desde GestorCajasPapel
                    JOptionPane.showMessageDialog(null, "La compra realizada por " + cantidadCompra + " cajas al costo " + costoCompra + " es igual a " + montoCompra);
                    break;
                case 'b':
                    // Registro de venta de cajas de papel
                    float precioVenta = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por unidad de caja de papel:"));
                    int cantidadVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cajas vendidas:"));
                    GestorCajasPapel.registrarVenta(precioVenta, cantidadVenta);
                    float montoVenta = GestorCajasPapel.getTotalVentas(); // Obteniendo el monto de la venta desde GestorCajasPapel
                    JOptionPane.showMessageDialog(null, "La venta realizada por " + cantidadVenta + " cajas al precio de " + precioVenta + " es igual a " + montoVenta);
                    break;

                case 'c':
                    // Mostrar reporte
                    GestorCajasPapel.mostrarReporte();
                    break;
                case 'd':
                    // Salir del programa
                    mostrarResumenActividades();
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de control de cajas. Hasta pronto.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 'd');
    }

    /**
     * Menu que se muestra despues de que el usuario ingrese las credenciales de manera correcta.
     * Se proporcionan cuatro opciones.
     * Opcion 'a': Permite al usuario realizar la compra de cajas.
     * Opcion 'b': Permite al usuario realizar la centa de cajas.
     * Opcion 'c': Muestra un reporte de actividades.
     * Opcion 'b': Permite al usuario salir del programa y muestra un resumen de actividades.
     */
    public static char showMenu() {
        String mensaje = """
                Bienvenido al menú de control de compra y venta de cajas de papel
                a. Comprar cajas de papel
                b. Vender cajas de papel
                c. Mostrar reporte
                d. Salir del programa
                Ingrese su opción (a, b, c, d):""";
        String opcionString = JOptionPane.showInputDialog(mensaje).toLowerCase();

        while (opcionString.length() != 1 || opcionString.charAt(0) < 'a' || opcionString.charAt(0) > 'd') {
            opcionString = JOptionPane.showInputDialog("Opción no válida. " + mensaje).toLowerCase();
        }

        return opcionString.charAt(0);
    }

    public static void mostrarResumenActividades() {
        JOptionPane.showMessageDialog(null, "Cantidad total de operaciones realizadas: " + GestorCajasPapel.getCantidadOperaciones() + "\n"
                + "Cantidad total de ventas: " + GestorCajasPapel.getTotalVentas() + "\n"
                + "Cantidad total de compras: " + GestorCajasPapel.getTotalCompras() + "\n"
                + "Monto en la caja: " + GestorCajasPapel.getMontoCaja() + "\n"
                + "Los ingresos generados por ventas: " + GestorCajasPapel.getIngresosVentas() + "\n"
                + "Los egresos generados por compras: " + GestorCajasPapel.getEgresosCompras() + "\n"
                + "Gracias por usar este sistema de control, esperamos que le haya sido de su utilidad\n"
                + "Hasta pronto");
    }
}
