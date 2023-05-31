package edu.unlam.paradigmas.colecciones.ej07;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Tarea> colaTareas= new LinkedList<>();
		
		
		Tarea t1=new Tarea(1,"tarea1");
		Tarea t2=new Tarea(2,"tarea2");
		Tarea t3=new Tarea(3,"tarea3");
		Tarea t4=new Tarea(4,"tarea4");
		Tarea t5=new Tarea(5,"tarea5");
		Tarea t6=new Tarea(6,"tarea6");
		Tarea t7=new Tarea(7,"tarea7");
		Tarea t8=new Tarea(8,"tarea8");
		
		colaTareas.add(t1);
		colaTareas.add(t2);
		colaTareas.add(t4);
		colaTareas.add(t3);
		colaTareas.add(t5);
		colaTareas.add(t6);
		colaTareas.add(t8);
		colaTareas.add(t7);
		
		while(!colaTareas.isEmpty()) {
			System.out.println(colaTareas.toString()); 
			colaTareas.removeAll(colaTareas);
		}
		
		
	}

}
