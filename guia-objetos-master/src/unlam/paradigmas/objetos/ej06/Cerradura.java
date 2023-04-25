package unlam.paradigmas.objetos.ej06;

public class Cerradura {

	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean estaAbierta;
	private boolean estaBloqueada;
	private int cantAperturasExitosas;
	private int cantAperturasFallidas;

	/**
	 * pre : la cerradura esta cerrada, y desbloqueada, no se hizo ninguna apertura 
	 * post: cierra la cerradura.
	 */
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura=claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		estaAbierta= false;
		estaBloqueada=false;
		cantAperturasExitosas=0;
		cantAperturasFallidas=0;
	}

	// pre: la cerradura esta cerrada
	//post : intento de abrir la cerradura
	public boolean abrir(int clave) {
		if(claveDeApertura!=clave) {
			estaAbierta=false;
			cantAperturasFallidas++;
			if(cantAperturasFallidas==cantidadDeFallosConsecutivosQueLaBloquean) {
				estaBloqueada=true;
			}
			return false;
		}
		cantAperturasExitosas++;
		estaAbierta=true;
		return true;
	}
	
	/**
	 * pre : esta abierta. 
	 * post: cierra la cerradura.
	 */
	public void cerrar() {
		if(estaAbierta)
			estaAbierta=false;
	}
	/**
	 * post: devuelve si la cerradura esta abierta
	 */
	public boolean estaAbierta() {
		return estaAbierta;
	}
	/**
	 * post: devuelve si la cerradura esta cerrada
	 */
	public boolean estaCerrada() {
		return !estaAbierta;
	}
	/**
	 * post: devuelve si la cerradura esta bloqueada
	 */
	public boolean fueBloqueada() {
		return estaBloqueada;
	}
	/**
	 * post: devuelve la cantidad de aperturas exitosas
	 */
	public int contarAperturasExitosas() {
		return cantAperturasExitosas;
	}
	/**
	 * post: devuelve la cantidad de aperturas fallidas
	 */
	public int contarAperturasFallidas() {
		return cantAperturasFallidas;
	}

	
}
