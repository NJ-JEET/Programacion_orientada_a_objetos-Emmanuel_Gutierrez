package edu.emmanuel_gutierrez.reto5.caso1.data;

// Clase Location
public class Ubicacion {
    private double latitud;
    private double longitud;

    // Constructor
    public Ubicacion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    // Métodos getters y setters
    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
