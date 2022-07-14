package Lista5;

//Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.
public class Cliente {
	// nome, telefone, pago.
	private String nome;
	private double telefone;
	private boolean pago;

	public Cliente(String nome, double telefone, boolean pago) {
		this.nome = nome;
		this.telefone = telefone;
		this.pago = pago;
	}
	
	public String imprimirInfo() {
		return "Cliente nome=" + nome + ", telefone=" + telefone + ", pago=" +pago;
	}



	public void pagar() {
		
		if (this.pago == true)
			System.out.println("\nPago!!!");
		else
			System.out.println("\nXexero!!");
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

}
