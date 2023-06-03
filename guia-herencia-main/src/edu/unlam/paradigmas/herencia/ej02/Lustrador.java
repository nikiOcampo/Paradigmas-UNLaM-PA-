package edu.unlam.paradigmas.herencia.ej02;

public class Lustrador {
	public void lustrarInstrumento(InstrumentoMusical instrumento) {
		if(instrumento.getTipo()== "Viento") {
			InstrumentoViento instrumentoViento= (InstrumentoViento) instrumento;
			System.out.println(instrumentoViento.lustrar()); 
		}else if(instrumento.getTipo()== "Percusion") {
			InstrumentoPercusion instrumentoPercusion= (InstrumentoPercusion) instrumento;
			System.out.println(instrumentoPercusion.lustrar());
		}else {
			System.out.println("No se puede lustrar este instrumeno: " + instrumento.getNombre());
		}
	}
}
