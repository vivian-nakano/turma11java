package listaPortugol;

import java.util.Scanner;

public class Lista1Exercicio6 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		double p1x, p1y, p2x, p2y, distancia, radicando1, radicando2;
		
		System.out.println("A coordenada X do Ponto 1: ");
		p1x = tec.nextDouble();
		System.out.println("A coordenada Y do Ponto 1: ");
		p1y = tec.nextDouble();
		System.out.println("A coordenada X do Ponto 2: ");
		p2x = tec.nextDouble();
		System.out.println("A coordenada Y do Ponto 2: ");
		p2y = tec.nextDouble();
		
		distancia = Math.pow(Math.pow((p2x-p1x),2 ) + Math.pow(p1y-p2y, 2), 0.5); //(0,0) ; (3,4) => 5
		
		System.out.printf("Distância entre Ponto 1 e o Ponto 2 é: %.3f", distancia);

	}

}
