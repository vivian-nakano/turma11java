package testeDesafio;

public class ContaEspecial extends ContaCorrente {

	private double limite;
	
	public ContaEspecial(int numero, double saldo, int talonario) {
		super(numero, saldo, talonario);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double calcularJuros() {
		return super.getSaldo()*1.4;
	}
	
}
