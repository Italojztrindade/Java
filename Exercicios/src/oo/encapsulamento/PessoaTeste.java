package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Amoedo", 30);
		p1.setIdade(-43); // Alterar
		
		System.out.println(p1.getIdade());// Ler
		System.out.println(p1); // toString
		System.out.println(p1.getNomeCompleto());
		
		
	}

	
	
}
