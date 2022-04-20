package exercitando;

import java.util.Scanner;

public class FundamentosExercicio2 {

	/** 2. Criar um programa que leia a temperatura em Fahrenheit
	 * e converta para Celsius. */
	
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = fahrenheit * 1.8 + 32 ;
	
		System.out.printf("Valor em Celsius: %.2f" , conversao);
		
		scanner.close();
	}

}

