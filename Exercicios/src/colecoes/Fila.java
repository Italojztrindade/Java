package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e add -> adicionam elementos na fila
		// A diferença é o comportamento que ocorre quando a fila está cheia

		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lança uma excessão
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> Obter o próximo elemento da fila (sem remover)

		// A diferença é o comportamento que ocorre quando a fila está vazia

		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma excessão
		System.out.println(fila.element());

		// Pool e remove -> Obter o próximo elemento da fila e remove

		// A diferença é o comportamento que ocorre quando a fila está vazia

		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lança uma excessão
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
