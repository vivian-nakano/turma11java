package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		/* programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia as 3 notas de um aluno e calcule a média 
		//final deste aluno. Considerar que a média é ponderada e que 
		//o peso das notas é: 2,3 e 5, respectivamente. 

		escreva("Sistema de notas - média ponderada")

		inteiro nota1
		inteiro nota2
		inteiro nota3
		inteiro media = 0 

		escreva("\nDigita nota1: ")
		leia(nota1)
		escreva("Digita nota2: ")
		leia(nota2)
		escreva("Digita nota3: ")
		leia(nota3)

		media = ((2*nota1)+(3*nota2)+(5*nota3))/10

		escreva("A média ponderada deste (a) estudante é: ",media)
	}
}
		 */

		Scanner tec = new Scanner(System.in);
		
		int nota1, nota2, nota3, media = 0 ;
		
		System.out.print("Digite a pontuação da Nota 1: ");
		nota1 = tec.nextInt();
		System.out.print("Digite a pontuação da Nota 2: ");
		nota2 = tec.nextInt();
		System.out.print("Digite a pontuação da Nota 3: ");
		nota3 = tec.nextInt();
		
		media = ((2*nota1)+(3*nota2)+(5*nota3))/10;
		
		System.out.println("A média ponderada deste (a) estudante é: "+media);
	}
}
