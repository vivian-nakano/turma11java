package exerciciosAula;
import java.util.Scanner;
public class ExercicioTernario {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor=0;
		
		System.out.print("Digite um n�mero positivo maior que 0: ");
		valor = leia.nextInt();
		System.out.print((valor <=0 )?"Voc� digitou valor negativo ou 0.":((valor%2)==0)?"Valor "+valor+" � PAR.":"Valor "+valor+" � �MPAR.");
		
		leia.close();
	}
}