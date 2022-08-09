package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio {

	public static void main(String[] args) {

		/*
		 * 1.A partir do produto, calcular o preço real(com desconto);
		 * 2.Imposto municipal: >= 2500 (8.5%)/ <2500 isento;
		 * 3.Frete: >= 3000 (100) / < 3000 (50)
		 * 4.Arredondar: Deixar duas casas decimais
		 * 5.Formatar: R$ 1234,56
		 */
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		// 1
		BinaryOperator<Double> precoReal = (n1, n2) -> (n1 * (1 - n2));
		double preco = precoReal.apply(p.preco, p.desconto);
		
		System.out.printf("preço final %.2f \n", preco);

		// 2
		Function<Double, Double> imposto = (n1) -> n1 >= 2500 ? (n1 * 0.13) : 0;
		double imposto2 = precoReal.andThen(imposto).apply(p.preco, p.desconto);
		
		System.out.printf("Valor do imposto: %.2f \n" , imposto2);

		// 3
		Function<Double, Integer> frete = (n1) -> n1 >= 3000 ? 100 : 50;
		System.out.println("Valor do frete:" + precoReal.andThen(frete).apply(p.preco, p.desconto));

		// 5
		System.out.printf("preço final R$ %.2f \n", preco);
		
	}
}
