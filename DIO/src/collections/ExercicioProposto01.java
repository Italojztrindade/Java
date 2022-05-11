package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioProposto01 {
	/*Fa�a um programa que receba a temperatura m�dia os 6 primeiros meses do
	ano e armazene-as em uma lista.Ap�s isto, calcule a m�dia semestral 
	das temperaturas e mostre todas as temperaturas acima desta m�dia,
	e em que m�s elas ocorreram (mostrar o m�s por
	extenso: 1 � Janeiro, 2 � Fevereiro e etc).
	*/
	
	public static void main(String[] args) {
		
		List<Double> temperaturas = new ArrayList<Double>();
		
		temperaturas.add(0, 30.9);
		temperaturas.add(0, 20.1);
		temperaturas.add(0, 10.9);
		temperaturas.add(0, 15.8);
		temperaturas.add(0, 25.3);
		temperaturas.add(0, 5d);
		
		Iterator<Double> iterator = temperaturas.iterator();
		
		double soma = 0;
		
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
	
	}
}
