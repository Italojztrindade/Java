package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class RefazendoDesafio {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> converter = s -> new StringBuilder(s).reverse().toString();
		
		Function<String, Integer> reverter = r -> Integer.parseInt(r, 2) ;
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(converter)
			.map(reverter)
			.forEach(System.out::println);
		//a saida é diferente pois os números foram invertidos. Caso queira conferir, comente a linha 20
	}
}
