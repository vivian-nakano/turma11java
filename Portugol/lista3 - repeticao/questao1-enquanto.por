programa
{
	
	funcao inicio()
	{
		/*
		 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente 
		 no final o total do somatório, a média e o total de valores lidos. O programa deve fazer 
		 as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja,
		 o programa deve parar quando o usuário fornecer um valor negativo.
		 */

		//incluindo variáveis
		inteiro valor=0, contador=0 
		real media = 0, soma=0

		//executando laços de repetição e PROCESSAMENTO
		enquanto (valor >= 0){
			
			//input
			escreva("Insira um valor maior ou igual a zero: ")
			leia(valor)
			
			//condicional
			se (valor > 0){
				soma = soma+valor
				contador= contador+1
				media = soma/contador
			}
		}
		
		//saida de resultados
		escreva("\nTotal do somatório ", soma, 
		"\nA média é: ", media, 
		"\nTotal de valores lidos: ", contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 608; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */