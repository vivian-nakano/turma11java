package desafioPlantasMedicinais;

import java.util.List;

public class Hibisco extends Plantas {
	
	private String caracteristicas;

	public Hibisco(String nomePopular, String caracteristicas) {
		super(nomePopular);
		this.caracteristicas = caracteristicas;
	}
	
	public Hibisco(String nomePopular, String nomeCientifico, double preco, String caracteristicas) {
		super(nomePopular, nomeCientifico, preco);
		this.caracteristicas = caracteristicas;
}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}	
	
	public void mostrarHisbisco (List<Hibisco> listar) {
		for(Hibisco herbario : listar) {
			System.out.println("Nome Popular: "+herbario.getNomePopular()+ "\n Nome Científico:"+herbario.getNomeCientifico()+"\nPreço aprox de 100g:"+herbario.getPreco());
		}
	
}
	
}
