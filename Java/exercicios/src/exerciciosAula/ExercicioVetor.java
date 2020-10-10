package exerciciosAula;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {

		char resultado, continua = 'S';
		int contador = 1;
		String[] times = new String[4];
		int[] pontos = new int[4];
		times[0] = "Corinthians";
		times[1] = "Palmeiras";
		times[2] = "São Paulo";
		times[3] = "Santos";

		Scanner entrada = new Scanner(System.in);

		while (continua == 'S') {

			System.out.printf("%dª rodada \n", contador);

			for (int clubes = 0; clubes < 4; clubes++) {
				System.out.print("\n" + times[clubes] + " ganhou(G), empatou(E) ou perdeu(P)?");
				resultado = entrada.next().toUpperCase().charAt(0);
				if (resultado == 'G') {
					pontos[clubes] += 3;
				} else if (resultado == 'E') {
					pontos[clubes] += 1;
				}
			}
			for (int indice = 0; indice < 4; indice++) {
				System.out.print("\n" + times[indice] + " tem " + pontos[indice] + " pontos.\n");
			}

			System.out.print("Continua? Sim(S) ou Não(N)");
			continua = entrada.next().toUpperCase().charAt(0);
			contador++;
		}
		entrada.close();
		System.out.println("Fim do Campeonato");
	}
}