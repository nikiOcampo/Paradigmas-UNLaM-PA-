package edu.unlam.paradigmas.basicas.ej01;

import org.junit.Assert;

import org.junit.Test;

public class RangoTest {
	
	@Test
	public void limiteInferiorDentroDeCerrado() {
		// Arrange
		boolean esperado = true;
		Rango r1 = Rango.rangoCerrado(3.0, 5.0);

		// Act
		boolean obetenido = r1.estaDentroDe(3.0);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void limiteSuperiorDentroDeCerrado() {
		// Arrange
		boolean esperado = true;
		Rango r1 = Rango.rangoCerrado(3.0, 5.0);

		// Act
		boolean obetenido = r1.estaDentroDe(5.0);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void limiteInferiorDentroDeAbierto() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbierto(3.0, 5.0);

		// Act
		boolean obetenido = r1.estaDentroDe(3.0);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	
	@Test
	public void limiteSuperiorDentroDeAbierto() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbierto(3.0, 5.0);

		// Act
		boolean obetenido = r1.estaDentroDe(5.0);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void limiteInferiorDentroDeAbiertoAIzq() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbiertoIzq(3.0, 5.0);

		// Act
		boolean obetenido = r1.estaDentroDe(3.0);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void limiteSuperiorDentroDeAbiertoAIzq() {
		// Arrange
		boolean esperado = true;
		Rango r1 = Rango.rangoAbiertoIzq(3.0, 5.0);

		// Act
		boolean obetenido = r1.estaDentroDe(5.0);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	
	@Test
	public void limiteSuperiorDentroDeAbiertoADer() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbiertoDer(3.0, 5.0);

		// Act
		boolean obetenido = r1.estaDentroDe(5.0);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void rangoCerradoDentroDeAbierto() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoCerrado(1.0, 2.0);
		Rango r2= Rango.rangoAbierto(1.0, 2.0);

		// Act
		boolean obetenido = r1.rangoEstaDentroDe(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void rangoCerradoDentroDeAbiertoIzq() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoCerrado(1.0, 2.0);
		Rango r2= Rango.rangoAbiertoIzq(1.0, 2.0);

		// Act
		boolean obetenido = r1.rangoEstaDentroDe(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void rangoCerradoDentroDeAbiertoDer() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoCerrado(1.0, 2.0);
		Rango r2= Rango.rangoAbiertoDer(1.0, 2.0);

		// Act
		boolean obetenido = r1.rangoEstaDentroDe(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void rangoAbiertoIzqDentroDeAbierto() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbiertoIzq(1.0, 2.0);
		Rango r2= Rango.rangoAbierto(1.0, 2.0);

		// Act
		boolean obetenido = r1.rangoEstaDentroDe(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void rangoAbiertoDerDentroDeAbierto() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbiertoDer(1.0, 2.0);
		Rango r2= Rango.rangoAbierto(1.0, 2.0);

		// Act
		boolean obetenido = r1.rangoEstaDentroDe(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void rangoAbiertoDerDentroDeAbiertoIzq() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbiertoDer(1.0, 2.0);
		Rango r2= Rango.rangoAbiertoIzq(1.0, 2.0);

		// Act
		boolean obetenido = r1.rangoEstaDentroDe(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void rangoAbiertoIzqDentroDeAbiertoDer() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbiertoDer(1.0, 2.0);
		Rango r2= Rango.rangoAbiertoIzq(1.0, 2.0);

		// Act
		boolean obetenido = r2.rangoEstaDentroDe(r1);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void rangoDentroDeSiMismo() {
		// Arrange
		boolean esperado = true;
		Rango r1 = Rango.rangoCerrado(1.0, 2.0);

		// Act
		boolean obetenido = r1.rangoEstaDentroDe(r1);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void interseccionAbiertoDerConCerradoIzq() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbiertoDer(1.0, 2.0);
		Rango r2= Rango.rangoAbiertoDer(2.0, 3.0);

		// Act
		boolean obetenido = r1.hayInterseccion(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void interseccionAbiertoDerConAbierto() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoAbiertoDer(1.0, 2.0);
		Rango r2= Rango.rangoAbierto(2.0, 3.0);

		// Act
		boolean obetenido = r1.hayInterseccion(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void interseccionValida() {
		// Arrange
		boolean esperado = true;
		Rango r1 = Rango.rangoAbiertoIzq(3.0, 4.0);
		Rango r2= Rango.rangoAbiertoDer(4.0, 5.0);

		// Act
		boolean obetenido = r1.hayInterseccion(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void interseccionEntreUnoMismo() {
		// Arrange
		boolean esperado = true;
		Rango r1 = Rango.rangoAbiertoIzq(3.0, 4.0);

		// Act
		boolean obetenido = r1.hayInterseccion(r1);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void rangosIguales() {
		// Arrange
		boolean esperado = true;
		Rango r1 = Rango.rangoCerrado(1.0,2.0);
		Rango r2 = Rango.rangoCerrado(1.0,2.0);

		// Act
		boolean obetenido = r1.equals(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	
	@Test
	public void rangosIgualesSoloEnValores() {
		// Arrange
		boolean esperado = false;
		Rango r1 = Rango.rangoCerrado(1.0,2.0);
		Rango r2 = Rango.rangoAbierto(1.0,2.0);

		// Act
		boolean obetenido = r1.equals(r2);

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
//	
//	@Test
//	public void ordenCorrecto() {
//		// Arrange
//		Rango[] esperado = {};
//		Rango []r1 = {Rango.rangoAbiertoDer(1.0, 2.0) , Rango.rangoAbierto(2.0, 3.0) , Rango.rangoAbiertoIzq(6.0, 7.0) , Rango.rangoCerrado(2.0, 3.0)
//				, Rango.rangoAbierto(3.0, 4.0), Rango.rangoAbiertoDer(3.0, 4.0), Rango.rangoAbiertoIzq(6.0, 8.0)};
//
//
//		// Act
//		Rango[] obetenido = r1;
//
//		// Assert
//		Assert.assertEquals(esperado, obetenido);
//	}
	
	//FALTA PROBAR LO DE ORDENAR
	
	@Test
	public void imprimirCerrado() {
		// Arrange
		String esperado = "Rango [1.0 , 2.0]";
		Rango r1 = Rango.rangoCerrado(1.0,2.0);

		// Act
		String obetenido = r1.toString();

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void imprimirAbiertoDer() {
		// Arrange
		String esperado = "Rango [1.0 , 2.0)";
		Rango r1 = Rango.rangoAbiertoDer(1.0,2.0);

		// Act
		String obetenido = r1.toString();

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	
	@Test
	public void imprimirAbiertoIzq() {
		// Arrange
		String esperado = "Rango (1.0 , 2.0]";
		Rango r1 = Rango.rangoAbiertoIzq(1.0,2.0);

		// Act
		String obetenido = r1.toString();

		// Assert
		Assert.assertEquals(esperado, obetenido);
	}
	

}
