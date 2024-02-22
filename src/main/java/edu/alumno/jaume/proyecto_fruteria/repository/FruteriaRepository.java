package edu.alumno.jaume.proyecto_fruteria.repository;

import org.springframework.data.domain.Pageable;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.alumno.jaume.proyecto_fruteria.model.db.FrutasDb;
import edu.alumno.jaume.proyecto_fruteria.model.dto.FrutasList;

@Repository
public interface FruteriaRepository extends JpaRepository<FrutasDb, Long>{

    Page<FrutasDb> findByPrecio(Integer precio, Pageable paging);
   
    
}
    
