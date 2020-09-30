programa
{
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	//meses e dias e mostre-a expressa apenas em dias. 

	funcao inicio()
	{
		//variáveis
		
		inteiro totalAnos 
		inteiro totalMeses 
		inteiro totalDias 
		inteiro totalDiasFinal = 0

		totalDias = 0

		//comandos
		escreva("Digite total de anos: ")
		leia(totalAnos)
		escreva("Digite total de meses: ")
		leia(totalMeses)
		escreva("Digite total de dias : ")
		leia(totalDias)

		//resultado final
		totalDiasFinal = (totalDias +(totalAnos*365) + (totalMeses*30))

		escreva("Sua idade total em dias é: ",totalDiasFinal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 133; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */