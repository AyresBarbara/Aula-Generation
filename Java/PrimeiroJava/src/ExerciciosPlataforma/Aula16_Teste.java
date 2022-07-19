package ExerciciosPlataforma;

public class Aula16_Teste {

	public static void main(String[] args) {
		Aula16_Metodos meuCarro = new Aula16_Metodos();
		meuCarro.cor ="Vermelho";
		meuCarro.modelo= "Logan";
		meuCarro.velocidadeAtual=0;
		meuCarro.velocidadeMaxima=80;
		
		meuCarro.liga();
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		
	}

}
