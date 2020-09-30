programa
{
//Desenvolva um sistema em que:
//-Leia 4 (quatro) números;
//-Calcule o quadrado de cada um;
//-Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//-Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	funcao inicio()
	{
	//Declaração de variáveis
	inteiro num1, num2, num3, num4
	inteiro quadrado1,quadrado2,quadrado3,quadrado4
	

	//Entrada de dados
	escreva("Digite o primeiro numero: ")
	leia(num1)
	escreva("Digite o segundo numero: ")
	leia(num2)
	escreva("Digite o terceiro numero: ")
	leia(num3)
	escreva("Digite o quarto numero: ")
	leia(num4)

	//Processamento e Saida
	quadrado1 = num1*num1
	quadrado2 = num2*num2
	quadrado3 = num3*num3
	quadrado4 = num4*num4

	se(quadrado3 >= 1000)
	{
		escreva("O terceiro número é: " + num3 + "\nO quadrado do terceiro número é: " + quadrado3)
	} 
	senao
	{
		escreva("O primeiro número é: " + num1+ ". Seu quadrado é: " + quadrado1)
		escreva("\nO segundo número é: " + num2+ ". Seu quadrado é: " + quadrado2) 
		escreva("\nO terceiro número é: " + num3+ ". Seu quadrado é: " + quadrado3)
		escreva("\nO quarto número é: " + num4+ ". Seu quadrado é: " + quadrado4)
	}

	}

}

	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */