package ExerciciosPlataforma;

import java.util.Scanner;

public class Aula5_EntradaSaida {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int a, b, soma;
		System.out.println("\nEntre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o valor de B: ");
		b = leia.nextInt();
		soma = a+b;
		System.out.print(soma);
	}

}
