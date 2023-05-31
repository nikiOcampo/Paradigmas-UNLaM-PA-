package edu.unlam.paradigmas.herencia.ej01;

public class Main {

	public static void main(String[] args) throws MiException {
		// TODO Auto-generated method stub
		
		System.out.println("----------parte 1 y parte 2 - encapsulamiento---------");
		
		Cuenta miCuenta = new Cuenta();
//		System.out.println(miCuenta.saldo); // 0
//		miCuenta.saldo += 1000;
//		System.out.println(miCuenta.saldo); // 1000
//		miCuenta.saldo -= 550;
//		System.out.println(miCuenta.saldo); // 450
		System.out.println(miCuenta);
		miCuenta.depositarSaldo(1000);
		System.out.println(miCuenta);
		miCuenta.retirarSaldo(550);
		System.out.println(miCuenta);
		
		System.out.println("----------parte 3- transferencias ---------");
		
		Cuenta cuentaOrigen= new Cuenta();
		cuentaOrigen.depositarSaldo(10000);
		System.out.println(cuentaOrigen.toString()); // 10000
		Cuenta cuentaDestino = new Cuenta();
		System.out.println(cuentaDestino.toString()); // 0
		cuentaOrigen.transferir(550, cuentaDestino);
		System.out.println(cuentaOrigen.toString()); // 9450
		System.out.println(cuentaDestino.toString()); // 550
		
		System.out.println("----------parte 3- herencia ---------");
		
		CuentaAhorro cuentaAhorro= new CuentaAhorro();
		cuentaAhorro.depositarSaldo(10000);
		System.out.println(cuentaAhorro.toString());//10000 y 0
		cuentaAhorro.reservarSaldo(3000);
		System.out.println(cuentaAhorro.toString());//7000 y 3000
		cuentaAhorro.reintegrarSaldo(1500);
		System.out.println(cuentaAhorro.toString());//8500 y 1500
		
		CuentaCorriente cuentaCorriente= new CuentaCorriente(500);
		cuentaCorriente.depositarSaldo(1000);
		System.out.println(cuentaCorriente.toString()); //1000 y 500
		cuentaCorriente.retirarSaldo(1450); 
		System.out.println(cuentaCorriente.toString());// -450 y 50
		
		
		
	}

}
