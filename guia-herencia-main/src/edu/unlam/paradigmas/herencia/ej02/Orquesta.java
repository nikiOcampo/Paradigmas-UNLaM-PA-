package edu.unlam.paradigmas.herencia.ej02;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {
	private List<InstrumentoMusical> orquesta= new ArrayList<>();

	@Override
	public String toString() {
		return "Orquesta [" + orquesta + "]";
	}

	public void añadirInstrumento(InstrumentoMusical instrumento) {
		orquesta.add(instrumento);
	}
	
	public void tocarTodosLosInstrumentos () {
		for (InstrumentoMusical instrumentoMusical : orquesta) {
			System.out.println(instrumentoMusical.tocar());
		}
	}
	
	public void tocarSoloInstrumentosDe(String tipoDeInstrumento) {
		for (InstrumentoMusical instrumentoMusical : orquesta) {
			if(instrumentoMusical.getTipo()==tipoDeInstrumento){
				System.out.println(instrumentoMusical.tocar());
			}
		}
	
	}
	
}
