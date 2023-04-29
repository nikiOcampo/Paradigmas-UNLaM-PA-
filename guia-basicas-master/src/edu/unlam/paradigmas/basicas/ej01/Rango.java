package edu.unlam.paradigmas.basicas.ej01;

public class Rango {
	private double minimo;
	private double maximo;
	private int estado;//1-cerrado, 2-abierto a derecha, 3- abierto a izquierda, 4-cerrado
	
	
	public double getMinimo() {
		return minimo;
	}

	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public void setMaximo(double maximo) {
		this.maximo = maximo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		switch (estado) {
		case 1:
			return "Rango [minimo=" + minimo + ", maximo=" + maximo + "]";
		case 2:
			return "Rango [minimo=" + minimo + ", maximo=" + maximo + ")";
		case 3:
			return "Rango (minimo=" + minimo + ", maximo=" + maximo + "]";
		}
		return "Rango (minimo=" + minimo + ", maximo=" + maximo + ")";
		
	}

	public Rango(){
		
	}
	
	private Rango(double minimo, double maximo, int estado){
		this.minimo=minimo;
		this.maximo=maximo;
		this.estado=estado;
	}
	
	public static Rango rangoCerrado(double minimo,double maximo){
		return new Rango(minimo,maximo,1);
	}

	public static Rango rangoAbiertoDer(double minimo,double maximo){
		return new Rango(minimo,maximo,2);
	}
	
	public static Rango rangoAbiertoIzq(double minimo,double maximo){
		return new Rango(minimo,maximo,3);
	}
	
	public static Rango rangoAbierto(double minimo,double maximo){
		return new Rango(minimo,maximo,4);
	}
	
	public boolean estaDentroDe(double numero) {
		if(numero==minimo) {
			return estado!=3 && estado!=4;
		}
		if(numero==maximo) {
			return estado!=2 && estado!=4;
		}
		if(numero<maximo && numero>minimo)
		{
			return true;
		}
		return false;
	}
	
	public boolean rangoEstaDentroDe(Rango r) {
		if(r.estado==4 && r.minimo==minimo && estado==2) {
			return false;
		}
		if(r.estado==4 && r.maximo==maximo && estado==3) {
			return false;
		}
		if(r.estado==4 && estado==1 && (r.minimo==minimo || r.maximo==maximo)) {
			return false;
		}
		return r.minimo>minimo && r.maximo<maximo;
	}
	
	
	
}
