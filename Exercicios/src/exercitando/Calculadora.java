package exercitando;

public class Calculadora {

	public static Double soma(double x, double y) {
		return x + y;
	}
	static Double sub(double x, double y) {
		return x - y;
	}
	static Double mult(double x, double y) {
		return x * y;
	}
	static Double div(double x, double y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		
		System.out.println("soma " + soma(1,2));
		System.out.println("subtração " + sub(1, 2));
		System.out.println("multiplicação " + mult(1, 2));
		System.out.println("divisão " + div(1, 2));
		
		
	}
}
