package controle;

public class For_Desafio {
	public static void main(String[] args) {
		
//		String valor = "#";
//		for(int i = 0; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		//Versão do desafio
		//Não pode usar o valor numérico para controlar o laço!
		
		
		for(String i = "-" ; !i.equals("------"); i+= "-") {
			System.out.println(i);
		}
		
	}
}
