package POO;

public class Quadrado extends BaseFigura implements Figuras {

		Quadrado(double lado, String nome){
			super(lado, lado, nome);//super classe
			nomeClasse = "Quadrado";	
		}
		public double getDiagonal () {
			return lado1;}
		
}
