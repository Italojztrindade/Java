package loopsEArrays;

import java.util.Scanner;

public class Loop_Ex3 {
	/*
	Fa�a um programa que leia 5 n�meros
	e informe o maior n�mero
	e a m�dia desses n�meros.
	*/
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("N�mero: ");
            numero = entrada.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("M�dia: " + (soma/5));

    }
}
