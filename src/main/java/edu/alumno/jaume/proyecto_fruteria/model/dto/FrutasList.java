package edu.alumno.jaume.proyecto_fruteria.model.dto;

import java.io.Serializable;

import edu.alumno.jaume.proyecto_fruteria.model.db.FrutasDb;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FrutasList  implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nombre;
    private String tipo;
    private Integer precio;
    private Integer cantidad;

    // Constructor de FrutasList que acepta un FrutasDb
    public FrutasList(FrutasDb frutaDb) {
        this.id = frutaDb.getId();
        this.nombre = frutaDb.getNombre();
        this.tipo = frutaDb.getTipo();
        this.precio = frutaDb.getPrecio();
        this.cantidad = frutaDb.getCantidad();
    }

}
