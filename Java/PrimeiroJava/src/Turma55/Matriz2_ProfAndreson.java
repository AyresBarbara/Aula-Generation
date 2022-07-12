package Turma55;

import java.util.Scanner;

public class Matriz2_ProfAndreson {
	public static void main(String[] args) {
	int matriz [][]= new int [3][4];
	int matriz1[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	
	Scanner leia = new Scanner(System.in);


for (int linha=0; linha<3;linha++) 
{
	for (int coluna=0; coluna<4; coluna++) 
	{
		System.out.print("\nDigite um valor");//para ficar em colunas, tira o ln
		matriz[linha][coluna]= leia.nextInt();
	}
}
for (int linha=0; linha<3;linha++)
{
	for (int coluna=0; coluna<4; coluna++) 
	{
		System.out.print(matriz[linha][coluna]+"\t");
	}
	System.out.println();
}

}

}
