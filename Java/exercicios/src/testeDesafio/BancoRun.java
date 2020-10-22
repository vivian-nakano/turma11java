package testeDesafio;

import java.util.Scanner;

import testeDesafio.ContaBancaria;
import testeDesafio.ContaPoupanca;
import testeDesafio.ContaCorrente;
import testeDesafio.ContaEspecial;
import testeDesafio.ContaEmpresarial;

public class BancoRun {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ContaPoupanca poupanca = new ContaPoupanca(0, 0, 0, 0, 0);
		ContaCorrente corrente = new ContaCorrente(0, 0, 0);
		ContaEmpresarial empresa = new ContaEmpresarial(0, 0, 0, 0);
		ContaEspecial especial = new ContaEspecial(0, 0, 0);
		ContaBancaria geral = new ContaBancaria(0, 0);

		/*
		 * double valorSaq = 0; valorSaq += poupanca.getSaldo(); double qtdeDeposito =
		 * 0; int mes = 0; double valorJuros; double valorCorrecao;
		 * 
		 */
		char tipoConta = ' ';
		int tipoServico = 0;
		int tamanho = 0;
		int linhas = 0;
		String nomeCliente;
		double saque = 0;
		saque += poupanca.getSaldo();

		/*
		 * //LINHA SUPERIOR System.out.print("╔"); //CANTO for (int x = 1; x<tamanho;
		 * x++) { System.out.print("═"); } System.out.println("╗"); //CANTO
		 * 
		 * //MEIO for (int d = 1 ; d < linhas; d++) { System.out.print("║"); //alt 186
		 * for (int x = 1; x<tamanho; x++) { System.out.print(" "); }
		 * System.out.println("║"); } //parte de baixo System.out.print("╚"); for (int x
		 * = 1; x<tamanho; x++) { System.out.print("═"); } System.out.println("╝"); }
		 */

		System.out.println("***======= BANCO DO BEM ========***");
		System.out.println("    Te desejamos boas vindas!");
		System.out.println(" ");

		System.out.println("Qual seu nome? ");
		nomeCliente = leia.next();
		System.out.println("Número conta do cliente: ");
		geral.setNumero(leia.nextInt());

		System.out.println("Digite o tipo de conta: \n[P] Poupança \n[C] Corrente \n[E] Empresarial");
		System.out.print(" =====>");
		tipoConta = leia.next().toUpperCase().charAt(0);

		// decidir laço de repetição

		if (tipoConta == 'P') {
			System.out.println("======= Conta Poupança =======");

			do {

				System.out.println("Digite o serviço desejado: ");
				System.out.println("\n[1] Saldo \n[2] Saque \n[3] Depósito \n[4] Extrato");
				System.out.print(" =====>");
				tipoServico = leia.nextInt();

				if (tipoServico == 1) {
					System.out.println("O saldo da sua conta é: R$" + poupanca.getSaldo());
				}
				else if (tipoServico == 2) {
			 System.out.println("Deseja sacar quanto? R$");
			 saque = leia.nextDouble();}
			 
			 /*if (saque<=poupanca.getSaldo()) {
				 poupanca.podeSacar(saque);
				 System.out.println("Saldo atualizado: R$"+poupanca.getSaldo());
				
			 } else  */
				 
			// leia.nextDouble(); }
			 
				} while (tipoConta != 1 && tipoConta != 2 && tipoConta != 3 && tipoConta != 4);

		} else if (tipoConta == 'C') {
			System.out.println("======= Conta Corrente =======");

			System.out.println("Digite o serviço desejado: ");
			System.out.println("\n[1] Saldo \n[2] Saque \n[3] Depósito \n[4] Extrato");
			System.out.print(" =====> ");
			tipoServico = leia.nextInt();

		} else if (tipoConta == 'E') {
			System.out.println("======= Conta Empresarial =======");

			System.out.println("Digite o serviço desejado: ");
			System.out.println("\n[1] Saldo \n[2] Saque \n[3] Depósito \n[4] Extrato");
			System.out.print(" =====> ");
			tipoServico = leia.nextInt();
		}

		// System.out.println("\n [1] Talionario \n [2] Juros")

		// colocar serviço desejado


}
}
