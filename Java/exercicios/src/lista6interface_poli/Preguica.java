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
		return "A pregui�a se chama "+super.getNome()+" e tem "+super.getIdade()+" anos de idade.";
	}
	
	public String getSom () {
		return "O som da pregui�a �: "+super.getSom();
	}
	
	public static void main (String[] args) {
		
	}

}