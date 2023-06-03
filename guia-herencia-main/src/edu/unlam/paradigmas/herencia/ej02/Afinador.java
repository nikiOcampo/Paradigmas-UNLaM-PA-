package edu.unlam.paradigmas.herencia.ej02;

public class Afinador {
	public void afinarInstrumento(InstrumentoMusical instrumento, String tipoAfinacion) {
		if(instrumento.getTipo()== "Viento") {
			InstrumentoViento instrumentoViento= (InstrumentoViento) instrumento;
			if(tipoAfinacion=="Automatico")
				System.out.println(instrumentoViento.afinarAutomatico()); 
			else
				System.out.println(instrumentoViento.afinarManual()); 
		}else if(instrumento.getTipo()== "Cuerda") {
			InstrumentoCuerda instrumentoCuerda= (InstrumentoCuerda) instrumento;
			if(tipoAfinacion=="Automatico")
				System.out.println(instrumentoCuerda.afinarAutomatico()); 
			else
				System.out.println(instrumentoCuerda.afinarManual()); 
		}else {
			System.out.println("No se puede afinar este instrumeno: " + instrumento.getNombre());
		}
	}
}
