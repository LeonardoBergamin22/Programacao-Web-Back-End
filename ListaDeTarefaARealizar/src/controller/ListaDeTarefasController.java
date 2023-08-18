package controller;

import java.util.ArrayList;
import java.util.List;

import model.ListaDeTarefasModel;
import viewl.ListaDeTarefasView;

public class ListaDeTarefasController {
	private List<ListaDeTarefasModel> listaDeTarefas;
	private ListaDeTarefasView listaDeTarefasV;

	public ListaDeTarefasController() {

		this.listaDeTarefas = new ArrayList<>();
		this.listaDeTarefasV = new ListaDeTarefasView();
	}

	public void adicionarTarefa(String tarefa) {
		ListaDeTarefasModel tarefas = new ListaDeTarefasModel(tarefa,"a fazer");
		listaDeTarefas.add(tarefas);
		
	}

	public void removerTarefa(String tarefa) {
		for (int i = 0; i < listaDeTarefas.size(); i++) {
			if (listaDeTarefas.get(i).getTarefa().equalsIgnoreCase(tarefa)) {
				listaDeTarefas.remove(i);
			} else {
				listaDeTarefasV.nomeErrado();
			}
		}
	}

	public void exibirListaDeTarefas() {
		listaDeTarefasV.exibirListaDeTarefas(listaDeTarefas);
	}

	public void limparLista() {
		listaDeTarefas.clear();
		listaDeTarefasV.exibirLimpa();
	}

	public void atulizarStatus(String nome) {
		for (int i = 0; i < listaDeTarefas.size(); i++) {
			if (listaDeTarefas.get(i).getTarefa().equalsIgnoreCase(nome)) {
				listaDeTarefas.get(i).setStatus("Concluida");
			}
		}
	}
}