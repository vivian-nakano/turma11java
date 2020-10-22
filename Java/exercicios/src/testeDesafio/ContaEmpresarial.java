package testeDesafio;

public class ContaEmpresarial extends ContaBancaria {

	private double limiteEmpresa;
	private double limiteConsiderado;
	
	public ContaEmpresarial (int numero, double saldo, double limiteEmpresa, double limiteConsiderado) {
		super(numero, saldo);
		this.limiteEmpresa = limiteEmpresa;
		this.limiteConsiderado = limiteConsiderado;
	}

	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}

	public double getLimiteConsiderado() {
		return limiteConsiderado;
	}

	public void setLimiteConsiderado(double limiteConsiderado) {
		this.limiteConsiderado = limiteConsiderado;
	}
	
	public void emprestimoConsiderado() {
		this.limiteConsiderado = this.limiteEmpresa * 2;
	}
	
}
