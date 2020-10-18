package lista4objetos;

public class Funcionario {
	
	String nome;
	String area;
	int idade;
	
	Funcionario(){
	}
	
	public Funcionario(String nome, String area, int idade) {
		super();
		this.nome = nome;
		this.area = area;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public static void main (String[] args) {
	
	Funcionario func1 = new Funcionario("Julia","Tecnologia",30);

	System.out.println(func1.getNome());
	System.out.println(func1.getArea());
	System.out.println(func1.getIdade());
	
	}

}
