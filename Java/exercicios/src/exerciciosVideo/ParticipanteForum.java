package exerciciosVideo;

public class ParticipanteForum implements InterfaceLeitor,InterfaceProgramador {
	String pensamento;
	public String lendo()
	{
		return "Forum";
	}
	public void pensando (char[] ideias)
	{
		pensamento = new String (ideias);
	}
	public String digitando()
	{
		return pensamento;
	}
	private String aprendendo()
	{
		return "JAVA";
	}
}
