package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {
	/*
	 * Fa�a um programa que receba a temperatura m�dia os 6 primeiros meses do ano e
	 * armazene-as em uma lista.Ap�s isto, calcule a m�dia semestral das
	 * temperaturas e mostre todas as temperaturas acima desta m�dia, e em que m�s
	 * elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<Double> temperaturas = new ArrayList<Double>();

		System.out.println("Informe as temperaturas: ");
		temperaturas.add(entrada.nextDouble());
		temperaturas.add(entrada.nextDouble());
		temperaturas.add(entrada.nextDouble());
		temperaturas.add(entrada.nextDouble());
		temperaturas.add(entrada.nextDouble());
		temperaturas.add(entrada.nextDouble());

		System.out.println(temperaturas);
		Iterator<Double> iterator = temperaturas.iterator();

		double soma = 0;
		double media = 0;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}

		media = soma / temperaturas.size();
		System.out.printf("A m�dia do semestre � de: %.1f �C", media);

		System.out.println("#######");
		for (Double double1 : temperaturas) {
			if (double1 >= media) {
				int index = temperaturas.indexOf(double1);
				switch (index) {
				case 0:
					System.out.println((index + 1) + " - JANEIRO: " + double1 + " �C");
					break;
				case 1:
					System.out.println((index + 1) + " - FEVEREIRO: " + double1 + " �C");
					break;
				case 2:
					System.out.println((index + 1) + " - MAR�O: " + double1 + " �C");
					break;
				case 3:
					System.out.println((index + 1) + " - ABRIL: " + double1 + " �C");
					break;
				case 4:
					System.out.println((index + 1) + " - MAIO: " + double1 + " �C");
					break;
				case 5:
					System.out.println((index + 1) + " - JUNHO: " + double1 + " �C");
					break;
				default:
					break;
				}
			}
		}

		entrada.close();
	}

}
