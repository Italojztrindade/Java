package fundamentos;

public class Aritmeticos_Desafio {

	public static void main(String[] args) {
		
		
		
		int parte1 = (6 * (3 + 2));
		int parte1Elevado = (int) Math.pow(parte1, 2);
	
		int parte2 = 3 * 2;
		int primeiraFracao = parte1Elevado / parte2;
		
		
		
		int parte3 = ((1 - 5) * (2 - 7)/2);
		int segundaFracao = (int) Math.pow(parte3, 2);
		 
		int parte4 = (int) Math.pow((primeiraFracao - segundaFracao), 3);
		
		int parte5 = (int) Math.pow(10, 3);
		
		int resultado = parte4 / parte5;
		
		System.out.println(primeiraFracao);
		System.out.println(segundaFracao);
		
		System.out.println("O resultado dessa operação é: " + resultado);
		
		
		
	}
}
