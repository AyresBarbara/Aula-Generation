package Turma55;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, media;
		int op;
		
		Scanner leia= new Scanner (System.in);
		System.out.println("\nEntre com a nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.println("\nMédia: "+media);
		
		if(media>=7 && media<=10)
		{
			System.out.println("\nAlun Aprovade!!!");
		}
		else if(media>=5 && media<7)
		{
			System.out.println("\nAlune de Exame!!!");
		}
		else
		{
			System.out.println("\nAlune Reprovade!!!");
		}
		
		System.out.println("\n\t\tMenu de Java");
		System.out.println("\n1-Seje menas");
		System.out.println("\n2-Çokoooorro, Deuz");
		System.out.println("\n3-Deixe de Pantinho");
		System.out.println("\n4-VocÊ vai me ajudar");
		System.out.println("\nDigite a sua opção:");
		
		op= leia.nextInt();
		switch(op)
		{
		case 1: 
			System.out.println("\nSeje menas");
		break;
		case 2:
			System.out.println("\n2-Çokoooorro, Deuz");
		break;
		case 3:
			System.out.println("\n3-Deixe de Pantinho");
		break;
		case 4: 
			System.out.println("\n4-VocÊ vai me ajudar");
		break;
		default:
			System.out.println("Opção inválida");		
		}
		n1 = Math.sqrt(n2);
		n2 = Math.pow(n1,3);
		
		
		

	}

}
