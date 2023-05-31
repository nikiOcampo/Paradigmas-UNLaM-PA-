package edu.unlam.paradigmas.colecciones.ej02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		List<Venta> ventas = new ArrayList<Venta>();

		Venta v1 = new Venta(1, new Fecha(2, 10, 2023), new Hora(15, 10, 40), "Milos Kraicek", 1500.0);
		Venta v2 = new Venta(2, new Fecha(3, 10, 2023), new Hora(13, 10, 50), "Niki Ocampo", 1780.0);
		Venta v3 = new Venta(3, new Fecha(3, 10, 2023), new Hora(22, 10, 55), "Fede Martucci", 2000.0);
		Venta v4 = new Venta(4, new Fecha(3, 10, 2023), new Hora(10, 54, 33), "Facu Mediotte", 5600.0);
		Venta v5 = new Venta(5, new Fecha(4, 10, 2023), new Hora(12, 34, 32), "Lauti Gonzalez", 3200.0);
		Venta v6 = new Venta(6, new Fecha(5, 10, 2023), new Hora(12, 21, 34), "Lucas Ocampo", 1000.0);
		Venta v7 = new Venta(7, new Fecha(5, 10, 2023), new Hora(11, 22, 54), "Milagros Martinez", 670.0);

		ventas.add(v1);
		ventas.add(v2);
		ventas.add(v3);
		ventas.add(v4);
		ventas.add(v5);
		ventas.add(v6);
		ventas.add(v7);

		System.out.println("INGRESE EL NRO DE VENTA QUE DESEA VER: ");
		int numeroVenta = consola.nextInt();

		boolean ventaEncontrada = false;

		for (Venta venta : ventas) {
			if (venta.getNro_venta() == numeroVenta) {
				System.out.println(venta.toString());

				ventaEncontrada = true;
				break;
			}
		}
		if (!ventaEncontrada) {
			System.out.println("Venta no encontrada.");
		}

		boolean fechaEncontrada = false;

		System.out.println("INGRESE LA FECHA DE LA CUAL DESEA VER LAS VENTAS:(dia,mes,anio)");
//		System.out.println("dia:");
//		int dia=consola.nextInt();
//		System.out.println("mes:");
//		int mes=consola.nextInt();
//		System.out.println("anio");
//		int anio=consola.nextInt();

//		Fecha fecha=new Fecha(dia,mes,anio);

		Fecha fecha = new Fecha(consola.nextInt(), consola.nextInt(), consola.nextInt());

		for (Venta venta : ventas) {
			if (venta.getFecha().equals(fecha)) {
				System.out.println(venta.toString());

				fechaEncontrada = true;

			}
		}
		if (!fechaEncontrada) {
			System.out.println("No hubo ventas ese dia");
		}

		consola.close();
	}

}
