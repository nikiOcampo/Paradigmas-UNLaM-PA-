package unlam.paradigmas.diagnostico;

import org.junit.Assert;
import org.junit.Test;

public class Ejercicio01Test {

	@Test
	public void matrizTrue() {
		//Arrange
		boolean esperado= true;
		int[][] m = { { 1, 2, 3 }, { 4, 1, 6 }, { 7, 8, 2 } };
				
		//Act
		boolean obtenido = Ejercicio01.resolver(m);
				
		//Assert
		Assert.assertEquals(esperado, obtenido); 
	}
	
	@Test
	public void matrizFalse() {
		//Arrange
		boolean esperado= false;
		int[][] m = { { 1, 2, 3 }, { 4, 2, 6 }, { 7, 8, 2 } };
				
		//Act
		boolean obtenido = Ejercicio01.resolver(m);
				
		//Assert
		Assert.assertEquals(esperado, obtenido); 
	}
	
	@Test
	public void matrizVacia() {
		//Arrange
		boolean esperado= false;
		int[][] m = {};
		
		//Act
		boolean obtenido = Ejercicio02.resolver(m);
		
		//Assert
		Assert.assertEquals(esperado, obtenido); 
	
	}

}
