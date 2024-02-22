package edu.alumno.jaume.proyecto_fruteria.srv.mapper;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import edu.alumno.jaume.proyecto_fruteria.model.db.FrutasDb;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FrutasList;

@Mapper
public interface FruteriaMapper {
   
    FruteriaMapper INSTANCE = Mappers.getMapper(FruteriaMapper.class);

    List<FrutasList> frutasDbToFrutasList(List<FrutasDb> frutasDb);



  
}
