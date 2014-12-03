package lab17;

public class MaloTeziZadatak {

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
	
	private static int[] index(int[][] matrica, int broj) {
		int[] niz = new int [2];
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j< matrica[i].length; j++)
			{
				if(matrica[i][j] == broj)
				{
					niz[0] = i;
					niz[1] = j;
					return niz;
				}
			}
		}
		niz[0] = -1;
		return niz;
	}
	
	public static void main(String[] args) {
		int[][] matrica = unesiMatricu();
		ispisiMatricu(matrica);
		System.out.println("Unesite broj: ");
		int broj = TextIO.getInt();
		int[] niz = index(matrica, broj);
		if(niz[0] == -1)
		{
			System.out.println("Broj nije član matrice.");
		}
		else
		{
			System.out.println("Index je: [" + (niz[0]+1) + ", " + (niz[1]+1) + "]");
		}
	}


}
