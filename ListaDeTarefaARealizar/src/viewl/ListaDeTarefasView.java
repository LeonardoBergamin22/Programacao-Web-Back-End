package viewl;

import java.util.List;

import model.ListaDeTarefasModel;

public class ListaDeTarefasView {

	public void exibirListaDeTarefas(List<ListaDeTarefasModel> listaDeTarefas) {
		System.out.println("=== Lista de tarefas ===");
		System.out.println("-----------------------");
		System.out.println("                       ");

		for (ListaDeTarefasModel tarefa : listaDeTarefas) {
			System.out.println("Tarefa: " + tarefa.getTarefa() + "\n status: "+tarefa.getStatus());
		}
		System.out.println("--------------------------------");
	}

	public void exibirRemovido(String tarefa) {
		System.out.println("Tarefa " + tarefa + " removida com sucesso!");
	}

	public void nomeErrado() {
		System.out.println("Nome incorreto digite novamente: ");
	}

	public void exibirLimpa() {
		System.out.println("Lista limpa com sucesso!");
	}
}
