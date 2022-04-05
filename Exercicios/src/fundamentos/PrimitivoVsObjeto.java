package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		//texto seria o objeto e usando a notação ponto, temos atributos que podemos
		//usar nele.
		
		String s = "texto";
		s.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos primitivos.
		//Tipos primitivos não tem notação ponto sem os wrappers.
		
		int a = 123;
		System.out.println(a);
	}

}
