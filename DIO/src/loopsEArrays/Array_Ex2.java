package loopsEArrays;

import java.util.Scanner;

public class Array_Ex2 {

	/*
	 * Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes
	 * foram lidas. Imprima as consoantes.
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] consoantes = new String[6];
		int quantidadeDeConsoantes = 0;
		int contador = 0;

		do {
			System.out.println("Letra: ");
			String letra = entrada.next();
			if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
					|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("y")))
				
			{
				consoantes[contador] = letra;
				quantidadeDeConsoantes++;
			}
			contador++;
		} while (contador < consoantes.length);

		System.out.println("Consoantes: ");
		for (String consoante : consoantes) {
			if(consoante != null) {
				System.out.print(consoante + " ");
			}}
		System.out.println("\nQuantidade de consoantes: " + quantidadeDeConsoantes);
		
		entrada.close();

	}
}
