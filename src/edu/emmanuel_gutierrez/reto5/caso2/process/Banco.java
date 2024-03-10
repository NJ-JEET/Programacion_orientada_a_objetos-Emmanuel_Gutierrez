package edu.emmanuel_gutierrez.reto5.caso2.process;

import edu.emmanuel_gutierrez.reto5.caso2.data.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    // Constructor
    public Banco() {
        this.clientes = new ArrayList<>();
    }

    // Método para agregar un nuevo cliente al banco
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para buscar un cliente por su ID
    public Cliente buscarCliente(int idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.idCliente == idCliente) {
                return cliente;
            }
        }
        return null; // Si no se encuentra el cliente
    }
}
