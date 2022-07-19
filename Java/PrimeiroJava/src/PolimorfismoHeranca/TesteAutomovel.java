package PolimorfismoHeranca;
public class TesteAutomovel {

	public static void main(String[] args) {
		//instanciar um objeto da classe Automovel
		Automovel auto = new Automovel ("Bárbara Ayres","Logan","KQF9563",2011);
		auto.imprimirInfo();
		
		System.out.println("\n******Transferência de proprietária******");
		auto.setNomeProprietario("Luana Nascimento");
		auto.imprimirInfo();
		auto.setPlaca("POO2022");
		auto.imprimirInfo();
	}

}
