package lista5encapherança;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome) {
		super(nome);
	}
	
	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome,telefone);
		this.valorCredito=valorCredito;
	}
	
	
}
