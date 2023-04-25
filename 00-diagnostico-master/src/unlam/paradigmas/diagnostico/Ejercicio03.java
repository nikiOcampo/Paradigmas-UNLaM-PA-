package unlam.paradigmas.diagnostico;

public class Ejercicio03 {

	public static int[][] resolver(int[][] m) {
		int[][]resolucion=new int[3][4];
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				resolucion[i][j]+=m[i][j];
				if((j+1)<m[i].length)
					resolucion[i][j]+=+m[i][j+1];
				if((i+1)<m.length)
					resolucion[i][j]+=m[i+1][j];
				if(i>0)
					resolucion[i][j]+=m[i-1][j];
				if(j>0)
					resolucion[i][j]+=m[i][j-1];
			}
		}
		return resolucion;
	
	}

//	public static void main(String[] args) {
//		int[][] m = { { 8, 2, -3, 4 }, { 5, -6, -6, 20 }, { 21, 1, -5, 0 }};
//		int [][] resolucion=resolver(m);
//		for(int i=0;i<resolucion.length;i++)
//		{
//			for(int j=0; j<resolucion[i].length;j++)
//			{
//				System.out.print(resolucion[i][j]+"\t");
//			}
//			System.out.println("\n");
//		}
//
//		
//		
//	}
}
