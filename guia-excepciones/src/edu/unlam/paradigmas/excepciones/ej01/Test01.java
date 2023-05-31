package edu.unlam.paradigmas.excepciones.ej01;

import org.junit.Assert;
import org.junit.Test;

public class Test01 {

	@Test
	public void test() {
		int num1=10, num2=0;
		try {
			int division=num1/num2;
			System.out.println(division);
			Assert.fail("no tendria que llegar aca");
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
	}

}
