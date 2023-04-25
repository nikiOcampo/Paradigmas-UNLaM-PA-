package unlam.paradigmas.objetos.ej02;

public class Punto {
	// completar
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	public boolean estaSobreEjeX(){
		return y==0;
	}
	
	public boolean estaSobreEjeY(){
		return x==0;
	}
	
	public boolean esElOrigen(){
		return y==0 && x==0;
	}
	
	public double distanciaAlOrigen() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	public double distanciaAOtroPunto(Punto otro) {
		return Math.sqrt((Math.pow(x-otro.x, 2)+ Math.pow(y-otro.y,2)));
	}
}
