package edu.unlam.paradigmas.colecciones.ej05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Double> venta=new HashMap<Integer,Double>();
		
		Venta v1=new Venta(1,59700.5);
		Venta v2=new Venta(2,38002.0);
		Venta v3=new Venta(3,18500.5);
		Venta v4=new Venta(4,34402.0);
		Venta v5=new Venta(5,12600.5);
		Venta v6=new Venta(6,52402.0);
		Venta v7=new Venta(7,11100.5);
		Venta v8=new Venta(8,10032.0);
		
		venta.put(v1.getMes(),v1.getMonto());
		venta.put(v2.getMes(),v2.getMonto());
		venta.put(v3.getMes(),v3.getMonto());
		venta.put(v4.getMes(),v4.getMonto());
		venta.put(v5.getMes(),v5.getMonto());
		venta.put(v6.getMes(),v6.getMonto());
		venta.put(v7.getMes(),v7.getMonto());
		venta.put(v8.getMes(),v8.getMonto());
		
		Scanner consola= new Scanner(System.in);
		System.out.println("Ingrese el mes que desea agregar al sistema: ");
		int nuevoMes= consola.nextInt();
		System.out.println("Ingrese el monton correspondiente a dicho mes: ");
		double nuevoMonto=consola.nextDouble();
		
		venta.put(nuevoMes, nuevoMonto);
		
		
		System.out.println("Ingrse el mes del que desea ver el monto de ventas: ");
		int mesAver= consola.nextInt();
		
		System.out.println(venta.get(mesAver)); 
		consola.close();
	}

}

