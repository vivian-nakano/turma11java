package desafioPlantasMedicinais;

import java.util.List;

public class Camomila extends Plantas {
	
	private String indicacoes;
	
	public Camomila(String nomePopular, String indicacoes) {
		super(nomePopular);
		this.indicacoes = indicacoes;
	}

	public Camomila(String nomePopular, String nomeCientifico, double preco, String indicacoes) {
		super(nomePopular, nomeCientifico, preco);
		this.indicacoes = indicacoes;
	}

	public String getIndicacoes() {
		return indicacoes;
	}

	public void setIndicacoes(String indicacoes) {
		this.indicacoes = indicacoes;
	}
	
	public void mostrarCamomila (List<Camomila> listar) {
		for(Camomila herbario : listar) {
			System.out.println("Nome Popular: "+herbario.getNomePopular()+ "\n Nome Científico:"+herbario.getNomeCientifico()+"\nPreço aprox de 100g:"+herbario.getPreco()+"\nOutras plantas: "+herbario.getIndicacoes());
		}
		
	}
	
}
