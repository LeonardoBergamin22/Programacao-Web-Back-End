package dao;

import java.util.ArrayList;
import java.util.List;

import model.PaisModel;

public class PaisDAO {
	private List<PaisModel> listaDePaises;
	
	//constructor
	public PaisDAO() {
		listaDePaises = new ArrayList<>();
	}
	
	//get
	public List<PaisModel> getListaDePaises() {
		return listaDePaises;
	}
	
	//method
	public void adicionaPais(PaisModel pais) {
		listaDePaises.add(pais);
	}
	
	public void removePais(PaisModel pais) {
		listaDePaises.remove(pais);
	}
	
	public void limpaLista() {
		listaDePaises.clear();
	}
}
