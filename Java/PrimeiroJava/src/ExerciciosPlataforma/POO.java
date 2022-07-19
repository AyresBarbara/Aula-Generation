package ExerciciosPlataforma;

public class POO {
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	public POO (String primeiro, String meio, String ultimo)//esse construtor é publico
	{
		primeiroNome= primeiro;
		ultimoNome= ultimo;
		nomesDoMeio= meio;
	}
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
}
