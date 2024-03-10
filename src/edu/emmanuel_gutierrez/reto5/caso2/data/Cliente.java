package edu.emmanuel_gutierrez.reto5.caso2.data;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int idCliente;
    private List<CuentaBancaria> cuentas;

    // Constructor
    public Cliente(String nombre, int idCliente) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.cuentas = new ArrayList<>();
    }

    // Método para agregar una cuenta bancaria asociada
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    // Método para obtener la lista de cuentas bancarias asociadas
    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    // Otros métodos según necesidades
}

// Clase CuentaBancaria
public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    private String tipo;

    // Constructor
    public CuentaBancaria(int numeroCuenta, double saldo, String tipo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    // Métodos para depositar y retirar fondos
    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    // Método para consultar el saldo
    public double getSaldo() {
        return saldo;
    }

}
