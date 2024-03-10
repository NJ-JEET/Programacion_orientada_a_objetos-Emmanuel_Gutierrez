

import java.util.ArrayList;

public class Articulo {
    // Atributos
    private String nombre;
    private double precio;
    private int cantidad;
    private double importeTotal;

    // Constructor, getters y setters

    // Métodos
    public void calcularImporteTotal() {
        // Implementación del método calcularImporteTotal
    }

    public static void agregarArticulo(ListaArticulos listaArticulos, Articulo articulo) {
        listaArticulos.getListaArticulos().add(articulo);
    }
}

public class ListaArticulos {
    // Atributos
    private ArrayList<Articulo> listaArticulos;

    // Constructor, getters y setters

    // Métodos
}