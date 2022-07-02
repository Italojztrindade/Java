package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	Item item;
	
	ArrayList<Item> itens = new ArrayList<>();
	
	void AdicionarItem(Item item){
		itens.add(item);
	}
	
	
	
	
	public double obterValorTotal(Compra compra) {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco ;
		}
		
		return total;
	}
	
}
