package exerciciosAula;

import java.util.Scanner;

public class ExercicioInversao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int x=0,y=0;
		
		System.out.println("LEIA A:");
		x = leia.nextInt();
		System.out.println("LEIA B:");
		y = leia.nextInt();
		System.out.printf("VALORES ANTES DA INVERSÃO A: %d B: %d",x,y);
	
		x=x+y;
		y=x-y;
		x=x-y;	
		
		System.out.println();
		System.out.printf("VALORES APÓS A INVERSÃO A: %d B: %d",x,y);
		leia.close();
	}
}