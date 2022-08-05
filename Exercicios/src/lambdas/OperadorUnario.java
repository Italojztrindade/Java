package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		
		//andThen -> pegue maisDois, depois vezesDois e depois aoQuadrado. Faz na ordem
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		
		//compose, o contrário de andThen, faz de trás pra frente
		int resultado2 = maisDois.compose(vezesDois).compose(aoQuadrado).apply(0);
		System.out.println("exemplo compose -> " + resultado2);
		
		
		
		int resultado3 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado3);
	}
}
