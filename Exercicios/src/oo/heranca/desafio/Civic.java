package oo.heranca.desafio;

public class Civic extends Carro{

	boolean acelerar () {
		boolean acelerando1 = super.acelerar();
		boolean acelerando2 = super.acelerar();
		
		return acelerando1 || acelerando2;
	}
	
	
	boolean frear () {
		boolean freando1 = super.frear();
		boolean freando2 = super.frear();
		
		return freando1 || freando2;
	}
		
		
	
	
	
	
}
