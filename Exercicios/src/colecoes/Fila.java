package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e add -> adicionam elementos na fila
		// A diferen�a � o comportamento que ocorre quando a fila est� cheia

		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lan�a uma excess�o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> Obter o pr�ximo elemento da fila (sem remover)

		// A diferen�a � o comportamento que ocorre quando a fila est� vazia

		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma excess�o
		System.out.println(fila.element());

		// Pool e remove -> Obter o pr�ximo elemento da fila e remove

		// A diferen�a � o comportamento que ocorre quando a fila est� vazia

		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lan�a uma excess�o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains(...);
	}

}
