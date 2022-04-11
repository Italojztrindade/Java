package controle;

import java.util.Scanner;

public class DiaDaSemana_Desafio {

	/*
	 * Receber o dia da semana e devolver um n�mero ex: Domingo -> 1, S�bado -> 7
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String dia = entrada.next().toLowerCase();

		if ("domingo".equals(dia)) {
			System.out.println("1� dia da semana");
		} else if ("segunda".equals(dia)) {
			System.out.println("2� dia da semana");
		} else if ("ter�a".equals(dia) || ("terca".equals(dia))) {
			System.out.println("3� dia da semana");
		} else if ("quarta".equals(dia)) {
			System.out.println("4� dia da semana");
		} else if ("quinta".equals(dia)) {
			System.out.println("5� dia da semana");
		} else if ("sexta".equals(dia)) {
			System.out.println("6� dia da semana");
		} else if ("s�bado".equals(dia)|| ("sabado".equals(dia))) {
			System.out.println("7� dia da semana");
		} else {
			System.out.println("Dia inv�lido");
		}
		entrada.close();
	}
}
