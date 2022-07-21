package ExerciciosPlataforma;

public class Aula21_PessoaFisica extends Aula21_Polimorfismo{
	private long cpf;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getNome()
	{
		return "Pessoa Fisica: "+super.getNome()+" - cpf: "+this.getCpf();
		
	}
	
}
