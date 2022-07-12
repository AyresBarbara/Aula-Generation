package Turma55;

import java.util.Scanner;

public class Vetor_ProfAnderson {

	public static void main(String[] args) {
		int vetor [] = new int [5];
		int vetor1 []= {1, 2, 3, 4, 5};
		
		Scanner ler = new Scanner(System.in);
		
		//System.out.println(vetor[0]);
		//System.out.println(vetor[4]);
		vetor1[0]=19;// dentro [] altera a posição do vetor
		
		for (int indice=0; indice<5; indice++)//for por questão de repetição
		{
			System.out.print(vetor1[indice]+"\t");
		}
		System.out.println();
		
		for (int indice=0; indice<5; indice++)//for por questão de repetição
		{
			System.out.print("\nDigite uma idade: ");
			vetor[indice]= ler.nextInt();
		}
		System.out.println("\nAs idades informada foram: ");
		
		for (int indice=0; indice <6; indice++) //o int foi aberto só na condicional
		{
			System.out.print(vetor1[indice]+"\t");
		}
	}

}
