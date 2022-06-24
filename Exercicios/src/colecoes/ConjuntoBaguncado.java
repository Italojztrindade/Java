package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); //String
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("O tamanho do conjunto �: " + conjunto.size());
	
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("O tamanho do conjunto �: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("O tamanho do conjunto �: " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //uni�o entre dois conjuntos.
		conjunto.retainAll(nums); //intersess�o (o que tem em comum nos dois)
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
		
		
		
	}
}
