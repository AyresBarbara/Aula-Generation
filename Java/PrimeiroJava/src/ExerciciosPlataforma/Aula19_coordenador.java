package ExerciciosPlataforma;

public class Aula19_coordenador extends Aula19_Herança{
	private String cursoCoordenado;
	
	public Aula19_coordenador(String nome, int matricula, String cursoCoordenado) {
		super(nome, matricula);
		this.cursoCoordenado= cursoCoordenado;
	}

	public String getCursoCoordenado() {
		return cursoCoordenado;
	}

	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}
	
	


}
