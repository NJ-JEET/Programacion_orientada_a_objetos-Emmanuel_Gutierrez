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

}}
