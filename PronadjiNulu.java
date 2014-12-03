import lab17.TextIO;


public class PronadjiNulu {

	private static int[][] unesiMatricu() {
		System.out.println("Unesi visinu matrice: ");
		int visina = TextIO.getInt();
		System.out.println("Unesi širinu matrice: ");
		int sirina = TextIO.getInt();
		int[][] matrica = new int[visina][sirina]; 
		for (int i=0; i<visina; i++)
		{
			for (int j=0; j<sirina; j++)
			{
				System.out.println("Unesi  [" + (i+1) + ", " + (j+1) + "] član matrice: ");
				matrica[i][j] = TextIO.getInt();
			}
		}
		return matrica;
	}

	private static int[][] nadjiNulu(int[][] matrica) {
		int nula1 = -1;
		int nula2 = -1;
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				if (matrica[i][j] == 0)
				{
					nula1 = i;
					nula2 = j;
				}
			}
		}
		if (nula1 != -1)
			
		{
			for (int i=0; i<matrica.length; i++)	
			{
				matrica[nula1][i] = 0;
			}
			for (int j=0; j<matrica[0].length; j++)
			{
				matrica[j][nula2] = 0;
			}
		}
		return matrica;
	}
	
	private static void ispisiMatricu(int[][] matrica) {
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int[][] matrica = unesiMatricu();
		ispisiMatricu(matrica);
		nadjiNulu(matrica);
		System.out.println();
		ispisiMatricu(matrica);

	}

}
