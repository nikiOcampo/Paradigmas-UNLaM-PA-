package unlam.paradigmas.objetos.ej04;

public class Cubo {

	// completar
	private double longitudLado;
	private double areaCara;
	private double volumen;
	
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    public Cubo (double longitudLado) {
    	this.longitudLado=longitudLado;
    	areaCara= longitudLado * longitudLado;
    	volumen= areaCara * longitudLado;
    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() {
    	return longitudLado;
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
    	this.longitudLado=longitudLado;
    }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() {
    	return areaCara;
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
    	this.areaCara=areaCara;
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
    	return volumen;
    }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) {
    	this.volumen= volumen;
    }
}
