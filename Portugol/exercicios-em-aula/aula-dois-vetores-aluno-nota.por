programa
{
	// criar vetor que tenha nome de 4 alunos 
	// vetor se chama alunos
	// criar vetor com notas de 4 alunos
	// deve pegar e imprimir a lista, não precisa ser em ordem
	// aluno que tiver nota mais alta, aparece com asterisco
	
	funcao inicio()
	{
		cadeia alunos[4]
		real notas[4]
		real alunoMaiorNota = 0

		para(inteiro i=0; i<4; i++){
			escreva("Qual é o ",i+1,"o aluno: ")
			leia(alunos[i])

			escreva("Qual é a nota do ",i+1, "o aluno: ")
			leia(notas[i])

			se (notas[i]>alunoMaiorNota){
				alunoMaiorNota = notas[i]
			}
		}
		// loop para imprimir
		para (inteiro i=0; i<4;i++) {
			se(notas[i]==alunoMaiorNota){
				escreva(alunos[i])
				escreva(notas[i],"*") //asterisco nas notas maiores
			} senao {
				escreva(alunos[i])
				escreva(notas[i])
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 791; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */