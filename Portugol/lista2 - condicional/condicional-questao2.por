programa
{

	//Elabore um sistema que leia as variáveis C e N, respectivamente código e número 
	//de horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	//Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o 
	//na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
	//No final do processamento imprimir o salário total e o salário excedente.
	
	funcao inicio()
	{
		//declaração de variáveis

		inteiro C = 0 // código do trabalhador(a)
		inteiro valorHora = 10 // Até 50 horas
		inteiro valorHoraExcesso = 20
		real pagamentoTotal = 0 //soma do salarioToTal e do salarioExcedente
		real salarioTotal = 0 // salario total até as 50 horas
		real E = 0 // valor recebido pelas horas extras
		real N = 0// número de horas trabalhadas

		//dados digitados
		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(N)
		escreva("Digite o número do código: ")
		leia(C)

		salarioTotal = 50 * valorHora
		
		
		se(N > 50) {
			E = (N -50)*valorHoraExcesso 
			}
		pagamentoTotal = salarioTotal + E
			
		escreva("O(A) funcionário(a) de código "+C+" trabalhou "+N+ " horas")
		escreva("\nSálario total regular é de: " + salarioTotal +" reais")
		escreva("\nPagamento do excesso de trabalho foi de: "+ E+" reais")
		escreva("\nPagamento final foi de: "+ pagamentoTotal+" reais")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */