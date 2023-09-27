package modell;

public class Tarefa {
	public static enum Status {
		A, P, C
	}
	
	private Integer id_tarefa;
	private String titulo;
	private String descricao;
	private Status status;
	
	public Tarefa(Integer id_tarefa, String titulo, String descricao, Status status) {
		this.id_tarefa = id_tarefa;
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
	}
	
	public Integer getId_Tarefa() {
		return id_tarefa;
	}
	
	public void setId_tarefa(Integer id_tarefa) {
		this.id_tarefa = id_tarefa;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
}


