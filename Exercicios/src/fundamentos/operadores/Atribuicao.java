package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {

		int a = 5;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - b;
		c *= b; // c = c * b;
		c /= a; // c = c / b;
		
		System.out.println(c);
		
		c %= 2; // c = c % 2; 0 = par e 1 = impar
		System.out.println(c);
		
	}
}
