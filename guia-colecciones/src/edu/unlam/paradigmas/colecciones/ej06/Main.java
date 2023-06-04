package edu.unlam.paradigmas.colecciones.ej06;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,List<Double>> registroAlumnos=new HashMap<String,List<Double>>();
		Estudiante registroEstudiantes = new Estudiante();
		
		registroEstudiantes.agregarNota("Juan", 8.5);
        registroEstudiantes.agregarNota("Juan", 7.5);
        registroEstudiantes.agregarNota("María", 9.0);
        registroEstudiantes.agregarNota("Pedro", 7.0);
        registroEstudiantes.agregarNota("Pedro", 8.0);
        registroEstudiantes.agregarNota("María", 8.5);
        registroEstudiantes.agregarNota("Milos", 7.0);
        registroEstudiantes.agregarNota("Milos", 8.0);
        
        // Obtener promedio
        double promedioJuan = registroEstudiantes.obtenerPromedio("Juan");
        System.out.println("Promedio de Juan: " + promedioJuan);
		
        
        // Invertir mapa y obtener listado de estudiantes por promedio
        Map<Double, List<String>> mapaInvertido = registroEstudiantes.invertirMapa();
        for (Map.Entry<Double, List<String>> entry : mapaInvertido.entrySet()) {
            double promedio = entry.getKey();
            List<String> estudiantes = entry.getValue();
            System.out.println("Promedio " + promedio + ": " + estudiantes);
        }
        
	}

}
