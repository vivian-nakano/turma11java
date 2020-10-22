package testeDesafio;

public class ContaCorrente extends ContaBancaria {
	
	private int talonario;
	
	public ContaCorrente(int numero, double saldo, int talonario) {
		super(numero, saldo);
		this.talonario = talonario;
	}

	public int emitirTalao () {
		talonario = talonario ++ ;
		return talonario;
	}
}
