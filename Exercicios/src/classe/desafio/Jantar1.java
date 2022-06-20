package classe.desafio;

public class Jantar1 {
	
	public static void main(String[] args) {
		
	
	Comida1 entrada = new Comida1 ("Salada", 0.3);
	Comida1 pratoPrincipal = new Comida1 ("Lasanha de beringela", 0.6);
	Comida1 sobremesa = new Comida1 ("tiramisu", 0.25);
	
	Pessoa1 cliente = new Pessoa1 ("Italo", 93.2);
	
	System.out.println(cliente.apresentar());
	
	cliente.comer(entrada);
	System.out.println(cliente.apresentar());
	
	
	cliente.comer(pratoPrincipal);
	System.out.println(cliente.apresentar());
	
	
	cliente.comer(sobremesa);
	System.out.println(cliente.apresentar());
	
	
	}
}
