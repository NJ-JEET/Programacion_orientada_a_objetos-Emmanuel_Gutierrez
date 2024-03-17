package edu.emmanuel_gutierrez.reto6.process;

import edu.emmanuel_gutierrez.reto6.data.Empleado;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleados;

    // Constructor
    public Nomina() {
        this.empleados = new ArrayList<>();
    }

    // Método para agregar un empleado a la lista
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para generar el reporte de nómina
    public void generarReporteNomina() {
        // Implementación para calcular y mostrar el reporte de nómina
    }
}
