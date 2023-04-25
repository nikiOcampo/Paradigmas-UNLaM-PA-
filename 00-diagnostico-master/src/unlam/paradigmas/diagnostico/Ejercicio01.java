package unlam.paradigmas.diagnostico;

public class Ejercicio01 {

	public static boolean resolver(int[][] m) {
		// completar
		int suma=m[0][0],j=1;
		for(int i=1;i<m.length - 1;i++)
		{
			suma+=m[i][i];
			j++;
		}
		if(suma==m[j][j])
			return true;
		return false;
	}
}
