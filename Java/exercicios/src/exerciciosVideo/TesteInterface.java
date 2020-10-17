package exerciciosVideo;

public class TesteInterface {

	public static void main(String[] args) {
		ParticipanteForum participante = new ParticipanteForum();
		InterfaceLeitor leitor = participante;
		System.out.println("O participante está lendo: "+leitor.lendo());
		InterfaceProgramador programador = participante; 
		String java = "Java";
		programador.pensando(java.toCharArray());
		System.out.println(" E programando: "+programador.digitando());
	}
}
