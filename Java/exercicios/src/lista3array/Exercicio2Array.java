package lista3array;

import java.util.Scanner;

public class Exercicio2Array {

	public static void main(String[] args) {
		
		/*
		Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.
		 */
		 
		int B[] = new int[6];
		int somaPar=0;
		int somaImpar = 0;
		int numero =0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 0 ; x< B.length; x++) 
		{
			System.out.print("Digite um n�mero para inserir no vetor: ");
			 numero = leia.nextInt();
			 B[x]=numero;
			if(numero%2 ==0) 
			{
				System.out.printf("O n�mero %d digitado � par!\n", numero);
				somaPar += numero;
			}else 
			{
				System.out.printf("O n�mero %d digitado � �mpar!\n", numero);
				somaImpar++;

			}
		}
		
		System.out.println("A soma de n�meros pares digitados foi de: "+ somaPar);
		System.out.println("A quantidade de n�meros �mpares digitados foi de: "+ somaImpar);
	}

}