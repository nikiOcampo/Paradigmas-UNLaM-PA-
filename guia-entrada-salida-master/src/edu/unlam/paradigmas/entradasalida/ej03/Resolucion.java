package edu.unlam.paradigmas.entradasalida.ej03;

public class Resolucion {
	public void resolver(String nombreArchivo) {
		Archivo archivo = new Archivo(nombreArchivo);
		int[] datos = archivo.leerArchivo();//guarda los datos del archivo aca //20
		int[] resultados= new int[datos.length/2]; //10
		int[] peso= new int[datos.length/2];
		int[] altura= new int[datos.length/2];
		int j=0;
		//resolucion
		for(int i=0;i<datos.length;i+=2){
			peso[j]=datos[i];
			altura[j]=datos[i+1];
			j++;
		}
		for(int i=0; i<peso.length; i++) {
			
			for(int k=0;k<peso.length;k++) {
				if(peso[i]>=peso[k] && i!=k) {
					if(altura[i]>=altura[k]) {
						resultados[i]++;
					}
				}
			}
		}
		
		archivo.guardarArchivo(resultados);
	}
}
