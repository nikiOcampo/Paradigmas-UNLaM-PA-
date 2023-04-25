package unlam.paradigmas.objetos.ej01;

public class Nota {
	
	private int valor;
    /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */
    public Nota(int valorInicial) {
    	if(valorInicial<0 || valorInicial>11) {
    		throw new Error("Nota inexistente");
    	}
    	valor=valorInicial;
    }
    
    /**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */
    public int obtenerValor() {
    	return valor;
    }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
    	return valor>=4;
    }
    
    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
    	return !this.aprobado();
    }
    
    /**
     * pre : nuevoValor está comprendido entre 0 y 10.
     * post: modifica el valor numérico de la Nota, cambiándolo
     *       por nuevoValor, siempre y cuando nuevoValor sea superior al
     *       valor numérico actual de la Nota.
     */
    public void recuperar(int nuevoValor){ 
    	if(nuevoValor<0 || nuevoValor>11) {
    		throw new Error("Nota inexistente");
    	}
    	if(nuevoValor > valor)
    		valor=nuevoValor;
    }
}
