package lista5heranca_encap;

public class TesteFornecedor {

	public static void main(String[] args) {
		// Teste das classes Programa e Pessoa
		
		Pessoa pessoa1 = new Pessoa ("Vivian");
		Fornecedor forn1 = new Fornecedor ("Magazine Luiza", "Rua Central","23456789");
		
		forn1.setValorCredito(1000);
		forn1.setValorDebito(550);
		
		System.out.println("Saldo da "+forn1.getNome()+" "+forn1.obterSaldo());
		System.out.println("A "+pessoa1.getNome()+" tem saldo de "+forn1.obterSaldo()+" na "+forn1.getNome());
	}
}
