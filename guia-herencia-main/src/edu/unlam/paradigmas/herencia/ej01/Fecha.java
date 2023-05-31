package edu.unlam.paradigmas.herencia.ej01;

import java.util.Objects;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	
	@Override
	public String toString() {
		return  dia + "/" + mes + "/" +  anio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dia, mes, anio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return anio == other.anio && dia == other.dia && mes == other.mes;
	}
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
}
