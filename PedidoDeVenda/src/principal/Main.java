package principal;

import java.util.Date;

import controller.ClienteController;
import controller.PedidoController;
import controller.ProdutoController;
import model.Cliente;
import model.Pedido;
import model.Produto;
import view.PedidoView;

public class Main {

	public static void main(String[] args) {
		
		

		ClienteController clienteController= new ClienteController();
		Cliente cliente= clienteController.criarCliente(111, "leonardo", "leo@email.com");

		ProdutoController produtoController = new ProdutoController();
		Produto produto = produtoController.criarproduto(101, "Computador", 3500);
		
		Date data = new Date();
		
		PedidoController pedidoController= new PedidoController();
		Pedido pedido = pedidoController.criarPedido(2, 1, data, cliente, produto);
		
	
		clienteController.exibirDetalhesClinte(cliente);
		produtoController.exibirDetalhesPrduto(produto);
		pedidoController.exibirDetalhesPedido(pedido);
		
		
		

		
		
	}
}
