package edu.emmanuel_gutierrez.reto5.caso1.process;

import edu.emmanuel_gutierrez.reto5.caso1.data.Propiedad;
import edu.emmanuel_gutierrez.reto5.caso1.data.Ubicacion;

import java.util.ArrayList;
import java.util.List;

// Clase AdaptadorListaPropiedades
class ListaPropiedades{
    private List<Propiedad> propiedades;

    // Constructor
    public ListaPropiedades() {
        propiedades = new ArrayList<>();
    }

    // Métodos para manipular la lista de propiedades
    public void agregarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    public void eliminarPropiedad(Propiedad propiedad) {
        propiedades.remove(propiedad);
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }
}

// Clase AdaptadorListaPropiedades
public class AdaptadorListaPropiedades {
    // Método para adaptar los datos de la lista de propiedades para la interfaz de usuario
    public void adaptarPropiedades(List<Propiedad> propiedades) {
        // Aquí iría la lógica para adaptar los datos de las propiedades para mostrar en la interfaz de usuario
    }
}
