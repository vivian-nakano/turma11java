package portugol;
import java.util.Scanner;
public class Lista1Exercicio2 {
	public static void main(String[] args) {
/*
 * programa
{
	//2. Fa�a um sistema que leia a idade de uma
	//pessoa expressa em dias e mostre-a expressa em anos, meses e
	//dias.
	
	funcao inicio()
	{
		//Vari�veis
		// a=anos, m=meses, d=dias
		inteiro a, m, d, dias
		dias=0
		a=0
		m=0
		d=0
		escreva("Digite quantos dias de idade vc tem?: ")
		leia(dias)
		a=(dias/365)
		m=(dias%365)/30
		d=(dias%365)%30)
		escreva("Voc� tem ",a, " ano(s) ",m, " m�s(s) ",d, " dia(s)! ")
	}
}
 */
	Scanner leia = new Scanner(System.in);
	int anos =0, meses=0, diasCalculo=0, dias=0;
	
	System.out.print("Digite quantos dias de idade voc� tem: ");
	dias = leia.nextInt();
	anos=(dias/365);
	meses=(dias%365)/30;
	diasCalculo=(dias%365)%30;
	System.out.printf("Voc� tem %s anos, %s meses, %s dias",anos,meses,diasCalculo);
	}
}
