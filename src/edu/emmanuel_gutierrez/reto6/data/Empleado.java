package edu.emmanuel_gutierrez.reto6.data;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    // Atributos
    private String nombreCompleto;
    private int horasTrabajadas;
    private int horasExtras;
    private String telefono;
    private String fechaNacimiento;
    private Categoria categoria;

    // Constructor
    public Empleado(String nombreCompleto, int horasTrabajadas, int horasExtras, String telefono, String fechaNacimiento, Categoria categoria) {
        this.nombreCompleto = nombreCompleto;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    // Getters y setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Método para calcular la edad
    public int calcularEdad() {
        // Implementación para calcular la edad a partir de la fecha de nacimiento
        // Aquí deberías calcular la edad usando las clases de fecha de Java
        return 0;
    }

    // Método para calcular el pago total del empleado
    public double calcularPagoTotal() {
        double sueldoNormal = this.horasTrabajadas * this.categoria.getSueldoBase();
        double pagoHorasExtras = this.horasExtras * this.categoria.getPagoHoraExtra();
        return sueldoNormal + pagoHorasExtras;
    }
}
