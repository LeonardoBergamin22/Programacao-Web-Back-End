package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modell.Tarefa;

public class TarefaDAO {
	private String url = "jdbc:mysql://localhost:3306/projeto_revisao";
	private String usuario = "root";
	private String senha = "aluno";
	private Connection connection;

	public void adicionaTarefa(Tarefa tarefa) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "INSERT INTO tarefa " + "(id_tarefa, titulo, descricao, status) " + "VALUES (?,?,?,?);";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, tarefa.getId_Tarefa());
			preparedStatement.setString(2, tarefa.getTitulo());
			preparedStatement.setString(3, tarefa.getDescricao());
			preparedStatement.setString(4, tarefa.getStatus().name());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
