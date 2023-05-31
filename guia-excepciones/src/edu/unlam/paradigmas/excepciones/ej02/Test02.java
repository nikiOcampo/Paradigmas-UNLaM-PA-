package edu.unlam.paradigmas.excepciones.ej02;


import org.junit.Assert;
import org.junit.Test;


public class Test02 {

	@Test(expected = Exception.class)
	public void test() throws Exception {
		class MiExcepcion extends Exception {
			private static final long serialVersionUID = -6146170257956329871L;

			public MiExcepcion(Exception excepcion) {
				super(excepcion);
			}
		}
		
		try {
			try {
				double raiz =calcularRaizCuadrada(-4);
				System.out.println(raiz);
				Assert.fail("No debería llegar a este punto");
			} catch (ArithmeticException excepcion) {
				throw new MiExcepcion(excepcion);
			}
		} catch (MiExcepcion excepcion) {
			excepcion.printStackTrace();
		}

		
	}

	private double calcularRaizCuadrada(int num) throws Exception {
		if (num < 0) {
            throw new Exception("No se puede calcular la raíz cuadrada de un número negativo");
        } else {
            return Math.sqrt(num);
        }
	}
	
}

