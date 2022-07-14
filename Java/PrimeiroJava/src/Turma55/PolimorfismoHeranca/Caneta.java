package Turma55;

public class Caneta {
	
	//CARACTERISTICAS -> ATRIBUTOS/ a forma do objeto/ Projeto da caneta
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
// COMPORTAMENTOS -> METODOS 
	public void escrever ()
	{
		if (this.tampada==true)// só tem uma instrução, não precisa de }{
			System.out.println("Erro! Caneta tampada...");
		else
			System.out.println("Escrevendo...");
	}
	public void tampar() 
	{
		this.tampada=true;
	}
	public void destampar() 
	{
		this.tampada=false;
	}
	public void estado() 
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Está Tampada: "+this.tampada);
		System.out.println("Carga: "+this.carga+"%");
	}
	
}
