package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		//texto seria o objeto e usando a nota��o ponto, temos atributos que podemos
		//usar nele.
		
		String s = "texto";
		s.toUpperCase();
		
		//Wrappers s�o a vers�o objeto dos tipos primitivos.
		//Tipos primitivos n�o tem nota��o ponto sem os wrappers.
		
		int a = 123;
		System.out.println(a);
	}

}
