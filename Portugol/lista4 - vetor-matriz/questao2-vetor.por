programa
{

	/**
	 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um 
	 * vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média 
	 * aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	 */

	inclua biblioteca Util
	
	funcao inicio()
	{

		inteiro maiorNumero = 0, soma = 0, media = 0, maiorPontuacao = 0

		const inteiro LIMITE = 10
		inteiro valorDado[10]

		para (inteiro x=0; x < LIMITE; x++)
		{
			valorDado[x] = Util.sorteia(1,6)

			se (valorDado[x] > maiorNumero)
			{
				maiorNumero = valorDado[x]
			}
			soma = soma + valorDado[x]
			escreva("O valor ",(x+1)," foi ",valorDado[x])
			pula()

		}

		para (inteiro x=0;x<LIMITE;x++)
		{
			se (valorDado[x] == maiorNumero)
			{
				maiorPontuacao ++
			}
		}

		//saidas

		escreva("A média aritmética dos valores lançados é ",(soma/10),".")
		escreva("\nO maior lançamento foi o número ",maiorNumero," e ocorreu ", maiorPontuacao," vezes.")
		
	}
		funcao pula(){
		escreva("\n")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 930; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */