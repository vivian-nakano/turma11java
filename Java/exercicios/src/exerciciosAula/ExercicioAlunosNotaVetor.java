package exerciciosAula;

import java.util.Scanner;

public class ExercicioAlunosNotaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		
		int notas [] = new int [38], contador = 0;
		String alunos [] = new String [38];
		char verificador = ' ';
		
		while (true) {
			System.out.println("Qual o primeiro aluno? ");
			
			System.out.println("Qual a nota do aluno? ");
			notas = tec.nextInt();
			
			System.out.println("Continua Sim (S) ou Não (N)");
			verificador = entrada.next().toUpperCase().charAt(0);
			
			if (verificador != 'S') {
				break 
			}
		}
	
		
		
	}

}

/*
 * Vector notas = new Vector(2);
		Vector<String> alunos = new Vector<>();
		int contador = 0;
		char verificador;
		
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Qual é o aluno?");
			alunos.add(entrada.next());
			
			System.out.println("Qual a nota do aluno?");
			notas.add(entrada.nextInt());
			
			System.out.println("Continua, Sim(S) ou Não(N)?");
			verificador = entrada.next().toUpperCase().charAt(0);
			
			if(verificador != 'S') {
				break;
			}
			
			contador++;
		}
		
		entrada.close();
		
		System.out.println(notas);
		System.out.println(alunos);
		
	}
}

*/

