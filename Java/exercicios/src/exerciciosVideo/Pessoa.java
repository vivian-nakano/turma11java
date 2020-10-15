package exerciciosVideo;

public class Pessoa { //private: s� a classe pessoa consegue acess�-los/manipul�-los.
	private String primeiroNome; //atributos
	private String ultimoNome;
	private String nomesDoMeio;
	
	public Pessoa (String primeiro, String meio, String ultimo) 
	{
		//consultores: mesmo nome da classe (Pessoa) seguido pela lista de par�metro (primeiro, meio, ultimo)
		//neste caso � publico, pode ser invocado por qlqr classe. n�o criam nem retornam objetos (new retorna).
		//o consultor apenas executa o procedimento.
		
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	// metodo para juntar os nomes
	
	public String getNomeCompleto ()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
		
		
	}
	
	
	
	
}
