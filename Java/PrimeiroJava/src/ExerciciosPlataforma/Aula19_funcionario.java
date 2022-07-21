package ExerciciosPlataforma;

public class Aula19_funcionario extends Aula19_Herança{
	private String departamento;
	
	public Aula19_funcionario(String nome, int matricula, String departamento) {
		super(nome, matricula);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	

	
	

}
