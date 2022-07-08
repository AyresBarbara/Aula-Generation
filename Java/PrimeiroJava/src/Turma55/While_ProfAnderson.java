import java.util.Scanner;

public class While_ProfAnderson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double n1, n2;
		
		System.out.println("\nDigite um numero: ");
		n1 = leia.nextDouble();
		System.out.println("\nDigite um numero: ");
		n2 = leia.nextDouble();
		while(n2!=0 || n1!=0)
		{
			System.out.println("\nA divisão é: "+n1/n2);
			System.out.println("\nDigite um numero: ");
			n1 = leia.nextDouble();
			System.out.println("\nDigite um numero: ");
			n2 = leia.nextDouble();
		}
		System.out.println("Erro!Não existe divisão por ZERO!!! \n FIM DO PROGRAMA");
	}

}
