package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		Ferrari ferrari = new Ferrari(400);
		
		
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
		
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		
		System.out.println(ferrari.velocidadeDoAr());
		
		System.out.println("\nAcelerando 3x");
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();		
		System.out.println(ferrari);
		
//		System.out.println("\nFreando 2x");
//		ferrari.frear();
//		ferrari.frear();
//		System.out.println(ferrari);
	
		}
	
	
	
}
