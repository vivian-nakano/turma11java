package lista2repeticao;

import java.util.Scanner;

public class Exercicio6Repeticao {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */

		int numero, soma = 0, contagem = 0;
		double media = 0;
		
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite número inteiro: ");
		numero = tec.nextInt();
		
		do {
			if (numero % 3 == 0)
			{
				soma = soma + numero;
				contagem++;
			}
		} while (numero < 0);
		
		
		System.out.printf("Quantidade de números múltiplos de 3 é: ", contagem++);
		
		}
		
	}	
	