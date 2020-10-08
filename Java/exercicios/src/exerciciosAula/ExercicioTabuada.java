package exerciciosAula;

import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {
		
		int a, b;
		
		for(a=1; a<=10;a++) {
			System.out.printf("\n----Tabuada do %d----\n", a);
			System.out.println("");
			for(b=1; b<=10; b++) {
				
				System.out.printf("%d x %d = %d",a,b,(a*b));
				System.out.println(" ");
			}
   
        }
	}
}