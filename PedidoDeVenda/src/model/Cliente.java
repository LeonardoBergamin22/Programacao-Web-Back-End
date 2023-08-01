package model;

public class Cliente {
	private int idCliente;
	private String nome;
	private String email;
	

	public Cliente(int idCliente, String nome, String email) {
		
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [idCriente=" + idCliente + ", nome=" + nome + ", email=" + email + "]";
	}

}
