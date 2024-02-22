package edu.alumno.jaume.proyecto_fruteria.model.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FiltroAvanzadoFruta  extends FiltroPagina implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer precio;
    private Integer cantidad;
    private String tipo;

}
