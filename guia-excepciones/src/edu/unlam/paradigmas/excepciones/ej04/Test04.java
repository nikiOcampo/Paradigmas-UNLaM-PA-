package edu.unlam.paradigmas.excepciones.ej04;


import org.junit.Assert;
import org.junit.Test;

public class Test04 {

	@Test(expected = Exception.class)
	public void test() throws Exception {
		try {
			CuentaBancaria c1= new CuentaBancaria(12000, "Nicole", 01);
			c1.retiro(13000);
			Assert.fail("No debería llegar a este punto");
		} catch (ArithmeticException excepcion) {
			excepcion.printStackTrace();
		}
	}
}


