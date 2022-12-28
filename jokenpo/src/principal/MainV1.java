package principal;

import java.util.Scanner;

public class MainV1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int jogador, computador;
		
		System.out.println("Escolha:");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		
		jogador = entrada.nextInt();
		
		switch (jogador) {
		case 1: 
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2: 
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default: 
			break;
		}
		
		computador = (int) (Math.random() * 3 + 1);
		
		if(jogador == 1 || jogador == 2 || jogador == 3) {
			
		switch (computador) {
		case 1: 
			System.out.println("Computador escolheu Pedra");
			break;
		case 2: 
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
			}
		}
		
		if(jogador == 1 && computador == 1) {
			System.out.println("Empate");
		}else if(jogador == 1 && computador == 2) {
			System.out.println("Jogador perdeu");
		}else if(jogador == 1 && computador == 3) {
			System.out.println("Jogador ganhou");
		}else if(jogador == 2 && computador == 1) {
			System.out.println("Jogador ganhou");
		}else if(jogador == 2 && computador == 2) {
			System.out.println("Empate");
		}else if(jogador == 2 && computador == 3) {
			System.out.println("Jogador perdeu");
		}else if(jogador == 3 && computador == 1) {
			System.out.println("Jogador perdeu");
		}else if(jogador == 3 && computador == 2) {
			System.out.println("Jogador ganhou");
		}else if(jogador == 3 && computador == 3) {
			System.out.println("Empate");
		} else {
			System.out.println("invalido");
		}
		
		entrada.close();
		
		
		
		
	}
}
