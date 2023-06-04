package edu.unlam.paradigmas.colecciones.ej01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola= new Scanner(System.in);
		List<Paquete> listaPaquete= new ArrayList<Paquete>();
		
		
		Paquete p1= new Paquete(1, "brasil 429", "chile 459", 2.3);
		Paquete p2= new Paquete(2, "haedo 123", "turco 987", 2.5);
		Paquete p3= new Paquete(3, "moron 345", "solis 876", 2.7);
		Paquete p4= new Paquete(4, "minos 234", "moria 567", 3.7);
		Paquete p5= new Paquete(5, "castro 902", "leno 309", 5.9);
		
		listaPaquete.add(p1);
		listaPaquete.add(p2);
		listaPaquete.add(p3);
		listaPaquete.add(p4);
		listaPaquete.add(p5);
		
		//int nro_seg=4;
		
		System.out.println("Ingrese el numero de seguimiento del paquete que desea ver: ");
		int nro_seg = consola.nextInt();
		
		for(Paquete paquete: listaPaquete) {
			if(paquete.getNro_seguimiento() == nro_seg) {
				System.out.println(paquete.toString());
				
			}
		}
		
		System.out.println("Ingrese el peso minimo de los paquetes que desea ver: ");
		double peso_determinado = consola.nextDouble();
		
		//double peso_determinado=3.2;
		for(Paquete paquete: listaPaquete) {
			if(paquete.getPeso() > peso_determinado) {
				System.out.println(paquete.toString());	
			}
		}
		
		consola.close();
		
	}

}
