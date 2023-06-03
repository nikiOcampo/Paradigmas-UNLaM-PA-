package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoPercusion extends InstrumentoMusical implements Lustrable {

	public InstrumentoPercusion(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "tocando un instrumento de Percucion: "+ getNombre();
	}

	@Override
	public String lustrar() {
		// TODO Auto-generated method stub
		return "lustrando un instrumento de Percusion: " + getNombre();
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Percusion";
	}

	
}
