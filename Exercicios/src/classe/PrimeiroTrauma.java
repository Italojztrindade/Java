package classe;

public class PrimeiroTrauma {

	int a = 3; // n�o pode mexer nessa linha e tem que fazer o print funcionar.
	
	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma(); //instanciando para conseguir acessar
		//Por ser um m�todo est�tico, n�o � poss�vel acessar diretamente sendo necess�rio criar
		//essa inst�ncia. 
		// Outra solu��o seria colocar 'static' no atributo
		
		System.out.println(p.a);
	}
}
