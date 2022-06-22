package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe quantas notas calculadas: ");
		int coleta = entrada.nextInt();
		
		double[] notas = new double[coleta];
		
		double somaComFor = 0;
		System.out.println("For");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i+1));
			double parcial = entrada.nextDouble();
			notas[i] = parcial;
			somaComFor += notas[i];
		}
		
		
		 
		
		double somaComForeach = 0;
		System.out.println("Forench");
		int contador = 1;
		for (double d : notas) {
			System.out.println("Informe a nota " + contador);
			double parcial = entrada.nextDouble();
			somaComForeach += parcial;
			contador ++;
		}
		
		double mediaFor = somaComFor / coleta;
		double mediaEach = somaComForeach / coleta;
		
		System.out.printf("\nA média foi de: %.2f", mediaFor);
		System.out.printf("\nA média foi de: %.2f", mediaEach);
		entrada.close();
	}
}
