package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		/* programa
{
	
	funcao inicio()
	{
		//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia 
		//final deste aluno. Considerar que a m�dia � ponderada e que 
		//o peso das notas �: 2,3 e 5, respectivamente. 

		escreva("Sistema de notas - m�dia ponderada")

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

		escreva("A m�dia ponderada deste (a) estudante �: ",media)
	}
}
		 */

		Scanner tec = new Scanner(System.in);
		
		int nota1, nota2, nota3, media = 0 ;
		
		System.out.print("Digite a pontua��o da Nota 1: ");
		nota1 = tec.nextInt();
		System.out.print("Digite a pontua��o da Nota 2: ");
		nota2 = tec.nextInt();
		System.out.print("Digite a pontua��o da Nota 3: ");
		nota3 = tec.nextInt();
		
		media = ((2*nota1)+(3*nota2)+(5*nota3))/10;
		
		System.out.println("A m�dia ponderada deste (a) estudante �: "+media);
	}
}
