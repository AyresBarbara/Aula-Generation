package PolimorfismoHeranca;


public class Automovel {
	// declaração dos atributos da classe
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	//criação de metodo especial Construtor
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) 
	{
		this.nomeProprietario = nomeProprietario; // atributo=parametro
		this.modelo = modelo;
		this.placa= placa;
		this.ano= ano;
	}
	//declaração dos demais metodos da classe
	public void imprimirInfo() {
		System.out.println("\nNome do proprietario: "+nomeProprietario+
		" possui um "+modelo+" com placa: "+placa+" e ano: "+ano);
	}
	public String getNomeProprietario() {//botão direito- Source- getters insertes
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
