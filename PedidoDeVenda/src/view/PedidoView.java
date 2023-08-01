package view;

import model.Pedido;

public class PedidoView {

	public void exibirPedido(Pedido pedido) {

		System.out.println("+====== Detalhes do pedido ======+");
		System.out.println("ID: " + pedido.getIdPedido());
		System.out.println("Cliete: " + pedido.getCliente().getNome());
		System.out.println("Pruduto: " + pedido.getProduto().getNome());
		System.out.println("Quantidade: " + pedido.getQuantindade() );
		System.out.println("Data: " + pedido.getData());
		System.out.println("+--------------------------------+");

	}
}
