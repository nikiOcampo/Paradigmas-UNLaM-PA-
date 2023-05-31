package edu.unlam.paradigmas.colecciones.ej01;

public class Paquete {
	private int nro_seguimiento;
	private String direccion_origen;
	private String direccion_destino;
	private double peso; 
	
	
	public Paquete(int nro_seguimiento, String direccion_origen, String direccion_destino, double peso) {
		super();
		this.nro_seguimiento = nro_seguimiento;
		this.direccion_origen = direccion_origen;
		this.direccion_destino = direccion_destino;
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Paquete [nro_seguimiento=" + nro_seguimiento + ", direccion_origen=" + direccion_origen
				+ ", direccion_destino=" + direccion_destino + ", peso=" + peso + "]";
	}
	public int getNro_seguimiento() {
		return nro_seguimiento;
	}
	public String getDireccion_origen() {
		return direccion_origen;
	}
	public String getDireccion_destino() {
		return direccion_destino;
	}
	public double getPeso() {
		return peso;
	}
	public void setNro_seguimiento(int nro_seguimiento) {
		this.nro_seguimiento = nro_seguimiento;
	}
	public void setDireccion_origen(String direccion_origen) {
		this.direccion_origen = direccion_origen;
	}
	public void setDireccion_destino(String direccion_destino) {
		this.direccion_destino = direccion_destino;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
}
