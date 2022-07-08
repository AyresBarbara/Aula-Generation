package Lista2;

import java.util.Scanner;

public class Ex3_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mv=0, mc=0, idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nEntre com sua idade: ");
		idade = leia.nextInt();
		while(idade!=-99)
		{
			if (idade<21)
				mv++;//Não se faz necessário abrir chave pq só tem 1 linha
			if (idade>50)
				mc++;
		System.out.print("\nEntre com sua idade: ");
			idade = leia.nextInt();
		} 
		System.out.print("\nO total de pessoas com menos de 21 é: "+mv);
		System.out.print("\nO total de pessoas com meais de 50 é: "+mc);
		
		

	}

}
