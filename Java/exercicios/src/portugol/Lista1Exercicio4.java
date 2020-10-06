package portugol;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 
	Questao4 - Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
	
	funcao inicio()
	{
		inteiro a
		inteiro b
		inteiro c
		real r
		real d
		real s

		escreva("Digite valor a: ")
		leia(a)
		escreva("Digite valor b: ")
		leia(b)
		escreva("Digite valor c: ")
		leia(c)

		escreva("Fórmula D=R+S/2")
		escreva("\nFórmula R=(A+B)*(A+B) e S=(B+C)*(B+C)\n")

		r = (a+b)*(a+b)
		s = (b+c)*(b+c)
		d = (r+s) / 2
		
		escreva("D equivale a: ",d)
	}
}
		 */
		
		Scanner tec = new Scanner(System.in);
		
		int a, b, c ;
		double r, d, s;
		
		System.out.print("Digite o valor de A: ");
		a = tec.nextInt();
		System.out.print("Digite o valor de B: ");
		b = tec.nextInt();
		System.out.print("Digite o valor de C: ");
		c = tec.nextInt();
		
		r = (a+b)*(a+b) ;
		s = (b+c)*(b+c) ;
		d = (r+s) / 2 ;
		
		System.out.println("D equivale a: "+d);

	}

}
