package lista4objetos;

public class Aviao {

	double tamanho;
	int qtdePoltronas;
	String material;

	Aviao() {
	}

	Aviao(double tamanho, int qtdePoltronas, String material) {
		
		this.tamanho = tamanho;
		this.qtdePoltronas = qtdePoltronas;
		this.material = material;
	}
	void qualTamanho() {
		System.out.println("O tamanho do avi�o � de "+tamanho+" metros.");
		
	}
	void qtdePoltronas() {
		System.out.println("A quantidade de poltronas �: "+qtdePoltronas+".");
	}
	void material () {
		System.out.println("O avi�o � feito de "+material+".");
	}
	
	public static void main (String args[]) {
		
		Aviao a1 = new Aviao (30, 10, "metal");
		Aviao a2 = new Aviao (0,0,"papel");

		a2.material();
		a2.qtdePoltronas();
		a2.qualTamanho();
	}
}