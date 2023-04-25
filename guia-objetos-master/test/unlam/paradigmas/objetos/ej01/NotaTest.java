package unlam.paradigmas.objetos.ej01;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class NotaTest {

	@Test
	public void estaAprobado() {
		// Arrange
		boolean esperado = true;
		Nota nota1 = new Nota(7);

		// Act
		boolean obetenido = nota1.aprobado();

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}

	@Test
	public void estaDesaprobado() {
		// Arrange
		boolean esperado = true;
		Nota nota1 = new Nota(3);

		// Act
		boolean obetenido = nota1.desaprobado();

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void estaFueraDeRango() {
		// Arrange
		int esperado = 0;
		Nota nota1 = new Nota(15);

		// Act
		int obetenido = nota1.obtenerValor();

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}

}
