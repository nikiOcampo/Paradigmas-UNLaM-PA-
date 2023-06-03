package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoCuerda extends InstrumentoMusical implements Afinable{

	public InstrumentoCuerda(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "tocando un instrumento de Cuerda: "+ getNombre();
	}

	@Override
	public String afinarManual() {
		// TODO Auto-generated method stub
		return "afinando de forma Manual un intrumeto de Cuerda:" + getNombre();
	}
		
	@Override
	public String afinarAutomatico() {
		// TODO Auto-generated method stub
		return "afinando de forma Automatico un intrumeto de Cuerda:" + getNombre();
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Cuerda";
	}

}
