package loopsEArrays;

import java.util.Scanner;

public class Loop_Ex3 {
	/*
	Faça um programa que leia 5 números
	e informe o maior número
	e a média desses números.
	*/
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = entrada.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
