package lista1condicionais;

import java.util.Scanner;

public class Exercicio3Condicionais {

	public static void main(String[] args) {
		/*
		Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
		 */
		
		Scanner tec = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a idade: ");
		idade = tec.nextInt();
		
		if (idade >= 10 && idade <=14) {
			System.out.print("Categoria: Infantil");
		}
		if (idade >= 15 && idade <=17) {
			System.out.print("Categoria: Juvenil");
		}
		if (idade >= 18 && idade <=25) {
			System.out.print("Categoria: Adulto");
		} else {
			System.out.print("Categoria não listada.");
		}
	}
}
