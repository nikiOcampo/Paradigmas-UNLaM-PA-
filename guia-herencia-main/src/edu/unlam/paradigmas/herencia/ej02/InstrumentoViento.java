package edu.unlam.paradigmas.herencia.ej02;

public class InstrumentoViento extends InstrumentoMusical implements Afinable,Lustrable{
	
	private Material tipoMaterial;

	public InstrumentoViento(String nombre, String descripcion, Material tipoMaterial) {
		super(nombre, descripcion);
		this.setTipoMaterial(tipoMaterial);
	}

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "tocando un instrumento de viento: "+ getNombre() + "del tipo " + getTipoMaterial();
	}

	public Material getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(Material tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	@Override
	public String afinarManual() {
		// TODO Auto-generated method stub
		return "afinando de forma Manual un intrumeto de viento:" + getNombre();
	}

	@Override
	public String afinarAutomatico() {
		// TODO Auto-generated method stub
		return "afinando de forma Automatico un intrumeto de Viento: " + getNombre();
	}

	@Override
	public String lustrar() {
		// TODO Auto-generated method stub
		return "lustrando un intrumento de viento: "+ getNombre();
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Viento";
	}
	
	
	

}
