package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {
	/*
	 * Faça um programa que receba a temperatura média os 6 primeiros meses do ano e
	 * armazene-as em uma lista.Após isto, calcule a média semestral das
	 * temperaturas e mostre todas as temperaturas acima desta média, e em que mês
	 * elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
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
		System.out.printf("A média do semestre é de: %.1f ºC", media);

		System.out.println("#######");
		for (Double double1 : temperaturas) {
			if (double1 >= media) {
				int index = temperaturas.indexOf(double1);
				switch (index) {
				case 0:
					System.out.println((index + 1) + " - JANEIRO: " + double1 + " ºC");
					break;
				case 1:
					System.out.println((index + 1) + " - FEVEREIRO: " + double1 + " ºC");
					break;
				case 2:
					System.out.println((index + 1) + " - MARÇO: " + double1 + " ºC");
					break;
				case 3:
					System.out.println((index + 1) + " - ABRIL: " + double1 + " ºC");
					break;
				case 4:
					System.out.println((index + 1) + " - MAIO: " + double1 + " ºC");
					break;
				case 5:
					System.out.println((index + 1) + " - JUNHO: " + double1 + " ºC");
					break;
				default:
					break;
				}
			}
		}

		entrada.close();
	}

}
