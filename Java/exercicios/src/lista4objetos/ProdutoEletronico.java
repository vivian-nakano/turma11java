package lista4objetos;

public class ProdutoEletronico {
	
	String tipo;
	String marca;
	int voltagem;
	double preco;
	
	ProdutoEletronico(){
	}

	public ProdutoEletronico(String tipo, String marca, int voltagem, double preco) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.voltagem = voltagem;
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static void main (String[] args) {
		
		ProdutoEletronico geladeira = new ProdutoEletronico("Geladeira","Brastemp",220,1200.00);
		
		System.out.println(geladeira.getTipo());
		System.out.println(geladeira.getMarca());
		System.out.println(geladeira.getPreco());
		System.out.println(geladeira.getVoltagem());
	
	}
	
}
