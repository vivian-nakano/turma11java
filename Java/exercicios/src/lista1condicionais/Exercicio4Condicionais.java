package lista1condicionais;

import java.util.Scanner;

public class Exercicio4Condicionais {

	public static void main(String[] args) {
		/*
		 *  Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		 *  Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */
		 
Scanner leia = new Scanner(System.in);
		
		int valor=0, imparElevado;
		
		System.out.print("Digite um número positivo maior que 0: ");
		valor = leia.nextInt();
		System.out.print((valor <=0 )?"Você digitou valor negativo ou 0.":((valor%2)==0)?"Valor "+valor+" é PAR.":"Valor "+valor+" é ÍMPAR.");
		
		leia.close();
		
		if ((valor%2)==0) {
			System.out.println(Math.sqrt(valor));
			System.out.print(valor);
		} else {
			imparElevado = (valor*valor);
			System.out.print(imparElevado);
		}
	}
}
