package ExerciciosPlataforma;

import java.util.*;
public class Aula7_LacoCondicional {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		System.out.printf("Entre com seu nome: ");
		nome = leia.nextLine();
		System.out.printf("\nSeu nome: %s", nome);
		System.out.printf("\nSeu idade: %d", idade);
		
		if (idade>=18)
		{
			System.out.printf("\nVocê é maior de idade...");
		}
		else if (idade>=1 && idade<18)
		{
			System.out.printf("\nVocê é menor de idade...");
		}
		else
		{
			System.out.printf("Você entrou com uma idade inválida");
		}
	}

}
