package view;

import java.util.List;

import modell.Tarefa;

public class TarefaView {
	public void exibeTarefa(Tarefa tarefa) {
		System.out.print("ID da Tarefa: " + tarefa.getId_Tarefa());
		System.out.print(" - Título: " + tarefa.getTitulo());
		System.out.print(" - Descrição: " + tarefa.getDescricao());
		System.out.println(" - Status: " + tarefa.getStatus());
		}
		public void listaTarefa(List<Tarefa> tarefas) {
		for (Tarefa tarefa : tarefas) {
			exibeTarefa(tarefa);
		}
		}
		}


