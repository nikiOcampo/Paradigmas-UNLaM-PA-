package edu.unlam.paradigmas.colecciones.ej02;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	
	
	
	
	@Override
	public String toString() {
		return + hora + ":" + minuto + ":" + segundo;
	}
	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
}
