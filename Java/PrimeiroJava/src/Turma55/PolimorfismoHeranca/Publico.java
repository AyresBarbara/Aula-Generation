
public class Publico extends Telefone{
	
	public Publico() {
		super ("Telefone Público");
	}
	@Override
	public void toca (int numToques) {
		for (int i=0; i<numToques; i++) {
			System.out.println("\nTriiimTriiimn");	
		}
		}
		public void disca (String numero) {
			if(numero.charAt(0)=='9'|| numero.charAt(0)=='8') {//charAt=posição do numero
			System.out.println("\nEsse tipo de telefone não liga para celular");
			}
			else {
				System.out.println("\nDiscando "+numero);
			}
		}
}
