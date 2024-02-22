package edu.alumno.jaume.proyecto_fruteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.alumno.jaume.proyecto_fruteria.model.db.FrutasDb;

@Repository
public interface CarritoRepository  extends JpaRepository<FrutasDb, Long>{

}
