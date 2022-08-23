package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. N�mero para string bin�ria... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString() ;
		
		//(c, 2) Ele espera uma string com valor decimal, se o segundo valor for 2, ele vai entender que est� passando um binario
		Function<String, Integer> converter = c -> Integer.parseInt(c, 2);

		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(converter)
			.forEach(System.out::println);
		
		
		
	}
	
}
