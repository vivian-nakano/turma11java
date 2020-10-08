package lista2repeticao;

import java.util.Scanner;

public class Exercicio2Repeticao {

	public static void main(String[] args) {
		//2. Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Scanner leia = new Scanner(System.in);
		
		int numeros=0, i, par = 0, impar = 0;
		
		for (i = 1; i <=10 ; i++) {
			
			System.out.print("Informe os números: ");
			numeros = leia.nextInt();
			
			if (numeros%2 == 0) {
				par = (par + 1);
			} 
			else {
				impar = impar + 1;	
			}
		}
		
		System.out.println("A quantidade de números pares é "+par);
		System.out.println("A quantidade de números ímpares é "+impar);
	
		leia.close();
	}	
}
