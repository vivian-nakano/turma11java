package portugol;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 8: O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e 
		 * dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
	
		real custoFabrica, custoDistribuidor, custoConsumidor
		escreva("Insira o custo de f�brica: ")
		leia(custoFabrica)
		
		custoDistribuidor = custoFabrica*0.28
		custoConsumidor = custoFabrica*1.45 + custoDistribuidor
		escreva("O custo do consumidor �: ", custoConsumidor)
		 
		 */
		Scanner tec = new Scanner(System.in);
		
		double custoFabrica = 0, custoDistribuidor = 0, custoConsumidor = 0;
		
		System.out.print("Custo de f�brica: R$");
		custoFabrica = tec.nextDouble();
		
		custoDistribuidor = custoFabrica * 0.25;
		custoConsumidor = custoFabrica * 1.45 + custoDistribuidor;
		
		System.out.println("O custo do consumidor �: R$"+custoConsumidor);
	}

}
