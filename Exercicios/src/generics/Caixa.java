package generics;

public class Caixa<T> { //anota��o do generics

	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
	
}
