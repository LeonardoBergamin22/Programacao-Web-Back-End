package controller;

import java.util.ArrayList;
import java.util.List;

import dao.PaisDAO;
import model.PaisModel;
import view.PaisView;

public class PaisController {
	private PaisView paisView;
	private PaisDAO paisDAO;

	public PaisController() {
		paisView = new PaisView();
		paisDAO = new PaisDAO();
	}

	public void adicionarPais(String nome, String capital) {
		PaisModel pais = new PaisModel(nome, capital);
		paisDAO.adicionaPais(pais);
	}

	public void exibirListaDePaises() {
		paisView.exibirListaDePaises(paisDAO.getListaDePaises());
	}

	public void removerDaListaDePaises(String nome) {
		for (int i = 0; i < paisDAO.getListaDePaises().size(); i++) {
			if (paisDAO.getListaDePaises().get(i).getNome().equalsIgnoreCase(nome)) {
				paisDAO.removePais(paisDAO.getListaDePaises().get(i));
				paisView.exibirRemovido(nome);
			}

		}

	}

	public void limparLista() {
		paisDAO.limpaLista();
		paisView.exibirLimpa();
	}

	public void testaConexao() {
		paisDAO.testaConecxao();
	}
}
