package edu.unlam.paradigmas.entradasalida.ej02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Archivo {
	private String nombre;

	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public void generarArchivoEntrada() {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("casos de prueba/ejercicio02/in/" + this.nombre + ".in");
			printerWriter = new PrintWriter(file);
			Random random = new Random();
		    int[] numerosAleatorios = new int[10000];

		    for (int i = 0; i < numerosAleatorios.length; i++) {
		      numerosAleatorios[i] = random.nextInt(12001);
		      printerWriter.println(numerosAleatorios[i]);
		    }
		    
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@SuppressWarnings("resource")
	public int[] leerArchivo() {
		Scanner scanner = null;
		int[] datos = null;
		int contador=0;

		try {
			File file = new File("casos de prueba/ejercicio02/in/" + this.nombre + ".in");
			scanner = new Scanner(file);
			// Especifica la configuración regional que se va a utilizar
			scanner.useLocale(Locale.ENGLISH);
			// Para la configuración regional de Argentina, utilizar:
			// arch.useLocale(new Locale("es_AR"));

            while (scanner.hasNext()) {
            	contador++;
            	scanner.next();
            }
            datos = new int[contador];
            scanner = new Scanner(file); // reiniciar el scanner
            scanner.useLocale(Locale.ENGLISH);
			for (int i = 0; i < contador; i++) {
				int n = scanner.nextInt();
				datos[i] = n;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar el archivo, eso es mucho muy importante
			scanner.close();
		}
		return datos;
	}

	public void guardarArchivo(int[] datos) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter("casos de prueba/ejercicio02/out/" + this.nombre + ".out");
			printerWriter = new PrintWriter(file);

//			for (int i = 0; i < datos.length; i++) {
//				// Imprime los datos y hace un salto de linea
//				
////				+----------+-------+
////				| Máximo   | 11978 |
////				+----------+-------+
////				| Mínimo   |     3 |
////				+----------+-------+
////				| Promedio |  7201 |
////				+----------+-------+
//				
//				printerWriter.println(datos[i]);
//			}
			printerWriter.println("+-----------+-------+");
			printerWriter.printf("| %-9s | %5s |\n", "Máximo:", datos[0]);
			printerWriter.println("+-----------+-------+");
			printerWriter.printf("| %-9s | %5s |\n", "Mínimo:", datos[1]);
			printerWriter.println("+-----------+-------+");
			printerWriter.printf("| %-9s | %5s |\n", "Promedio:", datos[2]);
			printerWriter.println("+-----------+-------+");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
