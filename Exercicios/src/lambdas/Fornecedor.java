package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		
		//Quando voc� n�o recebe parametro no lambda ou 
		//recebe mais de um, voc� tem que usar '()' antes do '->'
		Supplier<List<String>> umaLista = 
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
				
				
		System.out.println(umaLista.get());
		
	}
}
