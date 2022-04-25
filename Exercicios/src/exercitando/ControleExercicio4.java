package exercitando;

import java.util.Scanner;

public class ControleExercicio4 {

	/**
	 * 4. Criar um programa que receba um número e diga se ele é um número primo.
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = entrada.nextInt();

		if (numero % 2 == 1) {

			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		entrada.close();

	}

}
