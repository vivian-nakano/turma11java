package ExerciciosListas;

import java.util.Scanner;

public class Exercicio1Lacos {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */
		
		Scanner tec = new Scanner(System.in);
		
		int x, y, z, maior;
		
		System.out.print("Digite n�mero 1: ");
		x = tec.nextInt();
		System.out.print("Digite n�mero 2: ");
		y = tec.nextInt();
		System.out.print("Digite n�mero 3: ");
		z = tec.nextInt();
		
		if (x>y && x>z) {
			maior = x;
		} else if (y>x && y>z) {
			maior = y;
		} else {
			maior = z;
		}
		
		System.out.print("O maior n�mero �: "+maior);
		x = tec.nextInt();
		
		tec.close();

	}

}
