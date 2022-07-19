package ListaVetorMatriz;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		int x, mediaVetor=0, somaVetor=0, maiorVetor=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0; x<10; x++) 
		{
			System.out.println("\nJogue o dado: ");
			vetor[x] = leia.nextInt();
			
			somaVetor+= vetor[x];
		}
		if(vetor[x]==6) 
		{
			maiorVetor++;
		}
	}

}
