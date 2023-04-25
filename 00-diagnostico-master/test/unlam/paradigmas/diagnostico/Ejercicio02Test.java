package unlam.paradigmas.diagnostico;

import org.junit.Test;

import org.junit.Assert;

public class Ejercicio02Test {


	@Test
	public void matrizSinCeros() {
		//Arrange
		boolean esperado= false;
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 } };
		
		//Act
		boolean obtenido = Ejercicio02.resolver(m);
		
		//Assert
		Assert.assertEquals(esperado, obtenido); 
	
	}
	

	@Test
	public void matrizConUnCero() {
		//Arrange
		boolean esperado= true;
		int[][] m = { { 1, 0, 3 }, { 4, 5, 6 } };
		
		//Act
		boolean obtenido = Ejercicio02.resolver(m);
		
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
