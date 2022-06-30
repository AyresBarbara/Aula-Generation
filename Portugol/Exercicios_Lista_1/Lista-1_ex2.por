programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dia, totaldias
		escreva ("\nQuantos anos você tem?")
		leia(ano)
		escreva ("\nQuanto meses você tem?")
		leia(mes)
		escreva ("\nQuantos dias você tem?")
		leia(dia)

		totaldias = ano*365 + mes*30 + dia

		escreva ("\nEu vivi:", totaldias, " dias de vida")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */