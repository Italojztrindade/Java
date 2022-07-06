package oo.composicao.desafio;

public class DesafioMain {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "Italo";
		
		Produto produto1 = new Produto("Teste", 50);
		Produto produto2 = new Produto("Teste2", 50);
		
		Item item1 = new Item(produto1, 2);
		Item item2 = new Item(produto2, 10);
		
		Compra compra1 = new Compra();
		compra1.AdicionarItem(item2);
		compra1.AdicionarItem(item1);
//		
//		cliente1.compra.obterValorTotal(compra1);
		
		System.out.println("nome do cliente " + cliente1.nome);
		System.out.println("nome do produto " + produto1.nomeDoProduto);
		System.out.println("preço do produto R$ " + produto2.preco);
		System.out.println("Quantidade de itens" + item1.quantidade);
		System.out.println(item2.produto.nomeDoProduto);
		System.out.println(compra1.obterValorTotal(compra1));
		System.out.printf(cliente1.nome + " R$ " +compra1.obterValorTotal(compra1));
		
		
		
		
		
	}
}
