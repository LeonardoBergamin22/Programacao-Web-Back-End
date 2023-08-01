package controller;

import java.util.Date;

import model.Cliente;
import model.Pedido;
import model.Produto;
import view.PedidoView;

public class PedidoController {
	private PedidoView pedidoView;
	
	public PedidoController() {
		pedidoView = new PedidoView();
	}
	
	public Pedido criarPedido(int idPedido, int quantidade, Date data, Cliente cliente, Produto produto) {
	Pedido pedido = new Pedido(idPedido, quantidade, data, cliente, produto);
	return pedido;
}
public void exibirDetalhesPedido(Pedido pedido) {
	pedidoView.exibirPedido(pedido);
	
}
}