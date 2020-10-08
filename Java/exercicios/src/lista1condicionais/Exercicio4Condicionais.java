package lista1condicionais;

import java.util.Scanner;

public class Exercicio4Condicionais {

	public static void main(String[] args) {
		/*
		 *  Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		 *  Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		 
Scanner leia = new Scanner(System.in);
		
		int valor=0, imparElevado;
		
		System.out.print("Digite um n�mero positivo maior que 0: ");
		valor = leia.nextInt();
		System.out.print((valor <=0 )?"Voc� digitou valor negativo ou 0.":((valor%2)==0)?"Valor "+valor+" � PAR.":"Valor "+valor+" � �MPAR.");
		
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
