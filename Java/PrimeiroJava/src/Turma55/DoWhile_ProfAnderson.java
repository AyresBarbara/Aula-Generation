package Turma55;

import java.util.Scanner;

public class DoWhile_ProfAnderson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("\nDigite um numero: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite um numero: ");
		n2 = leia.nextInt();
		do
		{
			System.out.println("\nA divisão é: "+n1/n2);
			System.out.println("\nDigite um numero: ");
			n1 = leia.nextInt();
			System.out.println("\nDigite um numero: ");
			n2 = leia.nextInt();
		}while(n2!=0);
		System.out.println("Erro!Não existe divisão por ZERO!!! \n FIM DO PROGRAMA");
	}

}