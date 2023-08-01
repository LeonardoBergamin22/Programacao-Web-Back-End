package principal;

import java.util.Date;

import controller.PedidoController;
import controller.ProdutoController;
import model.Cliente;
import model.Pedido;
import model.Produto;
import view.PedidoView;

public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente(1, "Leonardo ", "Leo@email.com");

		ProdutoController pc1 = new ProdutoController();
		Produto produto = pc1.criarproduto(101, "Computador", 3500);
		pc1.exibirDetalhesPrduto(produto);
		
		Date data = new Date();
		
		PedidoController pc = new PedidoController();
		
		Pedido pedido = pc.criarPedido(2, 1, data, cliente, produto);
		
		pc.exibirDetalhesPedido(pedido);
		
		
	}
}
