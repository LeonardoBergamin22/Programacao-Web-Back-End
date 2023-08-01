package controller;

import java.util.Date;

import model.Cliente;
import model.Pedido;
import model.Produto;
import view.ClienteView;
import view.PedidoView;

public class ClienteController {
	private ClienteView clienteView;
	
	public ClienteController() {
		clienteView = new ClienteView();
	}
	public Cliente criarCliente(int idCliente, String nome, String email) {
		Cliente cliente = new Cliente( idCliente,  nome,  email);
		return cliente;
	}
	public void exibirDetalhesClinte(Cliente cliente) {
		clienteView.exibirCliente(cliente);
		
	}
}
