package br.ifsp.padraodao.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.ifsp.padraodao.dao.ProfessorDAO;
import br.ifsp.padraodao.modelo.entidade.Professor;

public class ProfessorPostgresDAO implements ProfessorDAO {

	public void inserir(Professor professor) throws Exception {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/padraodao", "postgres",
					"postgres");
			String sql = "insert into professor (nome, cpf, nivel) values (?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, professor.getNome());
			statement.setString(2, professor.getCpf());
			statement.setString(3, professor.getNivel());
			statement.execute();
			statement.close();
			System.out.println("Professor inserido com sucesso no Postgres");
		} catch (SQLException e) {
			throw new Exception("Não foi possível inserir o professor");
		}

	}

	public void atualizar(Professor professor) throws Exception {
	}

	public void remover(Long id) throws Exception {
	}

	public List<Professor> listarTodos() throws Exception {
		return null;
	}

	public Professor encontrarPorId(Long id) throws Exception {
		return null;
	}

	public List<Professor> listarPorNivel(String nivel) throws Exception {
		return null;
	}
}