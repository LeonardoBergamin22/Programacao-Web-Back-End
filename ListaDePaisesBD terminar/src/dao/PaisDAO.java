package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.PaisModel;

public class PaisDAO {
	private String url = "jdbc:mysql://localhost:3306/PrimeiroBanco";
	private String usuario = "root";
	private String senha = "aluno";
	private Connection connection;

	private List<PaisModel> listaDePaises;

	public PaisDAO() {
		listaDePaises = new ArrayList<>();
	}

	public List<PaisModel> getListaDePaises() {
		return listaDePaises;
	}

	public void adicionaPais(PaisModel pais) {
		listaDePaises.add(pais);
	}

	public void removePais(PaisModel pais) {
		listaDePaises.remove(pais);
	}

	public void limpaLista() {
		listaDePaises.clear();
	}

	public void testaConecxao() {
		boolean conectou = abreConexao();
		if (conectou) {
			System.out.println("Conectou");
		} else {
			System.out.println("Não Conectou");
		}

	}

	public boolean abreConexao() {
		try {
			Class.forName("com.mysql.cj.jbdc.Diver");
			connection = DriverManager.getConnection(url, usuario, senha);

			if (connection != null) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public void fechaConexao() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
