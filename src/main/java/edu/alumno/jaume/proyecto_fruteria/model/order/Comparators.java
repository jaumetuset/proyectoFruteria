package edu.alumno.jaume.proyecto_fruteria.model.order;

import java.util.Comparator;

import edu.alumno.jaume.proyecto_fruteria.model.db.FrutasDb;

public class Comparators implements Comparator<FrutasDb> {

    @Override
    public int compare(FrutasDb o1, FrutasDb o2) {
        return 0;
    }

    public int comparePorNombre(FrutasDb o1, FrutasDb o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }

    public int comparePorTipo(FrutasDb o1, FrutasDb o2) {
        return o1.getTipo().compareTo(o2.getTipo());
    }

    public int comparePorPrecio(FrutasDb o1, FrutasDb o2) {
        return Double.compare(o1.getPrecio(), o2.getPrecio());
    }

    public int comparePorCantidad(FrutasDb o1, FrutasDb o2) {
        return Integer.compare(o1.getCantidad(), o2.getCantidad());
    }

}
