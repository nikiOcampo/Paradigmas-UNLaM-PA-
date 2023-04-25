package edu.unlam.paradigmas.entradasalida.ej02;

public class Resolucion {
	public void resolver(String nombreArchivo) {
		Archivo archivo = new Archivo(nombreArchivo);
		archivo.generarArchivoEntrada();
		int[] datos = archivo.leerArchivo();//guarda los datos del archivo aca
		
//		1.Escribir un archivo de entre 10 mil y 20 mil números enteros aleatorios, en el rango de 0 a 12000. (La cantidad de números debe ser aleatoria)
//		2.Leer dicho archivo, buscando (a) máximo, (b) mínimo, (c) promedio.
//		3.Escribr un segundo archivo con una tabla de resultados.

		// resuelvo
		int [] resultados= new int[3];
		resultados[0]=datos[0];//maximo
		resultados[1]=datos[0];//minimo
		int suma=datos[0];
		
		
		for(int i=1;i<datos.length;i++) {
			if(datos[i]>resultados[0]) {
				resultados[0]=datos[i];
			}
			if(datos[i]<resultados[1]) {
				resultados[1]=datos[i];
			}
			suma+=datos[i];
		}
		
		resultados[2]=suma/datos.length;  //promedio
		
		
		
		archivo.guardarArchivo(resultados);
	}
}
