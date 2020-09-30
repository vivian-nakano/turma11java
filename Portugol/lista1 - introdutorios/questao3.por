programa
{
	//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	
	funcao inicio()
	{

		/*
		 * 1 seg = 1 seg
		 * 1 min = 60 seg
		 * 1 hr = 3600 seg
		 */
		inteiro tempoDuracao = 0
		inteiro tempoSegundos = 0
		inteiro tempoMinutos = 0 
		inteiro tempoHoras = 0
		

		escreva("Digite tempo de duração em segundos: ")
		leia(tempoDuracao)

		tempoHoras = tempoDuracao/3600
		tempoMinutos = (tempoDuracao%3600)/60
		tempoSegundos = (tempoDuracao%3600)%60
	
		escreva("Tempo de duração: ",tempoHoras," horas, ",tempoMinutos," minutos, ",tempoSegundos," segundos.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */