package edu.unlam.paradigmas.colecciones.ej07;

public class Tarea {
	private int id;
	private String descripcion;
	
	
	public Tarea(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Tarea [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
