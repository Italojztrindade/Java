package controle;

public class If_Desafio {

	public static void main(String[] args) {
		/*
		 * Encontrar o motivo pelo qual está sendo mostrado as mensagens mesmo 
		 * a nota sendo inferior ao necessário.
		 * 
		 * Resposta, o ; está encerrando o if
		 */
		
		double nota = 1.3;
		
		if(nota >= 9.0); {
			System.out.println("Quadro de honra!");
			System.out.println("Parabéns!");
		}
	}
}
