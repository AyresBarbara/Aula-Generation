
public abstract class Telefone {
	private String tipo;
	public Telefone(String tipo) {
		this.tipo = tipo;
	}
	
	abstract public void disca(String Numero);// modelo de implementação
	abstract public void toca(int numToques);

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
