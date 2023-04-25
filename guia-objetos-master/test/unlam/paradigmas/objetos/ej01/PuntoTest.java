package unlam.paradigmas.objetos.ej01;

import org.junit.jupiter.api.Test;

import org.junit.Assert;
import unlam.paradigmas.objetos.ej02.Punto;

class PuntoTest {

	@Test
	void siEstaSobreEjeX() {
		//Arrange
		boolean esperado= true;
		Punto punto1= new Punto(3,0);
		
		//Act
		boolean obtenido= punto1.estaSobreEjeX();
		
		//Assert
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	void siEstaSobreEjeY() {
		//Arrange
		boolean esperado= true;
		Punto punto1= new Punto(0,1);
		
		//Act
		boolean obtenido= punto1.estaSobreEjeY();
		
		//Assert
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	void noEstaSobreEjeY() {
		//Arrange
		boolean esperado= false;
		Punto punto1= new Punto(5,1);
		
		//Act
		boolean obtenido= punto1.estaSobreEjeY();
		
		//Assert
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	void siEsElOrigen() {
		//Arrange
		boolean esperado= true;
		Punto punto1= new Punto(0,0);
		
		//Act
		boolean obtenido= punto1.esElOrigen();
		
		//Assert
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	void noEsElOrigen() {
		//Arrange
		boolean esperado= false;
		Punto punto1= new Punto(2,9);
		
		//Act
		boolean obtenido= punto1.esElOrigen();
		
		//Assert
		Assert.assertEquals(esperado, obtenido);
	}
	
	@Test
	void distancia() {
		//Arrange
		double esperado= 5;
		Punto punto1= new Punto(3,4);
		
		//Act
		double obtenido= punto1.distanciaAlOrigen();
		
		//Assert
		Assert.assertEquals(obtenido, esperado, obtenido);
	}
	
	@Test
	void distanciaEntreDosPuntos() {
		//Arrange
		double esperado= 5;
		Punto punto1= new Punto(2,4);
		Punto punto2= new Punto(5,8);
		
		//Act
		double obtenido= punto1.distanciaAOtroPunto(punto2);
		
		//Assert
		Assert.assertEquals(obtenido, esperado, obtenido);
	}

}
