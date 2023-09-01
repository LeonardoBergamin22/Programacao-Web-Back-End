package controller;

import dao.PlanetaDAO;
import model.PlanetaModel;
import view.PlanetaView;

public class PlanetaController {
	private PlanetaView planetaView;
	private PlanetaDAO planetaDAO;

	public PlanetaController() {
		planetaView = new PlanetaView();
		planetaDAO = new PlanetaDAO();
	}

	public void adicionarPlaneta(String nome) {
		PlanetaModel planeta = new PlanetaModel(nome);
		planetaDAO.adicionaPlaneta(planeta);

	}

	public void exibirListaDePlaneta() {
		planetaView.exibirListaDePlanetas(planetaDAO.getListaDePlanetas());
	}

	public void removerDaListaDePlanetas(String nome) {
		for (int i = 0; i < planetaDAO.getListaDePlanetas().size(); i++) {
			if (planetaDAO.getListaDePlanetas().get(i).getNome().equalsIgnoreCase(nome)) {
				planetaDAO.removePlaneta(planetaDAO.getListaDePlanetas().get(i));
				planetaView.exibirRemovido(nome);
			}

		}

	}

	public void limparLista() {
		planetaDAO.limpaLista();
		planetaView.exibirLimpa();
	}
}
