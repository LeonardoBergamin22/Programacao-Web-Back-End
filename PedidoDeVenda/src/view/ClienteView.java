package view;

import model.Cliente;
import model.Pedido;

public class ClienteView {
	public void exibirCliente(Cliente cliente) {

		System.out.println("+====== Detalhes do cliente ======+");
		System.out.println("ID: " + cliente.getIdCliente());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Email: " + cliente.getEmail());
		System.out.println("+--------------------------------+");
		System.out.println("                                  ");

	}
}
