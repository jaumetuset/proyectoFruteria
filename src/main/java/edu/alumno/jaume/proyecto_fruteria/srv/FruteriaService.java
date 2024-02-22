package edu.alumno.jaume.proyecto_fruteria.srv;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.alumno.jaume.proyecto_fruteria.model.db.FrutasDb;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FiltroAvanzadoFruta;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FrutasEdit;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FrutasInfo;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FrutasList;
import edu.alumno.jaume.proyecto_fruteria.model.dto.PaginaDto;

public interface FruteriaService {


    public PaginaDto<FrutasList> findAllFrutaList(FiltroAvanzadoFruta filtro, Pageable paging);
    public PaginaDto<FrutasList> findAllFrutaList(Pageable paging);

}
