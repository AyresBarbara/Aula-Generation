package ExerciciosPlataforma;

public class Aula17_MetodoSobrecarregado {
	//Metodo sem retorno
	public void testaMetodosSobrecarregados() 
	{
		System.out.printf("Salário em numero inteiro: %d\n", salario(1000));
		System.out.printf("Salário em numero double: %f\n", salario(7.500));
	}
	public int salario (int valorInt) 
	{
		System.out.printf("Salário em argumento inteiro: %d\n", valorInt);
		return valorInt * valorInt;
	}
	public double salario (double valorDouble) {
		System.out.printf("Salário em argumento double: %f\n", valorDouble);
		return valorDouble * valorDouble;
	}
}
