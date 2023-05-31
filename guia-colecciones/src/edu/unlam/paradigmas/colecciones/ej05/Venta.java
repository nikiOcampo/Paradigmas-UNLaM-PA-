package edu.unlam.paradigmas.colecciones.ej05;

public class Venta {
	private int mes;
	private double monto;
	
	
	@Override
	public String toString() {
		return "Venta [mes=" + mes + ", monto=" + monto + "]";
	}
	public Venta(int mes, double monto) {
		super();
		this.mes = mes;
		this.monto = monto;
	}
	public int getMes() {
		return mes;
	}
	public double getMonto() {
		return monto;
	}
	public void setMes(int mes) throws MiException {
		if(mes<1 || mes>12) {
			throw new MiException("No corresponfo a un mes valido");
		}
		this.mes = mes;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
}
