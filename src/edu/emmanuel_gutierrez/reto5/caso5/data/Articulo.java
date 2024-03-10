package edu.emmanuel_gutierrez.reto5.caso5.data;

public class Articulo {
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double iva;
    private double importeNeto;

    public Articulo(String nombre, int cantidad, double precioUnitario, double iva) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.iva = iva;
        this.importeNeto = cantidad * precioUnitario;
    }
}
