package edu.unlam.paradigmas.excepciones.ej06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resolucion {

	public void resolver(String nombreArchivo){
		
		String nombreArchivo1 = "archivo.txt";
        String nombreArchivo2;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

            nombreArchivo2 = br.readLine();

            try (BufferedReader br2 = new BufferedReader(new FileReader(nombreArchivo2))) {

                String linea;
                while ((linea = br2.readLine()) != null) {
                    System.out.println(linea);
                }

            } catch (IOException e) {
                System.err.println("No se pudo abrir el archivo: " + nombreArchivo2);
            }

        } catch (IOException e) {
            System.err.println("No se pudo abrir el archivo: " + nombreArchivo);
        }
    }

}
	

