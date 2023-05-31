package edu.unlam.paradigmas.colecciones.ej02;

public class Venta {

	private int nro_venta;
	private Fecha fecha;
	private Hora hora;
	private String nombreCliente;
	private double monto;
	
	
	public Venta(int nro_venta, Fecha fecha, Hora hora, String nombreCliente, double monto) {
		super();
		this.nro_venta = nro_venta;
		this.fecha = fecha;
		this.hora = hora;
		this.nombreCliente = nombreCliente;
		this.monto = monto;
	}


	public int getNro_venta() {
		return nro_venta;
	}


	public Fecha getFecha() {
		return fecha;
	}


	public Hora getHora() {
		return hora;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public double getMonto() {
		return monto;
	}


	public void setNro_venta(int nro_venta) {
		this.nro_venta = nro_venta;
	}


	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}


	public void setHora(Hora hora) {
		this.hora = hora;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	@Override
	public String toString() {
		return "Venta [nro_venta=" + nro_venta + ", fecha=" + fecha + ", hora=" + hora + ", nombreCliente="
				+ nombreCliente + ", monto=" + monto + "]";
	}
	
	
	
	
}
