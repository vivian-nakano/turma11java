programa
{
	// Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
	
	funcao inicio()
	{
		inteiro dividendo = -1, divisor = 1, resposta = 0

		para(divisor = 1; divisor <=50; divisor++) {
			dividendo = dividendo + 2;
			resposta = resposta + (dividendo/divisor) 
		}
		escreva("A soma dos números 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50 é ",resposta)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */