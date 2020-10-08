package exerciciosAula;

import java.util.Scanner;

public class ExercicioLacoRepeticao1 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int contador = 1;
		char opc = ' ';
						
		do {
			System.out.println(contador++);
			System.out.print("Continua S - sim ou N - não: ");
			opc = tec.next().toUpperCase().charAt(0);

		} while (opc == 'S'); {
			if(opc != 'S') {
				System.out.println("\n");
				System.out.println("Contagem parou pois você digitou opção diferente de S.");
			}
		}
		
	}
}
