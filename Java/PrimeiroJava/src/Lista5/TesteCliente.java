package Lista5;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente ("Bárbara", 985005650, false);
		
	System.out.println(cliente.imprimirInfo());
	cliente.pagar();
	}

}
