package dao;

import java.util.ArrayList;
import java.util.List;

import model.PlanetaModel;

public class PlanetaDAO {

	private List<PlanetaModel> listaDePlanetas;

	public PlanetaDAO() {
		listaDePlanetas = new ArrayList<>();
	}

	public List<PlanetaModel> getListaDePlanetas() {
		return listaDePlanetas;
	}

	public void adicionaPlaneta(PlanetaModel planeta) {
		listaDePlanetas.add(planeta);
	}

	public void removePlaneta(PlanetaModel planeta) {
		listaDePlanetas.remove(planeta);
	}

	public void limpaLista() {
		listaDePlanetas.clear();

	}

}