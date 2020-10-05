programa
{
inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * 1-	Elabore um programa que calcule o que deve ser pago por um produto,
		 * considerando o preço normal de etiqueta e a escolha da condição de pagamento
		 * .Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
		 * escolhida e efetuar o cálculo adequado.
			Código Condição de pagamento
			1 À vista em dinheiro ou cheque, recebe 20% de desconto
			2 À vista no cartão de crédito, recebe 15% de desconto
			3 Em duas vezes, preço normal de etiqueta sem juros
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 *
		 */
		 
		 const inteiro LIMITE=4
		cadeia produtos[] = {"Camisa","Calça","Camiseta","Vestido"}
		real precos[] = {80.00,100.00 , 40.00, 80.00}
		inteiro x = 0
		inteiro codigo
		inteiro pgto = 0
		real precoFinal = 0
		real parcela
		real juros4 = 1.1
		
		para (x = 0; x<LIMITE;x++)
		{
			escreva("Codigo produto ",x+1," ",produtos[x],"  R$ ",precos[x])
			pulalinha()
		}
		escreva("O que deseja comprar? Digite o código do produto: ")
		leia(codigo)
		codigo= codigo-1
		pulalinha()
		escreva("Você escolheu ",produtos[codigo]," no valor de ", precos[codigo])
		pulalinha()


		escreva("Qual forma de pagamento?\n")
		escreva("1 À vista em dinheiro ou cheque, recebe 20% de desconto! \n")
		escreva("2 À vista no cartão de crédito, recebe 15% de desconto! \n")
		escreva("3 Em duas vezes, preço normal de etiqueta sem juros. \n")
		escreva("4 Em três vezes, preço normal de etiqueta mais juros de 10%.\n")
		escreva("Digite o numero da opção: ")
		leia(pgto)

		se (pgto == 1){
			precoFinal = (precos[codigo] * 0.8)
			escreva("O valor era de ",precos[codigo],". Com esta forma de pagamento passa a ser: ",precoFinal)
		}
		senao se (pgto == 2) {
			precoFinal = (precos[codigo] * 0.85)
			escreva("O valor era de ",precos[codigo],". Com esta forma de pagamento passa a ser: ",precoFinal)
		} 
		senao se (pgto == 3) {
			precos[codigo] = (precos[codigo]/2)
			escreva("O valor permanece o mesmo e será pago em duas parcelas de ",precos[codigo])
		}
		senao {
			parcela = precos[codigo]/3

			para (inteiro i = 1; i<=3; i++){
				precoFinal += parcela*(mat.potencia(juros4, i)) //biblioteca matematica

				escreva("Com esta forma de pagamento passa a ter juros de 10% com preço final de ", precoFinal)
			}
		}
	}
	funcao pulalinha()
	{
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 829; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */