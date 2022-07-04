programa
{//Faça um programa que crie um vetor por leitura com
//5 valores de pontuação de uma atividade e o escreva
//em seguida. Encontre após a maior pontuação e a apresente.
	
	funcao inicio()
	{
	real vetor[5], maiorNota=0.0
	inteiro x=0

	para (x=0;x<5;x++)
	{
		escreva("\nEntre com ", x+1," nota: ")
		leia(vetor[x])
		
		se (vetor[x]> maiorNota)
		{
			maiorNota=vetor[x]
		}
	} 
	     para(x=0; x<5; x++)
	     {
		escreva("\nValor da pontuação ", x+1, "6: ", vetor[x])
	     }
	     escreva("\nA maior pontuação é: ", maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */