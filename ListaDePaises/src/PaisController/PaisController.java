package PaisController;

import java.util.ArrayList;
import java.util.List;

import PaisModel.PaisModel;
import PaisView.PaisView;

public class PaisController {
	private List<PaisModel> listaDePaises;
	private PaisView paisView;

	public PaisController() {
		listaDePaises = new ArrayList<>();
		paisView = new PaisView();

	}

	public void adicionarPais(String nome, String capital) {
		PaisModel pais = new PaisModel(nome, capital);
		listaDePaises.add(pais);
	}

	public void exibirListaDePaises() {
		paisView.exibirListaDePaises(listaDePaises);
	}

	public void removerDaListaDePaises(String Nome) {
		for (int i = 0; i < listaDePaises.size(); i++) {
			if (listaDePaises.get(i).getNome().equalsIgnoreCase(Nome)) {
				listaDePaises.remove(i);
			}

		}

	}

	public void limparLista() {
		listaDePaises.clear();
		paisView.exibirLimpa();
	}
}
