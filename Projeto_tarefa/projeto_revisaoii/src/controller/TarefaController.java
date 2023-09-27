package controller;

import dao.TarefaDAO;
import modell.Tarefa;
import modell.Tarefa.Status;
import view.TarefaView;

public class TarefaController {
	private TarefaView tarefaView;
	private TarefaDAO tarefaDAO;
	
	public TarefaController() {
		tarefaView = new TarefaView();
		tarefaDAO = new TarefaDAO();
	}
	
	public void adicionaTarefa(Integer id_tarefa, String titulo, String descricao, Status status) {
		Tarefa tarefa = new Tarefa(id_tarefa, titulo, descricao, status);
		tarefaDAO.adicionaTarefa(tarefa);
	}
	
	public void atualizaTarefa() {
		
	}
	
	public void finalizaTarefa() {
		
	}
	
	public void listaTarefa() {
		
	}
	
	public void excluiTarefa() {
		
	}
	

}
