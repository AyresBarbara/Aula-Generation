programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		cadeia nome = "Bárbara Ayres", endereco = "rua terra, 25"
		inteiro idade = 26,op
		real altura = 1.57, n1,n2,n3,media

		escreva ("\nNome: ",nome,"e o seu endereço é ",endereco)
		escreva ("\nIdade: ",idade,"ano(s)")
		escreva ("\nAltura: ",altura,"metro(s)")
		escreva("\nEntre com a primeira nota: ")// o meu usuario vai digitar
		leia(n1)// a minha variavel n1=5
		escreva("\nEntre com a segunda nota: ")
		leia(n2)
		escreva("\nEntre com a terceita nota: ")
		leia(n3)
		media= (n1+n2+n3)/ 3
		escreva("\nMedia da aluna ", nome,"foi de: ",mat.arredondar(media,2))
		se(media>=7.0 e media<=10.0)
		{
			escreva("\nAluna Aprovada!!!")
		}
		senao se(media>=5.0 e media<7.0)
		{
		escreva("\nAluna de Exame!!")
		}
		senao
		{
			escreva("\nAluna Reprovada")
		}
		escreva("\n\t\tEscolha um elogio...")
		escreva("\n1- Mulheres maravilhosas")
		escreva("\n2- Turma focada")
		escreva("\n3- Mulheres muito inteligentes")
		escreva("\n4- Determinadas")
		escreva("\nDigite sua opção: ")
		leia(op)
		escolha(op)
		{
			caso 1:
			escreva("\nMulheres Maravilhosas")
			pare
			caso 2:
			escreva("\n2- Turma focada")
			pare
			caso 3:
			escreva("\n3- Mulheres muito inteligentes")
			pare
			caso 4:
			escreva("\n4- Determinadas")
			pare
			caso contrario:
			escreva("\nOpção inválida")
			
		}
		n1= mat.raiz(n2, 2.0)
		n2= mat.potencia(n3, 3.0)
		idade= op % idade
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */