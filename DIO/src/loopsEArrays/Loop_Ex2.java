package loopsEArrays;

import java.util.Scanner;

public class Loop_Ex2 {

	/*
	Fa�a um programa que pe�a uma nota, entre zero e dez.
	Mostre uma mensagem caso o valor seja inv�lido
	e continue pedindo
	at� que o usu�rio informe um valor v�lido.
	*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a nota: ");
		double nota = entrada.nextDouble();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida!\nInforme uma nota v�lida:");
			nota = entrada.nextDouble();
		}
		
		
		entrada.close();
	}
}
