import lab17.TextIO;


public class ProsjekRedovaIKolona {

	private static double[][] unesiMatricu() {
		System.out.println("Unesi visinu matrice: ");
		double visina = TextIO.getDouble();
		System.out.println("Unesi širinu matrice: ");
		double sirina = TextIO.getDouble();
		double[][] matrica = new double[(int) visina][(int) sirina]; 
		for (int i=0; i<visina; i++)
		{
			for (int j=0; j<sirina; j++)
			{
				System.out.println("Unesi  [" + (i+1) + ", " + (j+1) + "] član matrice: ");
				matrica[i][j] = TextIO.getDouble();
			}
		}
		return matrica;
	}
	
	private static void ispisiMatricu(double[][] matrica) {
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				System.out.print(matrica[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	private static void nadjiProsjekRedova(double[][] matrica) {
		double[] niz = new double[matrica.length];
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				niz[i] = niz[i] + matrica[i][j];
			}
		}
		for (int i=0; i<niz.length; i++)
		{
			niz[i] = niz[i]/matrica.length;
			System.out.println("Prosjek " + (i+1) + ". reda je: " + niz[i]);
		}
	}
	
	private static void nadjiProsjekKolona(double[][] matrica) {
		double[] niz = new double[matrica[0].length];
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				niz[j] = niz[j] + matrica[i][j];
			}
		}
		for (int i=0; i<matrica[0].length; i++)
		{
			niz[i] = niz[i]/matrica[0].length;
			System.out.println("Prosjek " + (i+1) + ". kolone je: " + niz[i]);
		}
		
	}

	
	public static void main(String[] args) {
		double[][] matrica = unesiMatricu();
		System.out.println();
		ispisiMatricu(matrica);
		System.out.println();
		nadjiProsjekRedova(matrica);
		System.out.println();
		nadjiProsjekKolona(matrica);
	}


}
