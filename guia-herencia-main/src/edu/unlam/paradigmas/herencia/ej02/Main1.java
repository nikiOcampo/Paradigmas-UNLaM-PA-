package edu.unlam.paradigmas.herencia.ej02;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear una orquesta, compuesta por varios instrumentos. 
		//Debe ser posible tocar todos los instrumentos juntos, o los de viento, percusión y cuerdas por separado.
		Orquesta orquesta= new Orquesta();
		
		InstrumentoMusical flauta= new InstrumentoViento("Flauta", "flauta traviesa",Material.MADERA);
		InstrumentoMusical clarinete= new InstrumentoViento ("Clarinete", "Clarinete 1", Material.MADERA);
		InstrumentoMusical trompeta= new InstrumentoViento("Trompeta", "Trompeta 1", Material.METAL);
		InstrumentoMusical armonica= new InstrumentoViento("Armonica", "Armonica 1", Material.METAL);
		InstrumentoMusical violin= new InstrumentoCuerda("Violin", "cuerda frotada");
		InstrumentoMusical violonchelo= new InstrumentoCuerda("Violonchelo", "cuerda frotada");
		InstrumentoMusical guitarra= new InstrumentoCuerda("Guitarra", "guitarra electrica");
		InstrumentoMusical piano= new InstrumentoCuerda("Piano", "cuerda percutida");
		InstrumentoMusical ukelele= new InstrumentoCuerda("Ukele", "cuerda pulsada");
		InstrumentoMusical bateria= new InstrumentoPercusion("Bateria", "Bateria 1");
		InstrumentoMusical xilofon= new InstrumentoPercusion("Xilofon", "percusion melodica");
		InstrumentoMusical timbales= new InstrumentoPercusion("Timbales", "percusion");
		InstrumentoMusical platillos= new InstrumentoPercusion("Platillos", "percusion");
		
		orquesta.añadirInstrumento(flauta);
		orquesta.añadirInstrumento(clarinete);
		orquesta.añadirInstrumento(trompeta);
		orquesta.añadirInstrumento(armonica);
		orquesta.añadirInstrumento(violin);
		orquesta.añadirInstrumento(violonchelo);
		orquesta.añadirInstrumento(guitarra);
		orquesta.añadirInstrumento(piano);
		orquesta.añadirInstrumento(ukelele);
		orquesta.añadirInstrumento(bateria);
		orquesta.añadirInstrumento(xilofon);
		orquesta.añadirInstrumento(timbales);
		orquesta.añadirInstrumento(platillos);
		
		System.out.println("Tocando todos los intrumentos: ");
		orquesta.tocarTodosLosInstrumentos();
		System.out.println("Tocando los instrumentos de viento: ");
		orquesta.tocarSoloInstrumentosDe("Viento");
		System.out.println("Tocando los instrumentos de cuerda: ");
		orquesta.tocarSoloInstrumentosDe("Cuerda");
		System.out.println("Tocando los instrumentos de percusion: ");
		orquesta.tocarSoloInstrumentosDe("Percusion");
	
		Lustrador lustrador= new Lustrador();
		
		lustrador.lustrarInstrumento(platillos);
		lustrador.lustrarInstrumento(violin);
		lustrador.lustrarInstrumento(flauta);
	
		Afinador afinador= new Afinador();
		
		afinador.afinarInstrumento(platillos, "Manual");
		afinador.afinarInstrumento(guitarra, "Automatico");
		afinador.afinarInstrumento(flauta, "Manual");
	}

}
