package edu.unlam.paradigmas.entradasalida.ej01;

import java.util.Arrays;

public class Resolucion {
	public void resolver(String nombreArchivo) {
		Archivo archivo = new Archivo(nombreArchivo);
		int[] datos = archivo.leerArchivo();//guarda los datos del archivo aca
		int[] datosnuevos= new int[datos.length];
		int contador=0;
		// resuelvo
		for (int i = 0; i < datos.length;i++) {
			int j=0;
			while(j<datos.length && datosnuevos[j]!=datos[i]) {
				j++;
			}
			if(j==datos.length) {
				datosnuevos[contador]=datos[i];
				contador++;
			}		
		}
		
		//copio para no tener en cuanta los ceros y ordeno
		int[] datosordenado= new int[contador];
		for(int i=0;i<datosordenado.length;i++) {
			datosordenado[i]=datosnuevos[i];
		}
		Arrays.sort(datosordenado);
		
		//agrego el contador en la primera posicion y copio el ordenado
		int[] datosfinal= new int[contador+1];
		datosfinal[0]=contador;
		for(int i=1;i<datosfinal.length;i++) {
			datosfinal[i]=datosordenado[i-1];
		}
		
		archivo.guardarArchivo(datosfinal);
	}
}
