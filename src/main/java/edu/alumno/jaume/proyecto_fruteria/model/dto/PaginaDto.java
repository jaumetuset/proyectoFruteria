package edu.alumno.jaume.proyecto_fruteria.model.dto;

import java.util.List;
import org.springframework.data.domain.Sort;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaginaDto<T>{
    int number; // numero de paginacion solicitada
    int size; //tamaño de la paginacion
    long totalElements; // total de elementos devueltos por la consulta sin paginacion
    int totalPages; //numero total de paginas 

    List<T> content; //lista de elementos;
    Sort sort; //ordenacion de la consulta
}
