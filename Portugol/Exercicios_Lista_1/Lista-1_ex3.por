programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, totalseg

		escreva ("\nQuantas horas foram: ")
		leia(horas)
		escreva ("\nQuantos minutos foram: ")
		leia (minutos)
		escreva ("\n Quantos segundos foram: ")
		leia(segundos)

		totalseg= horas*60*60 + minutos*60 + segundos

		escreva ("\nOtempo de duração do evento foi ", totalseg, "segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */