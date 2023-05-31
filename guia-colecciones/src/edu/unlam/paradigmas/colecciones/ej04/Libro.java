package edu.unlam.paradigmas.colecciones.ej04;

import java.util.Objects;

public class Libro {
	private String titulo;
	private String autor;
	private String editorial;
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Libro(String titulo, String autor, String editorial) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo, autor, editorial);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(editorial, other.editorial)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
	
	
	
	
}
