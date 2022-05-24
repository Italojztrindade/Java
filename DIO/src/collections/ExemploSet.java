package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {

		System.out.println("Crie uma lista e adicione sete notas: ");
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5,9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas.toString());
		
		
//		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
		
		
//		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
//		notas.add(4, 8d);
//		System.out.println(notas);
		
		
		
//		System.out.println("Substitua a nota 5.0 por 6.0: ");
//		notas.set(notas.indexOf(5.0), 6.0);
//		System.out.println(notas);
		
		
		
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
		
		
//		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
//		for (Double double1 : notas) {
//			System.out.println(double1);
//		}
		
		
//		System.out.println("Exiba a terceira nota adiciona: " + notas.get(2));
		
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			//observação: Não soma valores iguais.
			soma += next;
		}
		
		
		System.out.println("Exiba a soma das notas: " + soma);
		
		System.out.println("Exima a média das notas: " + (soma/notas.size()));

		
		System.out.println("Remova a nota 0:");
		notas.remove(0d);
		System.out.println(notas);
		
//		System.out.println("Remova a nota na posição 0:");
//		notas.remove(0);
//		System.out.println(notas);
		
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println("Remova as notas menores que 7.0 e exiba a lista: " + notas);
		
		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apague toda a lista");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("A lista está vazia? " + notas.isEmpty());
		System.out.println("A lista 2 está vazia? " + notas2.isEmpty());
		
	}
}
