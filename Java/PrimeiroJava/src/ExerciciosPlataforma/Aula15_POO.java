package ExerciciosPlataforma;

public class Aula15_POO {//ATRIBUTOS
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//Construtor - Classe - Argumentos
	public Aula15_POO (String primeiro, String meio, String ultimo) {
	
		primeiroNome= primeiro;
		ultimoNome= ultimo;
		nomesDoMeio= meio;
	}
	//MÉTODO
	public String getNomeCompleto()
	{//VARIAVEL LOCAL
		String nomeCompleto= primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
}
