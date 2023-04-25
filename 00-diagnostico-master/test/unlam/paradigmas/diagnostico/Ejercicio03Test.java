package unlam.paradigmas.diagnostico;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio03Test {

	@Test
	public void matrizEjemplo() {
		//Arrange
		int[][] esperado={ { 15, 1, -3, 21 }, { 28, -4, 0, 18 }, { 27, 11, -10, 15 }} ;
		int[][] m = { { 8, 2, -3, 4 }, { 5, -6, -6, 20 }, { 21, 1, -5, 0 }};
				
		//Act
		int[][] obtenido = Ejercicio03.resolver(m);
				
		//Assert
		Assert.assertArrayEquals(esperado, obtenido);
			
	}

}
