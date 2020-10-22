package desafioPlantasMedicinais;

public class EspinheiraSanta extends Plantas {
	
	private String curiosidades;


	public EspinheiraSanta(String nomePopular, String curiosidades) {
		super(nomePopular);
		this.curiosidades = curiosidades;
	}

	public EspinheiraSanta(String nomePopular, String nomeCientifico, double preco, String curiosidades) {
		super(nomePopular, nomeCientifico, preco);
		this.curiosidades = curiosidades;
	}
		
	String getCuriosidades() {
		return curiosidades;
	}

	public void setCuriosidades(String curiosidades) {
		this.curiosidades = curiosidades;
	}
	
	

}
