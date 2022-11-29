package exercitando;

import java.util.Scanner;

public class TesteAgenda extends Agenda{
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		Agenda a1 =(new Agenda());
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Informe um nome, idade e altura ");
//			armazenaPessoa(entrada.nextLine(), entrada.nextLine(), entrada.nextLine());
			
		}
		entrada.close();
		System.out.println(a1.toString());
	}
	
//	public static String armazenaPessoa(String nome, String idade, String altura) {
//		this.nome = nome;
//		this.idade = idade;
//		this.altura = altura;
//		List<String> lista = new ArrayList();
//		String conc = (nome + " "+ idade + " "+ altura);
//		lista.add(conc);
//		conc = "";
//		return (lista.toString());
//	}
}
