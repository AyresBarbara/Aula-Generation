package Lista2;

import java.util.Scanner;

public class Ex2_For {

	public static void main(String[] args) {
//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		int x, n, nP=0, nI=0;
		
		Scanner leia = new Scanner (System.in);
		
		for (x=1; x<=10; x++)
		{
			System.out.println("Entre com um numero: ");
			n = leia.nextInt();
			
			if(n%2==0)
			{
				nP++;
			}
			else 
			{
				nI++;
			}
		} System.out.println("\n"+nP+" numeros pares e "+nI+" numeros impares");
	}

}
