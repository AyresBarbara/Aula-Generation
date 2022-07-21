package ExerciciosPlataforma;

public class Aula20_TesteInter {

	public static void main(String[] args) {
		
		Aula20_Participante participante = new Aula20_Participante ();
		Aula20_Interface leitor = participante;
		System.out.println("O participante está lendo: "+leitor.lendo());
		
		Aula20_Programador programador = participante;
		String java = "JAVA";
		programador .pensando(java.toCharArray());
		System.out.println("E programando:"+ programador.digitando());
		

	}

}
