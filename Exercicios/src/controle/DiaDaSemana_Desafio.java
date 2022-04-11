package controle;

import java.util.Scanner;

public class DiaDaSemana_Desafio {

	/*
	 * Receber o dia da semana e devolver um número ex: Domingo -> 1, Sábado -> 7
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String dia = entrada.next().toLowerCase();

		if ("domingo".equals(dia)) {
			System.out.println("1º dia da semana");
		} else if ("segunda".equals(dia)) {
			System.out.println("2º dia da semana");
		} else if ("terça".equals(dia) || ("terca".equals(dia))) {
			System.out.println("3º dia da semana");
		} else if ("quarta".equals(dia)) {
			System.out.println("4º dia da semana");
		} else if ("quinta".equals(dia)) {
			System.out.println("5º dia da semana");
		} else if ("sexta".equals(dia)) {
			System.out.println("6º dia da semana");
		} else if ("sábado".equals(dia)|| ("sabado".equals(dia))) {
			System.out.println("7º dia da semana");
		} else {
			System.out.println("Dia inválido");
		}
		entrada.close();
	}
}
