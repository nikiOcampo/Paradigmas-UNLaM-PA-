package unlam.paradigmas.diagnostico;

import java.util.Arrays;

public class Ejercicio04 {

	public static int[] resolver(int[][] m) {
		int[] moda = new int[m.length];
	    for (int i = 0; i < m.length; i++) {
	        Arrays.sort(m[i]);
	        int maxFrecuencia = 1;
	        int modaFila = m[i][0];
	        int frecuencia = 1;
	        for (int j = 1; j < m[i].length; j++) {
	            if (m[i][j] == m[i][j - 1]) {
	                frecuencia++;
	            } else {
	                if (frecuencia > maxFrecuencia || (frecuencia == maxFrecuencia && m[i][j - 1] > modaFila)) {
	                    maxFrecuencia = frecuencia;
	                    modaFila = m[i][j - 1];
	                }
	                frecuencia = 1;
	            }
	        }
	        if (frecuencia > maxFrecuencia || (frecuencia == maxFrecuencia && m[i][m[i].length - 1] > modaFila)) {
	            modaFila = m[i][m[i].length - 1];
	        }
	        moda[i] = modaFila;
	    }
	    return moda;
		}

	

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3, 4 }, { 5, -6, -6, 20 }, { 1, 1, 10, 10 }};
		int[] resultado= resolver(m);
		System.out.println(Arrays.toString(resultado));
	
		
	}
}
