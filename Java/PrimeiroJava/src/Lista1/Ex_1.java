package Lista1;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um número: ");
		a = leia.nextInt();
		System.out.println("\nEntre com um número: ");
		b = leia.nextInt();
		System.out.println("\nEntre com um número: ");
		c = leia.nextInt();
		
		if (a<b && b<c) 
		{
			System.out.println("\nO maior valor é " +c);
		}
		else if (a<c && c<b)
		{
			System.out.println("\nO maior valor é " +b);
		}
		else if (b<a && a<c)
		{
			System.out.println("\nO maior valor é " +c);
		}
		else if (b<c && c<a) 
		{
			System.out.println("\nO maior valor é " +a);
		}
		else if (c<a && a<b) 
		{
			System.out.println("\nO maior valor é " +b);
		}
		else if (c<b && b<a)
		{
			System.out.println("\nO maior valor é " +a);
		}
		}
	}

