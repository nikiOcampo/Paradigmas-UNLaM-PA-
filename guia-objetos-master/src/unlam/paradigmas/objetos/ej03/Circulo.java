package unlam.paradigmas.objetos.ej03;

public class Circulo {
	// completar
	private int radio;
	private int diametro;
	private double perimetro;
	private double area;
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	public int getRadio() {
		return radio;
	}
	
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public int getDiametro() {
		return 2*radio;
	}
	
	public double getPerimetro() {
		return diametro * Math.PI;
	}
	
	public double getArea() {
		return radio * radio * Math.PI;
	}
	
}
