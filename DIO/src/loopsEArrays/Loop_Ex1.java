package loopsEArrays;

import java.util.Scanner;

public class Loop_Ex1 {

	/*
	Faça um programa que leia conjuntos de dois valores,
	o primeiro representando o nome do aluno e o segundo representando a sua idade.
	(Pare o programa inserindo o valor 0 no campo nome)
	*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade;
		
		while (true){
			System.out.println("Informe o seu nome ou '0' para sair: ");
			nome = entrada.next();
			if(nome.equals("0")) {
				break;
			}
			System.out.println("Informe sua idade: ");
			idade = entrada.nextInt();
			}
		System.out.println("Fim!");
		
		entrada.close();
	}
	
}
