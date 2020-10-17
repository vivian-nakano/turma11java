package lista6interface_poli;

public class Cavalo extends Animal {

		private String correr;

		public String getCorrer() {
			return correr;
		}

		public void setCorrer(String correr) {
			this.correr = correr;
		}
		
		public String getNome() {
			return "O cavalo se chama "+super.getNome()+" e tem "+super.getIdade()+" anos de idade.";
		}
		
		public String getSom () {
			return "O som do cavalo é: "+super.getSom();
		}
	
}
