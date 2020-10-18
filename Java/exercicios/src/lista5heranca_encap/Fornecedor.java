package lista5heranca_encap;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDebito;
	
	//construtores		
			
	public Fornecedor(String nome) {
		super(nome);
	}
	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	public double obterSaldo() {
		return valorCredito - valorDebito;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDebito() {
		return valorDebito;
	}
	public void setValorDebito(double valorDebito) {
		this.valorDebito = valorDebito;
	}

}
