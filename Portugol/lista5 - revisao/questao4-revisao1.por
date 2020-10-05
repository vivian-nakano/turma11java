programa
{
	// Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
	
	funcao inicio()
	{
		inteiro soma = 0, dividendo=1 , divisor = 1

		faca{
			soma = (dividendo/divisor) + soma
			dividendo = dividendo + 2
			divisor = divisor + 1
			escreva("\n",dividendo,"\n")
			escreva("\n",divisor,"\n")
			
		}enquanto(dividendo <= 99 e divisor <=50)

		escreva("A soma dos números 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50 é : " , soma)
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