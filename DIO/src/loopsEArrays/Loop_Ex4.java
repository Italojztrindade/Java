package loopsEArrays;

import java.util.Scanner;

public class Loop_Ex4 {

	/*
	Faça um programa que peça N números inteiros,
	calcule e mostre a quantidade de números pares
	e a quantidade de números impares.
	*/
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = entrada.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}
