package ExerciciosPlataforma;

public class Aula20_Participante implements Aula20_Interface, Aula20_Programador{
	String pensamento;
	
	public String lendo() 
	{
		return "Forum";
	}
	public void pensando (char[] ideias) 
	{
		pensamento = new String(ideias);
	}
	public String digitando ()
	{
		return pensamento;
	}
	private String aprendendo()
	{
		return "JAVA";
	}
}