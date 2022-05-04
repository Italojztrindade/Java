package loopsEArrays;

import java.util.Random;

public class Array_Ex3 {
	/*
	 * Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
	 * armazene-os num vetor. Ao final mostre os números e seus sucessores.
	 */
	public static void main(String[] args) {

		Random random = new Random();
		int[] numerosAleatorios = new int[20];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}

		System.out.println("aleatórios");
		for (int i : numerosAleatorios) {
			System.out.print(i + " ");
		}
		System.out.println("\nSucessores");
		for (int i : numerosAleatorios) {
			System.out.print((i + 1) + " ");
		}
	}
}
