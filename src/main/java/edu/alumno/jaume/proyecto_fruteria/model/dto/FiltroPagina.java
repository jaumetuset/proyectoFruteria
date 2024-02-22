package edu.alumno.jaume.proyecto_fruteria.model.dto;


import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class FiltroPagina {
    @Range(min = 0, message = "La página debe de ser un valor positivo")
    int page;
    @Range(min = 1, message = "La página debe de ser un valor mayor o igual a 1")
    int size;
    String orderBy;
}


