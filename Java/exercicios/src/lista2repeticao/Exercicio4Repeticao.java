package lista2repeticao;

import java.util.Scanner;

public class Exercicio4Repeticao {

	public static void main(String[] args) {
		
		/* A cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
			o número de pessoas calmas; 
			o número de mulheres nervosas; 
			o número de homens agressivos; 
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos; 
			o número de pessoas calmas com menos de 18 anos.
		 */
		
		Scanner tec = new Scanner(System.in);
		
		int idade = 0, contador = 1, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos =0, pessoasNervosas40 = 0, pessoasCalmas18 = 0;
		byte sexo;
		byte tipoHumor; 
		
		while (contador <= 150) {
			
			System.out.print("Digite sua idade: ");
			idade = tec.nextInt();
			System.out.print("Digite seu gênero. 1 - feminino / 2 - masculino / 3 - outros: ");
			sexo = tec.nextByte();
			System.out.print("Digite seu tipo de humor. 1 - calma / 2 - nervosa / 3 - agressiva: ");
			tipoHumor = tec.nextByte();
			tec.nextLine(); 
			
			if (tipoHumor == 1) {
				pessoasCalmas = pessoasCalmas + 1;
			}
			if (tipoHumor == 2 && sexo == 1) {
				mulheresNervosas = mulheresNervosas + 1;
			}
			if (tipoHumor == 3 && sexo == 2) {
				homensAgressivos = homensAgressivos + 1;
			}
			if (tipoHumor == 1 && sexo == 3) {
				outrosCalmos = outrosCalmos + 1;
			}
			if (tipoHumor == 2 && idade > 40) {
				pessoasNervosas40 = pessoasNervosas40 + 1;
			}
			if (tipoHumor == 1 && idade < 18) {
				pessoasCalmas18 = pessoasCalmas18 + 1;
			}
			
			
			contador++;
			
			
		}
		
		System.out.printf("Total de pessoas calmas: %d",pessoasCalmas);
		System.out.printf("\nTotal de mulheres nervosas: %d",mulheresNervosas);
		System.out.printf("\nTotal de homens agressivos: %d",homensAgressivos);
		System.out.printf("\nTotal de outras pessoas calmas: %d",outrosCalmos);
		System.out.printf("\nTotal de pessoas nervosas com mais de 40 anos: %d",pessoasNervosas40);
		System.out.printf("\nTotal de pessoas calmas com menos de 18 anos: %d",pessoasCalmas18);
		
	}

}
