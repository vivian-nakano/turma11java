programa
{	
	funcao inicio (){

		inteiro valor 
		escreva("Digite um valor inteiro positivo: ")
		leia(valor)
		parImpar(valor)
	}

		funcao parImpar(inteiro valor) 
		{
			se (((valor%2)>0) e (valor>0)) {
				escreva("Seu número é ímpar")
			}
			senao se (((valor%2)== 0) e (valor>0)){
				escreva("Seu número é par")
			}
			senao se (valor == 0){
				escreva("Você digitou zero")
			}
			senao {
				escreva ("Você digitou valor negativo.")
			}
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */