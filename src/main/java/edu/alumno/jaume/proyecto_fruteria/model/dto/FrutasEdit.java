package edu.alumno.jaume.proyecto_fruteria.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FrutasEdit {

    private Long id;
    private String nombre;
    private String tipo;
    private Integer precio;
    private Integer cantidad;
}
