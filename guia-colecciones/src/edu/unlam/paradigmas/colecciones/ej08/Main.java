package edu.unlam.paradigmas.colecciones.ej08;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> colaNumeros = new LinkedList<>();

		colaNumeros.add(1);
		colaNumeros.add(2);
		colaNumeros.add(3);

		System.out.println("Cola Original: " + colaNumeros);

		invertirCola(colaNumeros);

		System.out.println("Cola Invertida: " + colaNumeros);

	}

	private static void invertirCola(Queue<Integer> colaNumeros) {
		if (colaNumeros.isEmpty()) {
			return;
		}

		Integer numero = colaNumeros.poll();
		invertirCola(colaNumeros);
		colaNumeros.offer(numero);
	}

}
