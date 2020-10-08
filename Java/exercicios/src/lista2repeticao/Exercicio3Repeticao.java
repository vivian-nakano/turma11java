package lista2repeticao;

import java.util.Scanner;

public class Exercicio3Repeticao {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 		 */
		
		Scanner tec = new Scanner(System.in);
		
		int idade = 0, contagem21=0, contagem50=0; 
		
		System.out.print("Digite a idade: ");
		idade = tec.nextInt();
		
		while (idade != -99) {
			if (idade < 21) {
				contagem21++;
			} 
			if (idade > 50) {
				contagem50++;
			}
			System.out.print("\nEncerrar a contagem, digite -99. \nPara continuar, digite nova idade: ");
			idade = tec.nextInt();	
			}
		
		System.out.printf("\nO número total de pessoas menor de 21 anos é: "+contagem21++);
		System.out.printf("\nO número total de pessoas maior de 50 anos é: "+contagem50++);
		}
	}