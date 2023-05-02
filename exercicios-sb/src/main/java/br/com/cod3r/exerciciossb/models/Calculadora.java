package br.com.cod3r.exerciciossb.models;

public class Calculadora {

	private int primeiroValor;
	private int segundoValor;
	
	
	public Calculadora(int primeiroValor, int segundoValor) {
		super();
		this.primeiroValor = primeiroValor;
		this.segundoValor = segundoValor;
	}
	
	
	public int getPrimeiroValor() {
		return primeiroValor;
	}
	public int getSegundoValor() {
		return segundoValor;
	}
	public void setPrimeiroValor(int primeiroValor) {
		this.primeiroValor = primeiroValor;
	}
	public void setSegundoValor(int segundoValor) {
		this.segundoValor = segundoValor;
	}
	
	public int calculandoASoma(int primeiroValor,int segundoValor) {
		int total = primeiroValor + segundoValor;
		return total;
	}
	
	
}
