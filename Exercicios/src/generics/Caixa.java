package generics;

public class Caixa<T> { //anotação do generics

	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
	
}
