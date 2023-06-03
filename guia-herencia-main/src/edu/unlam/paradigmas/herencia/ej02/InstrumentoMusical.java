package edu.unlam.paradigmas.herencia.ej02;

public abstract class InstrumentoMusical {
	private String nombre;
	private String descripcion;
	
	public InstrumentoMusical(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "InstrumentoMusical [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	public abstract String tocar();
	public abstract String getTipo();
}
