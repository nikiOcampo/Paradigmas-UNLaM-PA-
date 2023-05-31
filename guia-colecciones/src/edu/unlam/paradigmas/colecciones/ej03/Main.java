package edu.unlam.paradigmas.colecciones.ej03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Ingrese un texto: ");

		String texto = consola.nextLine();

		Set<String> palabras = new HashSet<String>();
		String[] listaPalabras = texto.split("\\s+"); // armamos un array con las palabras unicas
		for (String palabra : listaPalabras) {
			palabras.add(palabra);
		}

		
		System.out.println("Palabras únicas:");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}


		
	}

}
