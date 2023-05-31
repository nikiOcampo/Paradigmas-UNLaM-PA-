package edu.unlam.paradigmas.excepciones.ej05;


import org.junit.Assert;
import org.junit.Test;

public class Test05 {

	@Test(expected = excepcionCuentaBancaria.class)
	public void retiroMasDelSaldo() throws Exception {
		try {
			CuentaBancaria c1= new CuentaBancaria(12000, "Nicole", 01);
			c1.retiro(13000);
			Assert.fail("No debería llegar a este punto");
		} catch (ArithmeticException excepcion) {
			excepcion.printStackTrace();
		}
	}
	
	
	@Test
	public void saldoNegativo() throws Exception {
		try {
			CuentaBancaria c1= new CuentaBancaria(-12000, "Nicole", 01);
			//Assert.fail("No debería llegar a este punto");
		} catch (ArithmeticException excepcion) {
			excepcion.printStackTrace();
		}
	}
	
	
	@Test//(expected = excepcionCuentaBancaria.class)
	public void depositoNegativo() throws Exception {
		try {
			CuentaBancaria c1= new CuentaBancaria(12000, "Nicole", 01);
			c1.deposito(-1200);
			//Assert.fail("No debería llegar a este punto");
		} catch (ArithmeticException excepcion) {
			excepcion.printStackTrace();
		}
	}
}


