package edu.emmanuel_gutierrez.reto5.caso5.process;

import edu.emmanuel_gutierrez.reto5.caso5.data.Articulo;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Articulo> articulos;

    public CarritoCompras() {
        this.articulos = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public void eliminarArticulo(Articulo articulo) {
        articulos.remove(articulo);
    }

    public double calcularTotal() {
        double total = 0;
        for (Articulo articulo : articulos) {
            total += articulo.getImporteNeto() * (1 + articulo.getIva());
        }
        return total;
    }
}
