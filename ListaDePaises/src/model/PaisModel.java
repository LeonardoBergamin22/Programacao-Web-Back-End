package model;

public class PaisModel {
	private String nome;
	private String capital;

	public PaisModel(String nome, String capital) {
		this.nome = nome;
		this.capital = capital;
	}
	
	public PaisModel(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
