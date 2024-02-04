/**
 * Esta clase gestiona las diferentes operaciones que realiza el programa.
 * Permite registrar compras y ventas, así como generar y mostrar un reporte de actividades.
 */
package edu.emmanuel_gutierrez.reto2.cajas.process;

import javax.swing.*;

public class GestorCajasPapel {
    // Declaración de variables globales
    private static int cantidadOperaciones = 0; //Cantidad de operaciones realizadas, tanto compras como ventas.
    private static float totalVentas = 0; //Monto total acumulado por ventas.
    private static float totalCompras = 0; //Monto total acumulado por compras.
    private static float montoCaja = 0; //Monto actual en la caja
    private static float ingresosVentas = 0; //Ingresos totales generados por compras.
    private static float egresosCompras = 0;//Egresos totales generados por ventas.

    /**
     * Regitra las compras de cajas.
     * Actualiza el total de compra y la cantidad de operaciones realizadas.
     * @param costoUnitario El costo unitario por compra establecido por el usuario por cada caja de papel.
     * @param cantidad La cantidad de cajas que el usuario desea comprar.
     */
    public static void registrarCompra(float costoUnitario, int cantidad) {
        totalCompras += costoUnitario * cantidad;
        cantidadOperaciones++;
    }

    /**
     *Registra las ventas de cajas.
     * Actualiza el total de ventas y la cantidad de operaciones.
     * @param precioUnitario El precio unitario para la venta establecido por el usuario.
     * @param cantidad La cantidad de cajas que el usuario desea vender
     */
    public static void registrarVenta(float precioUnitario, int cantidad) {
        totalVentas += precioUnitario * cantidad;
        cantidadOperaciones++;
    }

    /**
     * Muestra un reporte de actividades.
     * Calculas los ingresos por venta, egresos por compra y el monto en caja, y los muestra al usuario.
     */
    public static void mostrarReporte() {
        ingresosVentas = totalVentas;
        egresosCompras = totalCompras;
        montoCaja = montoCaja + ingresosVentas - egresosCompras;

        JOptionPane.showMessageDialog(null, "La Cantidad total de ventas: " + totalVentas + "\n"
                + "Cantidad total de compras: " + totalCompras + "\n"
                + "Ingresos generados por ventas: " + ingresosVentas + "\n"
                + "Egresos generados por compras: " + egresosCompras + "\n"
                + "Monto en la caja: " + montoCaja);
    }

    // Método para obtener el total de compras
    public static float getTotalCompras() {
        return totalCompras;
    }

    // Método para obtener la cantidad de operaciones
    public static int getCantidadOperaciones() {
        return cantidadOperaciones;
    }

    // Método para obtener el total de ventas
    public static float getTotalVentas() {
        return totalVentas;
    }

    // Método para obtener los ingresos generados por ventas
    public static float getIngresosVentas() {
        return ingresosVentas;
    }

    // Método para obtener los egresos generados por compras
    public static float getEgresosCompras() {
        return egresosCompras;
    }

    // Método para obtener el monto en caja
    public static float getMontoCaja() {
        return montoCaja;
    }
}