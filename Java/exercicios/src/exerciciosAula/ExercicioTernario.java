package exerciciosAula;
import java.util.Scanner;
public class ExercicioTernario {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor=0;
		
		System.out.print("Digite um número positivo maior que 0: ");
		valor = leia.nextInt();
		System.out.print((valor <=0 )?"Você digitou valor negativo ou 0.":((valor%2)==0)?"Valor "+valor+" é PAR.":"Valor "+valor+" é ÍMPAR.");
		
		leia.close();
	}
}