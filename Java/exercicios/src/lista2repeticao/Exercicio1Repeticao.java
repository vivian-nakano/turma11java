package lista2repeticao;

import java.util.Scanner;

public class Exercicio1Repeticao {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		//1. Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		int numeros = 1000;
		
		for (numeros = 1000; numeros <=1999; numeros++) {
			
			if ((numeros%11 == 5)) {
				System.out.println("O número "+numeros+" dividido por 11 tem resto = 5.");
			}
		}
	}
}
