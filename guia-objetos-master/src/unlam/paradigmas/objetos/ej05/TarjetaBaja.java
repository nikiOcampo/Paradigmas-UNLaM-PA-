package unlam.paradigmas.objetos.ej05;

public class TarjetaBaja {

	// completar
	private double saldoInicial;
	private int cantViajesColectivo;
	private int cantViajesSubte;
	
	/**
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		this.saldoInicial=saldoInicial;
		cantViajesColectivo=0;
		cantViajesSubte=0;
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return saldoInicial;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		saldoInicial+=monto;
	}

	/**
	 * pre : saldo suficiente.
	 * post: utiliza 39.59 del saldo para un viaje en colectivo.
	 */
	public void pagarViajeEnColectivo() {
		saldoInicial-=39.59;
		cantViajesColectivo++;
	}

	/**
	 * pre : saldo suficiente. 
	 * post: utiliza 34.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		saldoInicial-=34.50;
		cantViajesSubte++;
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return cantViajesColectivo + cantViajesSubte;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return cantViajesColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return cantViajesSubte;
	}

}
