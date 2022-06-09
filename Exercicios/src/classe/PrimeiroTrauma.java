package classe;

public class PrimeiroTrauma {

	int a = 3; // nâo pode mexer nessa linha e tem que fazer o print funcionar.
	
	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma(); //instanciando para conseguir acessar
		//Por ser um método estático, não é possível acessar diretamente sendo necessário criar
		//essa instância. 
		// Outra solução seria colocar 'static' no atributo
		
		System.out.println(p.a);
	}
}
