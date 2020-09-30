programa
{
	// Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
	
	funcao inicio()
	{
		//variáveis
		inteiro anos = 0 
		inteiro meses = 0
		inteiro dias = 0

		escreva("Digite quantidade de dias: ")
		leia(dias)

		//cálculos
		anos = (dias/365)
  		meses = ((dias%365)/30)
  		dias = ((dias%365)%30)

		//saídas
		escreva("\nA idade em anos é: ",anos)
		escreva("\nA idade em meses é: ",meses)
		escreva("\nA idade em dias é: ",dias)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */