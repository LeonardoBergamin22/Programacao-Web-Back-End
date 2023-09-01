package view;

import java.util.List;

import model.PlanetaModel;

public class PlanetaView {

	public void exibirListaDePlanetas(List<PlanetaModel> planetas) {
		System.out.println("=== Lista de Planetas ===");
		System.out.println("-----------------------");
		System.out.println("                       ");

		for (PlanetaModel planeta : planetas) {
			System.out.println("Planeta: " + planeta.getNome());
		}
		System.out.println("--------------------------------");
		System.out.println("                                ");
	}

	public void exibirLimpa() {
		System.out.println("Lista limpa com sucesso!");
	}

	public void exibirRemovido(String nome) {
		System.out.println("Planeta " + nome + " removido com sucesso!");
	}
}
