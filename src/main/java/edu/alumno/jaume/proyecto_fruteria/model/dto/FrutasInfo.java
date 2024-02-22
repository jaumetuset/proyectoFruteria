package edu.alumno.jaume.proyecto_fruteria.model.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FrutasInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nombre;
    private String tipo;
    private Integer precio;
    private Integer cantidad;
}
