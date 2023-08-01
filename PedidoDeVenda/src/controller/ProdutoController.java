package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	private ProdutoView produtoView;

public ProdutoController() {
	produtoView = new ProdutoView();
}

	public Produto criarproduto( int idProduto, String nome, float preco) {
		Produto produto = new Produto ( idProduto, nome, preco);
		return produto;
	}
	public void exibirDetalhesPrduto(Produto produto) {
		produtoView.exibirProduto(produto);
	}
}
