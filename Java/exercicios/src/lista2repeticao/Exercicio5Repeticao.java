package lista2repeticao;

import java.util.Scanner;

public class Exercicio5Repeticao {

	public static void main(String[] args) {
		
		// Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		// No final, mostre a soma dos n�meros digitados.(DO...WHILE).
		
		Scanner tec = new Scanner(System.in);
		
		int numeros = 0, soma = 0, contagem = 0;
		
		
		do {
			System.out.print("Digite n�mero do teclado: ");
			numeros = tec.nextInt();
			if (numeros%3 == 0 && numeros !=0) {
				soma += numeros;
				contagem++;
			}
		}
		while (numeros != 0); {
			soma = (soma/contagem);
			
			System.out.print("Fim do programa pois digitou 0.\n");
			
			System.out.printf("A m�dia dos n�meros �: "+soma);
		}
	
	}

}
