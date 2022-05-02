package loopsEArrays;

import java.util.Scanner;

public class Loop_Ex5 {
	/*
	Desenvolva um gerador de tabuada,
	capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
	O usuário deve informar de qual numero ele deseja ver a tabuada.
	*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número");
		int numero = entrada.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " * " + i + " = "+ (numero * i));
		}
		
		
		entrada.close();
	}
}
