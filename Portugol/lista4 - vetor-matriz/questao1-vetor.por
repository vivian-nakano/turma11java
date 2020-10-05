programa
{
 /*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente.
 */
	inclua biblioteca Util
	
	funcao inicio()
	{

		const inteiro LIMITE = 5
		inteiro valor [5]
		inteiro maiorNumero = 0

		escreva("\nEscolhendo valores!")
		
		para(inteiro x = 0; x < LIMITE ;x++)
		{
			valor[x]=Util.sorteia(1,10)
			
			se(valor[x] > maiorNumero)
			{
				maiorNumero = valor[x]
			}
			escreva("\nA pontuação ",x+1," foi ",valor[x]) 
		}
		escreva("\nA maior pontuação foi ",maiorNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */