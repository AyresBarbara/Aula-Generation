programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real salario, somasal=0.0, mediasal, mediaNf=0.0, maiorsal=0.0, perc
		inteiro num_filhos, somaNf = 0, cont100=0, x

		
		para (x=1;x<=4;x++)
		{
			escreva("salario: ")
			leia(salario)
			escreva("filhos: ")
			leia(num_filhos)

			somasal = somasal + salario
			somaNf = somaNf + num_filhos

			se (maiorsal < salario)
			{
				maiorsal = salario
			}
			se (salario <= 100)
			{
				cont100++
			}
		}
		mediasal = somasal / 4
		mediaNf = somaNf / 4
		perc = (cont100 * 100) / 4


		escreva("\nA média salarial da população é de: ",mat.arredondar(mediasal, 2))
		escreva("\nA média de quantidade de filhos: ",mat.arredondar(mediaNf, 2))
		escreva("\nO maior salario: ",maiorsal)
		escreva("\nO percentual com menos de 100 rais: ",perc," %")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 820; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */