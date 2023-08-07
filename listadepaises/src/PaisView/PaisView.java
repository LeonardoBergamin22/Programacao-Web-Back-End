package PaisView;

import java.util.List;

import PaisModel.PaisModel;

public class PaisView {
	public void exibirListaDePaises(List<PaisModel> paises) {
		System.out.println("=== Lista de paises ===");
		System.out.println("-----------------------");
		System.out.println("                       ");

		for (PaisModel pais : paises) {
			System.out.println("Pais: " + pais.getNome() + " - Capital: " + pais.getCapital());
		}
		System.out.println("--------------------------------");
		System.out.println("                                ");
	}
	
	public void exibirLimpa() {
		System.out.println("Lista limpa com sucesso!");
	}
	
	public void exibirRemovido(String nome) {
		System.out.println("Pais "+nome+" removido com sucesso!");
	}
}
