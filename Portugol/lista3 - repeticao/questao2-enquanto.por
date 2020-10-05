programa
{
	/* 
	 * Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
	 * (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
	 * deveremos observar na tela a seguinte sequência: 5 15 45 135.
	*/
	
	funcao inicio()
	{
		//incluindo variáveis 
		inteiro valor = 0, multiplica = 0

			escreva("Digite um valor maior que zero: ")
			leia(valor)
			escreva(valor + "\n")
			 
			enquanto (multiplica<100) {
			multiplica = valor * 3 
			valor = multiplica
			escreva(multiplica,"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 567; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */