package PolimorfismoHeranca;
public class Celular extends Telefone{//telefone é a superclasse
	
	public Celular() {
		super("Telefone celular");//(String)
	}
	@Override //Polimorfismo
	public void toca (int numToques) {//numToques pode ser o nome que eu quiser
		switch (numToques) {
		case 1:
			System.out.println("\nHello Motor....");
			break;
		case 2:
			System.out.println("\nTanana....Tananan");
			break;
			default:
				System.out.println("\nPararara...Pararra");
		}
	}
	public void disca (String numero) {
		System.out.println("\nO numero "+numero+" é um celular");
	}
	
}
