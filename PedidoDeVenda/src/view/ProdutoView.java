package view;

import model.Pedido;
import model.Produto;

public class ProdutoView {
	public void exibirProduto(Produto produto) {

		System.out.println("+====== Detalhes do produto ======+");
		System.out.println("ID: " + produto.getIdProduto());
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preco: " + produto.getPreco());
		System.out.println("+--------------------------------+");
		System.out.println("                                  ");
	}
}
