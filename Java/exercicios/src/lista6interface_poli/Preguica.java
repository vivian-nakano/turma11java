package lista6interface_poli;

public class Preguica extends Animal {
	
	private String subirArvore;
	
	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}

	public String getNome() {
		return "A preguiça se chama "+super.getNome()+" e tem "+super.getIdade()+" anos de idade.";
	}
	
	public String getSom () {
		return "O som da preguiça é: "+super.getSom();
	}
	
	public static void main (String[] args) {
		
	}

}