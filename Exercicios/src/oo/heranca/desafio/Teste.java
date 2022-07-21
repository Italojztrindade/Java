package oo.heranca.desafio;

public class Teste {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		Carro ferrari = new Ferrari();
		Carro carro = new Carro();
		
		
		System.out.println("Civic");
		System.out.println("velocidade atual: " + civic.velocidadeAtual);
		System.out.println("\nAcelerando 3x");
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println("velocidade atual: " + civic.velocidadeAtual);
		
		System.out.println("\nFreando 2x");
		civic.frear();
		civic.frear();
		System.out.println("velocidade atual: " + civic.velocidadeAtual);
		
		System.out.println("\nTestando a condição " + civic.frear());
		
		System.out.println("Testando a condição " + civic.frear());
		
		System.out.println("velocidade atual: " + civic.velocidadeAtual);
		
		
		System.out.println("####################################");
		System.out.println("\nFerrari");
		System.out.println("velocidade atual: " + ferrari.velocidadeAtual);
		System.out.println("\nAcelerando 3x");
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println("velocidade atual: " + ferrari.velocidadeAtual);
		
		System.out.println("\nFreando 2x");
		ferrari.frear();
		ferrari.frear();
		System.out.println("velocidade atual: " + ferrari.velocidadeAtual);
		
		System.out.println("\nTestando a condição " + ferrari.frear());
		System.out.println("Testando a condição " + ferrari.frear());
		
		System.out.println("velocidade atual: " + ferrari.velocidadeAtual);
		System.out.println("####################################");
		System.out.println("\nCarro normal");
		System.out.println("velocidade atual: " + carro.velocidadeAtual);
		System.out.println("\nAcelerando 3x");
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		
		System.out.println("velocidade atual: " + carro.velocidadeAtual);
		
		System.out.println("\nFreando 2x");
		carro.frear();
		carro.frear();
		System.out.println("velocidade atual: " + carro.velocidadeAtual);
		
		System.out.println("\nTestando a condição " + carro.frear());
		System.out.println("Testando a condição " + carro.frear());
		
		System.out.println("velocidade atual: " + carro.velocidadeAtual);
		
		
		}
	
	
	
}
