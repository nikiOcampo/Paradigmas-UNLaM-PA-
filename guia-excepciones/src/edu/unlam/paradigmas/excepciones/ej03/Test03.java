package edu.unlam.paradigmas.excepciones.ej03;

import org.junit.Assert;
import org.junit.Test;

/*Escribir un programa que calcule el cociente de dos números enteros, pero que lance una excepción propia de tiempo de ejecución si el segundo número es cero.
 *  Tip: Deberá extender de RuntimeException.

¿Necesita ser anunciada? (throws)
*/

public class Test03 {

	@Test(expected = RuntimeException.class)
	public void test() {
		
		class MiExcepcion extends RuntimeException {
			private static final long serialVersionUID = -6146170257956329871L;

			public MiExcepcion(String excepcion) {
				super(excepcion);
			}
		}
		
		
		int num1=10, num2=0;
		
		try {
			try {
				int division=num1/num2;
				System.out.println(division);
				Assert.fail("no tendria que llegar aca");
			}catch(MiExcepcion e){
				throw new MiExcepcion("no se puede dividir por cero");
			}
		}catch(MiExcepcion e) {
			e.printStackTrace();
		}
		
		
	}

}
