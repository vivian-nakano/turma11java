programa
{
	funcao inicio()
	{
		 real tempCelcius, tempFaren = 0
		 caracter opc = ' '
		 inteiro contador = 0
		 faca {
			 limpa()
			 escreva("Digite a temperatura em graus Celsius: ")
			 leia(tempCelcius)
			 tempFaren = (((9*tempCelcius)+160)/5)
			 escreva("A temperatura em graus Fahrenheit é: ", tempFaren,"F")
			 pula()
			 escreva("Continua S-sim ou N-não: ")
			 leia(opc) //variavel de escape - fuga
			 enquanto (opc != 'S' e opc != 's' e opc != 'n' e opc != 'N')
			 {
			 	escreva("Voce não digitou S ou N, tente de novo: ")
			 	leia(opc)	 
			 	//contador = contador + 1
			 	contador++
			 	se (contador >= 2){
			 		escreva("PELO AMOR DE DEUS, DIGITE S OU N!!!\n")
			 	}
			  }
			 
		 } enquanto ((opc == 'S') ou (opc =='s'))
		 
		 escreva("FIM DO PROGRAMA - TENHA UM BOM DIA")
	}
	funcao pula(){
		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */