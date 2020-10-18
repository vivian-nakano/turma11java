package lista4objetos;

public class Patinete {
	
	String marca;
	int qtdeRodas;
	double preco;
	
	public Patinete() {
	}
	
	public Patinete(String marca, int qtdeRodas, double preco) {
		super();
		this.marca = marca;
		this.qtdeRodas = qtdeRodas;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static void main (String args[]) {
		
		Patinete pat1 = new Patinete ("Xiomi",3,500.00);
		Patinete pat2 = new Patinete ("Caloi", 2, 150.00);

		System.out.println(pat1.getMarca());
		System.out.println(pat1.getQtdeRodas());
		System.out.println(pat1.getPreco());
		
		System.out.println(pat2.getMarca());
		System.out.println(pat2.getQtdeRodas());
		System.out.println(pat2.getPreco());
	}
}
