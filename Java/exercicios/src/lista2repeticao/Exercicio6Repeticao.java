package lista2repeticao;

import java.util.Scanner;

public class Exercicio6Repeticao {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */

		int numero, soma = 0, contagem = 0;
		double media = 0;
		
		Scanner tec = new Scanner(System.in);

		System.out.print("Digite n�mero inteiro: ");
		numero = tec.nextInt();
		
		do {
			if (numero % 3 == 0)
			{
				soma = soma + numero;
				contagem++;
			}
		} while (numero < 0);
		
		
		System.out.printf("Quantidade de n�meros m�ltiplos de 3 �: ", contagem++);
		
		}
		
	}	
	