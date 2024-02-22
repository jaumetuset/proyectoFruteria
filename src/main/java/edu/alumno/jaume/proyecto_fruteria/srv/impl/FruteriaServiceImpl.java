package edu.alumno.jaume.proyecto_fruteria.srv.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.alumno.jaume.proyecto_fruteria.model.db.FrutasDb;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FiltroAvanzadoFruta;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FrutasEdit;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FrutasInfo;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FrutasList;
import edu.alumno.jaume.proyecto_fruteria.model.dto.PaginaDto;
import edu.alumno.jaume.proyecto_fruteria.repository.FruteriaRepository;
import edu.alumno.jaume.proyecto_fruteria.srv.FruteriaService;
import edu.alumno.jaume.proyecto_fruteria.srv.mapper.FruteriaMapper;

@Service
public class FruteriaServiceImpl implements FruteriaService {

    private final FruteriaRepository fruteriaRepository;

    public FruteriaServiceImpl(FruteriaRepository fruteriaRepository) {
        this.fruteriaRepository = fruteriaRepository;
    }

   @Override
    public PaginaDto<FrutasList> findAllFrutaList(FiltroAvanzadoFruta filtro, Pageable paging) {
        Page<FrutasDb> paginaFrutaDb;
        if (filtro != null && filtro.getPrecio() != null) {
            // Realiza la búsqueda por tipo de fruta si se especifica en el filtro
            paginaFrutaDb = fruteriaRepository.findByPrecio(filtro.getPrecio(), paging);
        } else {
            // Si no se especifica un tipo de fruta en el filtro, simplemente devuelve todas las frutas paginadas
            paginaFrutaDb = fruteriaRepository.findAll(paging);
        }

        return new PaginaDto<FrutasList>(
                paginaFrutaDb.getNumber(), // número de página solicitada
                paginaFrutaDb.getSize(), // tamaño de la página
                paginaFrutaDb.getTotalElements(), // total de elementos devueltos por la consulta sin paginación
                paginaFrutaDb.getTotalPages(), // total páginas teniendo en cuenta el tamaño de cada página
                FruteriaMapper.INSTANCE.frutasDbToFrutasList(paginaFrutaDb.getContent()), // lista de elementos
                paginaFrutaDb.getSort()); // ordenación de la consulta
    }

    @Override
    public PaginaDto<FrutasList> findAllFrutaList(Pageable paging) {
        // Devuelve todas las frutas paginadas
        Page<FrutasDb> paginaFrutaDb = fruteriaRepository.findAll(paging);
        return new PaginaDto<FrutasList>(
                paginaFrutaDb.getNumber(), // número de página solicitada
                paginaFrutaDb.getSize(), // tamaño de la página
                paginaFrutaDb.getTotalElements(), // total de elementos devueltos por la consulta sin paginación
                paginaFrutaDb.getTotalPages(), // total páginas teniendo en cuenta el tamaño de cada página
                FruteriaMapper.INSTANCE.frutasDbToFrutasList(paginaFrutaDb.getContent()), // lista de elementos
                paginaFrutaDb.getSort()); // ordenación de la consulta
    }


}
