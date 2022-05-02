package loopsEArrays;

import java.util.Scanner;

public class Loop_Ex2 {

	/*
	Faça um programa que peça uma nota, entre zero e dez.
	Mostre uma mensagem caso o valor seja inválido
	e continue pedindo
	até que o usuário informe um valor válido.
	*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a nota: ");
		double nota = entrada.nextDouble();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida!\nInforme uma nota válida:");
			nota = entrada.nextDouble();
		}
		
		
		entrada.close();
	}
}
