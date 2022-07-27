package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {

		Calculo calc = (x, y) -> {
			return x + y;
		};
	
		/* o lambda
		 * (x, y) -> {
			return x + y;
			};
			
			
			tbm o lambda
			(x, y) -> x * y;
		 */
		System.out.println(calc.executar(2, 3));
	
	
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
	}
}
