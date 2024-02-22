package edu.alumno.jaume.proyecto_fruteria.exception;

public class FrutaNotFoundExeption extends Exception{
    public FrutaNotFoundExeption() {
        super("Fruta no encontrada");
    }

    public FrutaNotFoundExeption(String message) {
        super(message);
    }
}
