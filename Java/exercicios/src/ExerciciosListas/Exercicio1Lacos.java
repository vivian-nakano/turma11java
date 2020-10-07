package ExerciciosListas;

import java.util.Scanner;

public class Exercicio1Lacos {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba três inteiros e diga qual deles é o maior.
		 */
		
		Scanner tec = new Scanner(System.in);
		
		int x, y, z, maior;
		
		System.out.print("Digite número 1: ");
		x = tec.nextInt();
		System.out.print("Digite número 2: ");
		y = tec.nextInt();
		System.out.print("Digite número 3: ");
		z = tec.nextInt();
		
		if (x>y && x>z) {
			maior = x;
		} else if (y>x && y>z) {
			maior = y;
		} else {
			maior = z;
		}
		
		System.out.print("O maior número é: "+maior);
		x = tec.nextInt();
		
		tec.close();

	}

}
