package edu.emmanuel_gutierrez.reto5.caso1.data;

public class Propiedad {
    private String direccion;
    private double precio;
    private String tipoPropiedad;

    // Constructor
    public Propiedad(String direccion, double precio, String tipoPropiedad) {
        this.direccion = direccion;
        this.precio = precio;
        this.tipoPropiedad = tipoPropiedad;
    }

    // Métodos getters y setters
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }
}

