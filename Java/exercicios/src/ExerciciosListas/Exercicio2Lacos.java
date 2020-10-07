package ExerciciosListas;

import java.util.Scanner;

public class Exercicio2Lacos {

	public static void main(String[] args) {
		
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner tec = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite número 1: ");
		num1 = tec.nextInt();
		System.out.print("Digite número 2: ");
		num2 = tec.nextInt();
		System.out.print("Digite número 3: ");
		num3 = tec.nextInt();
		
		if ((num1 <= num2) && (num2 <= num3))
		  {
			System.out.printf("%d %d %d\n", num1, num2, num3);
		  }
		  if ((num2 <= num1) && (num1 <= num3))
		  {
			  System.out.printf("%d %d %d\n", num2, num1, num3);
		  }
		  if ((num3 <= num2) && (num2 <= num1))
		  {
			  System.out.printf("%d %d %d\n", num3, num2, num1);
		  }
		  if ((num1 <= num3) && (num3 <= num2))
		  {
			  System.out.printf("%d %d %d\n", num1, num3, num2);
		  }
		  if ((num2 <= num3) && (num3 <= num1))
		  {
			  System.out.printf("%d %d %d\n", num1, num3, num2);
		  }
		  if ((num3 <= num1) && (num1 <= num2))
		  {
			  System.out.printf("%d %d %d\n", num2, num1, num3);
		  }
	}

}
