package model;

public class ListaDeTarefasModel {

	private String tarefa;
	private String status;

	public ListaDeTarefasModel(String tarefa, String status) {

		this.tarefa = tarefa;
		this.status = status;

	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
