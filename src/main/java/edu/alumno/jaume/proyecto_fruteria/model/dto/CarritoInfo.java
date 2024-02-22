package edu.alumno.jaume.proyecto_fruteria.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarritoInfo implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;
    private FrutasInfo fruta;
    private Integer cantidad;
    private Integer precioTotal;
}
