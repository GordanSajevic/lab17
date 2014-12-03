package lab17;

public class PravoLaganZadatak {

	private static int[] unosNiza(int broj) {
		int[] niz = new int [broj];
		for (int i=0; i<broj; i++)
		{
			System.out.println("Unesite " + (i+1) + ". član niza: ");
			niz[i] = TextIO.getInt();
		}
		return niz;
		
	}

	private static void ispisNiza(int[] niz) {
		for (int i=0; i<niz.length-1; i++)
		{
			System.out.print(niz[i] + ", ");
		}
		System.out.print(niz[niz.length-1] + "\n");
		
	}
	
	private static int trazi(int[] niz, int broj) {
		int i=0;
		for (i=0; i<niz.length; i++)
		{
			if (niz[i] == broj)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite dužinu niza: ");
		int broj = TextIO.getInt();
		int[] niz = unosNiza(broj);
		ispisNiza(niz);
		System.out.println("Unesite neki broj: ");
		int nekiBroj = TextIO.getInt();
		int index = trazi(niz, nekiBroj);
		if (index == -1)
		{
			System.out.println("Broj nije u nizu.");
		}
		else
		{
			System.out.println("Index unešenog broja je: " + index);
	
		}
	}

}
