package lista4objetos;

public class Cliente {
	
	String nomeCliente;
	String genero;
	int idade;
	
	Cliente () {
	}
	Cliente (String nomeCliente, String genero, int idade) {
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.genero = genero;
	}
	void qualNome() {
		System.out.println("Olá, meu nome é "+nomeCliente);
	}
	void qualGenero() {
		System.out.println("Me identifico como "+genero);
	}
	void qualIdade () {
		System.out.println("Tenho "+idade+" anos");
	}
	
	public static void main (String[]args) {
		
		Cliente cliente1 = new Cliente ("Lisbela","Feminino",26);
		Cliente cliente2 = new Cliente ("Suyá","Outros", 33);
		
		cliente1.qualNome();
		cliente1.qualGenero();
		cliente1.qualIdade();
		
		cliente2.qualNome();
		cliente2.qualGenero();
		cliente2.qualIdade();
	}
}