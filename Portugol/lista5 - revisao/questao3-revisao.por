programa
{
	 /*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes 
	 *intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.
	 */

	funcao inicio()
	{

		inteiro valor = 0, cont1=0, cont2 = 0, cont3 = 0, cont4 = 0
		//cont1 primeiro intervalo e assim por diante...

		enquanto(valor>=0) {
		escreva("Digite valores de 0 a 100: ")
		leia(valor)   

		    	  se(valor>=0 e valor<=25) {
				cont1++
			} senao se(valor>=26 e valor<=50){
				cont2++
			} senao se(valor>=51 e valor<=75){
				cont3++
			} senao se(valor>=76 e valor<=100){
				cont4++
			} senao {
				escreva("Número negativos finalizam a leitura dos dados.")
			}
			limpa()

		}

		//impressao das contagens
		escreva("O intervalo de [0,25] possui ",cont1," números.\n")
		escreva("O intervalo de [26,50] possui ",cont2," números.\n")
		escreva("O intervalo de [51,75] possui ",cont3," números.\n")
		escreva("O intervalo de [76,100] possui ",cont4," números.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1049; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */