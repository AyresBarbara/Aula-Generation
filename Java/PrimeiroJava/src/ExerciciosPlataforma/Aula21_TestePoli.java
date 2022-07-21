package ExerciciosPlataforma;

public class Aula21_TestePoli {

	public static void main(String[] args) {
		Aula21_PessoaFisica fisica = new Aula21_PessoaFisica();
		fisica.setNome("Bárbara");
		fisica.setCpf(12345678L);
		
		Aula21_PessoaJuridica juridica =  new Aula21_PessoaJuridica();
		juridica.setNome("Julio");
		juridica.setCnpj(12345678L);
		
		Aula21_Polimorfismo[] pessoas = new Aula21_Polimorfismo[2];
		pessoas [0] = fisica;
		pessoas[1]= juridica;
		
		for(Aula21_Polimorfismo pessoa:pessoas) {
			System.out.println(pessoa.getNome());
		}
	}

}
