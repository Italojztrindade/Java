package oo.heranca.desafio;

public class Teste {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		Carro ferrari = new Ferrari(400);
		
		
		System.out.println("Civic");
		System.out.println(civic);
		System.out.println("\nAcelerando 3x");
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic);
		
		System.out.println("\nFreando 2x");
		civic.frear();
		civic.frear();
		System.out.println(civic);

		
		System.out.println("################################");
		System.out.println("\nFerrari");
		System.out.println(ferrari);
		System.out.println("\nAcelerando 3x");
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println(ferrari);
		
		System.out.println("\nFreando 2x");
		ferrari.frear();
		ferrari.frear();
		System.out.println(ferrari);
	
		}
	
	
	
}
