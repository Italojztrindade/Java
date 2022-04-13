package controle;

import java.util.Scanner;

public class While_Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidade = 0;
		double nota = 0;
		double total = 0;
		
		
		System.out.println("digite -1 para sair");
		while(nota != -1) {
			
			System.out.println("Digite a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidade++;
			} else if (nota != -1){
				System.out.println("Informe uma nota válida");
			}
		}
		// coloquei a media aqui pois mais acima, o total e quantidade estão zerados
		double media = total / quantidade;
		System.out.println("A média é " + media);
		
		
		entrada.close();
		
	}
}
