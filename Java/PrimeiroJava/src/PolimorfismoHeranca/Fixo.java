package PolimorfismoHeranca;
public class Fixo  extends Telefone{
	public Fixo() {
		super("Telefone Fixo");
	}
	@Override
	public void toca (int numToques) {
	for (int i=0; i<numToques; i++) {
		System.out.println("\nPlinPlin...PlinPlin");	
	}
	}
	public void disca (String numero) {
		System.out.println("\nDiscando: "+numero);
	}

}
