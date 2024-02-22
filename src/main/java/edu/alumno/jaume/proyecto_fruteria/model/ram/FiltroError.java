package edu.alumno.jaume.proyecto_fruteria.model.ram;
public class FiltroError {
	String valor = "";
	String campo = "";
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	
	
	public FiltroError(String valor, String campo) {
		super();
		this.valor = valor;
		this.campo = campo;
	}
	
	public FiltroError() {
		
	}
}
