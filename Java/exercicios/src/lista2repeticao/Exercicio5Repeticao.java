package lista2repeticao;

import java.util.Scanner;

public class Exercicio5Repeticao {

	public static void main(String[] args) {
		
		// Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		// No final, mostre a soma dos números digitados.(DO...WHILE).
		
		Scanner tec = new Scanner(System.in);
		
		int numeros = 0, soma = 0, contagem = 0;
		
		
		do {
			System.out.print("Digite número do teclado: ");
			numeros = tec.nextInt();
			if (numeros%3 == 0 && numeros !=0) {
				soma += numeros;
				contagem++;
			}
		}
		while (numeros != 0); {
			soma = (soma/contagem);
			
			System.out.print("Fim do programa pois digitou 0.\n");
			
			System.out.printf("A média dos números é: "+soma);
		}
	
	}

}
