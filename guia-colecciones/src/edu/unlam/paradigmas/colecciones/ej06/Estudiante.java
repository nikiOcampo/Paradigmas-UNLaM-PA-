package edu.unlam.paradigmas.colecciones.ej06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estudiante {
	 private Map<String, List<Double>> registro;

	    public Estudiante() {
        registro = new HashMap<>();
	    }


		public void agregarNota(String nombre, double nota) {
	        List<Double> notas = registro.getOrDefault(nombre, new ArrayList<>());
	        notas.add(nota);
	        registro.put(nombre, notas);
	    }

	    public double obtenerPromedio(String nombre) {
	        List<Double> notas = registro.get(nombre);
	        double sum = 0.0;
	        if (notas == null || notas.isEmpty()) {
	            return sum;
	        }
	        for (double nota : notas) {
	            sum += nota;
	        }
	        return sum / notas.size();
	    }

	    public Map<Double, List<String>> invertirMapa() {
	        Map<Double, List<String>> mapaInvertido = new HashMap<>();
	        for (Map.Entry<String, List<Double>> entry : registro.entrySet()) {
	            String nombre = entry.getKey();
	            //List<Double> notas = entry.getValue();
	            double promedio = obtenerPromedio(nombre);
	            List<String> estudiantes = mapaInvertido.getOrDefault(promedio, new ArrayList<>());
	            estudiantes.add(nombre);
	            mapaInvertido.put(promedio, estudiantes);
	        }
	        return mapaInvertido;
	    }
	
	
	
}
