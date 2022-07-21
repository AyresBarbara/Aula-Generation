package ExerciciosPlataforma;

public class Aula21_PessoaJuridica extends Aula21_Polimorfismo{
	private long cnpj;
	public Aula21_PessoaJuridica(){
		
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome()
	{
		return "Pessoa Juridica: "+super.getNome()+" - cnpj: "+this.getCnpj();
		
	}
	
}
