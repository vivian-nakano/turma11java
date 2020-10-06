programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//Exercício 6:
		
		real p1x, p1y, p2x, p2y, distancia, radicando1, radicando2
		escreva("A coordenada X do Ponto 1: ")
		leia(p1x)
		escreva("A coordenada Y do Ponto 1: ")
		leia(p1y)
		escreva("A coordenada X do Ponto 2: ")
		leia(p2x)
		escreva("A coordenada Y do Ponto 2: ")
		leia(p2y)
		radicando1 = mat.potencia((p1x-p2x),2)
		radicando2 = mat.potencia((p1y-p2y),2)
		distancia = mat.potencia((radicando1 + radicando2), 0.5)
		escreva("A distância entre o ponto 1 e o ponto 2 é: ",distancia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */