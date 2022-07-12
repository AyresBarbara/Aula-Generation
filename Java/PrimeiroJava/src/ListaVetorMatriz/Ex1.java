package ListaVetorMatriz;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int vetor[] = new int [5];
		int vetor1 [] = {1, 2, 3, 4, 5};
		int maiorNota=0, x;
		
		Scanner leia = new Scanner (System.in);
	
		for (x=0; x<5; x++) 
		{
			System.out.println("\nEntre com " +x+" uma numero: ");
			vetor1[x] = leia.nextInt();
			
			if (vetor1[x] > maiorNota) 
			{
				maiorNota= vetor1[x];
			}
	}
		for (x=0; x<5; x++) 
		{
		
			System.out.println ("\nValor da pontuação "+x+ ": "+vetor1[x]);
		}
		System.out.println ("\nA maior pontuação é: "+maiorNota);
}
}
