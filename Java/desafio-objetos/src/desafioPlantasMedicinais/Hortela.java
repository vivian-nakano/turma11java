package desafioPlantasMedicinais;

import java.util.List;

public class Hortela extends Plantas{
	
	private String outras;

	public Hortela(String nomePopular, String outras) {
		super(nomePopular);
		this.outras = outras;
	}

	public Hortela(String nomePopular, String nomeCientifico, double preco, String outras) {
		super(nomePopular, nomeCientifico, preco);
		this.outras = outras;
	}

	public String getOutras() {
		return outras;
	}

	public void setOutras(String outras) {
		this.outras = outras;
	}	
	
	public void mostrarHortela (List<Hortela> listar) {
		for(Hortela herbario : listar) {
			System.out.println("Nome Popular: "+herbario.getNomePopular()+ "\n Nome Científico:"+herbario.getNomeCientifico()+"\nPreço aprox de 100g:"+herbario.getPreco());
		}
}
}
	
