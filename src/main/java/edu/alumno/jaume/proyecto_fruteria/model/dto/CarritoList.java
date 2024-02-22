package edu.alumno.jaume.proyecto_fruteria.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarritoList  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private FrutasList fruta;
    private Integer cantidad;
    private Integer precioTotal;

    public CarritoList(FrutasList fruta,Integer cantidad,Integer precioTotal){
        this.fruta=fruta;
        this.cantidad=cantidad;
        this.precioTotal=precioTotal;
    }
}


