package Lista1;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("Você é da categoria infantil!!");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("Você é da categoria juveniltil!!");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("Você é da categoria adulto!!");
		}
		else 
		{
			System.out.println("Não corresponde a faixa etária das categorias!!");
		}
		

	}

}
