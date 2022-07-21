package ExerciciosPlataforma;

public class Aula19_TestePessoa {

	public static void main(String[] args) {
		Aula19_Herança barbara = new Aula19_Herança("bÁRBARA", 555);
		Aula19_funcionario julio = new Aula19_funcionario ("Julio", 222, "TI");
		Aula19_Herança maria = new Aula19_funcionario ("Maria", 232, "matematica");
		Aula19_Herança jose = new Aula19_coordenador("José", 444,"CC");
		
		System.out.println(barbara.getMatricula());
		System.out.println(julio.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());

	}

}
