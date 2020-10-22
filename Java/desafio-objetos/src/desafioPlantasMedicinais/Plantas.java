package desafioPlantasMedicinais;

public class Plantas {
	
	private String nomePopular, nomeCientifico;
	private double preco;

	
	public Plantas (String nomePopular) {
		super();
	}
	
	public Plantas(String nomePopular, String nomeCientifico, double preco) {
		super();
		this.nomePopular = nomePopular;
		this.nomeCientifico = nomeCientifico;
		this.preco = preco;
		

	}

	public String getNomePopular() {
		return nomePopular;
	}

	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}



}
