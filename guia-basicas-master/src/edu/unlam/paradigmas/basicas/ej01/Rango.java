package edu.unlam.paradigmas.basicas.ej01;

import java.util.Arrays;
import java.util.Objects;

public class Rango implements Comparable<Rango> {
	private double minimo;
	private double maximo;
	private int estado;// 1-cerrado, 2-abierto a derecha, 3- abierto a izquierda, 4-abierto

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public int getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		switch (estado) {
		case 1:
			return "Rango [" + minimo + " , " + maximo + "]";
		case 2:
			return "Rango [" + minimo + " , " + maximo + ")";
		case 3:
			return "Rango (" + minimo + " , " + maximo + "]";
		}
		return "Rango (" + minimo + " , " + maximo + ")";

	}

	private Rango(double minimo, double maximo, int estado) {
		if (minimo <= maximo) {
			this.minimo = minimo;
			this.maximo = maximo;
		}
		if (minimo > maximo) {
			this.maximo = minimo;
			this.minimo = maximo;
		}
		this.estado = estado;
	}

	public static Rango rangoCerrado(double minimo, double maximo) {
		return new Rango(minimo, maximo, 1);
	}

	public static Rango rangoAbiertoDer(double minimo, double maximo) {
		return new Rango(minimo, maximo, 2);
	}

	public static Rango rangoAbiertoIzq(double minimo, double maximo) {
		return new Rango(minimo, maximo, 3);
	}

	public static Rango rangoAbierto(double minimo, double maximo) {
		return new Rango(minimo, maximo, 4);
	}

	public boolean estaDentroDe(double numero) {
		if (numero == this.minimo) {
			return estado != 3 && estado != 4;
		}
		if (numero == this.maximo) {
			return estado != 2 && estado != 4;
		}
		if (numero < this.maximo && numero > this.minimo) {
			return true;
		}
		return false;
	}

	public boolean rangoEstaDentroDe(Rango r) {
		return r.estaDentroDe(this.minimo) && r.estaDentroDe(this.maximo);
	}

	public boolean hayInterseccion(Rango r) {
		if (this.maximo == r.minimo) {
			if (this.estado == r.estado || (this.estado == 2 && r.estado == 4) || (this.estado == 3 && r.estado == 4)) {
				return false;
			}
		}
		return r.estaDentroDe(this.minimo) || r.estaDentroDe(this.maximo) || this.estaDentroDe(r.minimo) || this.estaDentroDe(r.maximo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, maximo, minimo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Rango)) {
			return false;
		}
		Rango other = (Rango) obj;
		return estado == other.estado && Double.doubleToLongBits(maximo) == Double.doubleToLongBits(other.maximo)
				&& Double.doubleToLongBits(minimo) == Double.doubleToLongBits(other.minimo);
	}

	// 8.Se debe poder ordenar rangos mediante su inicio. Si empatan, se resuelve el
	// empate por su fin.
	// Si empatan, los rangos cerrados irán primero que los abiertos.
	public void ordenar(Rango[] r) {
		Arrays.sort(r);

	}

	@Override
	public int compareTo(Rango o) {
		// TODO Auto-generated method stub

		if (this.minimo < o.minimo) {
			return -1;
		}
		if (this.minimo < o.minimo) {
			return 1;
		}

		if (this.minimo == o.minimo) {
			if (this.maximo < o.maximo) {
				return -1;
			}
			if (this.maximo > o.maximo) {
				return 1;
			}
			if (this.estado < o.estado) {
				return -1;
			} else {
				return 1;
			}
		}
		return 0;
	}

//11.Proporcionar un método estático que devuelva un rango que abarque a todos los otros rangos.
	public static Rango rangoAbarcativo(Rango[] r) {

		double min = r[0].minimo, max = r[0].maximo;
		for (int i = 1; i < r.length; i++) {
			if (r[i].minimo < min) {
				min = r[i].minimo;
			}
			if (r[i].maximo > max) {
				max = r[i].maximo;
			}
		}

		return Rango.rangoCerrado(min, max);
	}
	
	
//12.Se deben poder sumar rangos, utilizando el inicio del primero y el fin del segundo.
	public Rango sumarRangos(Rango r) {
		
		return Rango.rangoCerrado(this.minimo, r.maximo);
	}

//13.Se debe poder calcular un rango intersección, que en caso de no existir tal intersección retornará (0.0, 0.0)
	public Rango interseccion(Rango r) {
		Rango inter= Rango.rangoCerrado(0, 0);
		if(this.hayInterseccion(r)) {
			if(this.estaDentroDe(r.minimo)) { //si el minimo del otro esta adentro de este
				inter.minimo=r.minimo;
			}else {
				inter.minimo=this.minimo;
			}
			if(this.estaDentroDe(r.maximo)) { //si el maximo del otro esta dentro de nuestro rango
				inter.maximo=r.maximo;
			}else {
				inter.maximo=this.maximo;
			}
		}
		
		
		
		return inter;
	}
	
//14.Se debe poder desplazar un rango con un número escalar.
	public Rango desplazar(int num) {
		this.minimo+=num;
		this.maximo+=num;
		
		return this;
	}
	
	

}
