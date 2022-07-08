package Turma55;

import java.util.Scanner;

public class Repeticao_ProfAnderson {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("EScolha qual é a tabuada de inicio: ");
		n1=leia.nextInt();
		System.out.println("EScolha qual é a tabuada de fim: ");
		n2=leia.nextInt();
		
		for(int y=n1; y<=n2; y++)
		{
			System.out.println("\nTabuada do"+y+"\n");
		
			for(int x=1; x<=10; x++) 
			{
				System.out.println(y+" X "+x+ " = "+y*x);
			
			}
		}
	}

}
