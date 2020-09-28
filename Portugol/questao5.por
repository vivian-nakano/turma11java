programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia as 3 notas de um aluno e calcule a média 
		//final deste aluno. Considerar que a média é ponderada e que 
		//o peso das notas é: 2,3 e 5, respectivamente. 

		escreva("Sistema de notas - média ponderada")

		inteiro nota1
		inteiro nota2
		inteiro nota3
		inteiro media = 0 

		escreva("\nDigita nota1: ")
		leia(nota1)
		escreva("Digita nota2: ")
		leia(nota2)
		escreva("Digita nota3: ")
		leia(nota3)

		media = ((2*nota1)+(3*nota2)+(5*nota3))/10

		escreva("A média ponderada deste (a) estudante é: ",media)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */