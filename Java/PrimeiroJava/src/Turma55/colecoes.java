package Turma55;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class colecoes {

	public static void main(String[] args) {//integer= inteiro'
		
		List<Integer> minhaLista = new ArrayList <Integer>();
		boolean estado = true;
		if(estado== true) {
			System.out.println("\nParabens você foi sorteada");
		}
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(4);
		
		for (Integer listaelementos: minhaLista){
			// listaelemento é a varivel de looping\repetição em cima do minhaLista
			System.out.println(listaelementos);
		}
		System.out.println("Removendo um elembto da lista");
		System.out.println();
		minhaLista.remove(0);

		for (Integer listaelementos: minhaLista){
			// listaelemento é a varivel de looping\repetição em cima do minhaLista
			System.out.println(listaelementos);
	}
	
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento é: "+primeiroElemento);
		System.out.println();
		for (int i=0; i<minhaLista.size(); i++) {
			
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		Collections.sort(minhaLista);//Vai botar em ordem crescente
		System.out.println("\nDepois de ordenado...");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer>meuSet = new HashSet<Integer>();
		
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(6);
		
		Iterator<Integer> iMeuSet= meuSet.iterator();
		
	}
}
