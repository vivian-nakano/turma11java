package lista2repeticao;

import java.util.Scanner;

public class Exercicio2Repeticao {

	public static void main(String[] args) {
		//2. Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner leia = new Scanner(System.in);
		
		int numeros=0, i, par = 0, impar = 0;
		
		for (i = 1; i <=10 ; i++) {
			
			System.out.print("Informe os n�meros: ");
			numeros = leia.nextInt();
			
			if (numeros%2 == 0) {
				par = (par + 1);
			} 
			else {
				impar = impar + 1;	
			}
		}
		
		System.out.println("A quantidade de n�meros pares � "+par);
		System.out.println("A quantidade de n�meros �mpares � "+impar);
	
		leia.close();
	}	
}
