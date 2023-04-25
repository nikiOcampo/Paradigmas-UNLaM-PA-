package unlam.paradigmas.diagnostico;

public class Ejercicio05 {

	public static int[][] resolver(int[][] m) {
		int[][] resul = new int[2 * m.length - 1][];
		for (int i = m.length; i > 0; i--) {
			for (int j = m[i].length; j > 0; j++) {
				if (i == j) {
					resul[m.length - 1][j] = m[i][j];
				}
				// terminar
			}
		}
		return null;
	}
}
