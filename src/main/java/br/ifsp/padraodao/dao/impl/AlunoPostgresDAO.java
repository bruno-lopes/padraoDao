package br.ifsp.padraodao.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.ifsp.padraodao.dao.AlunoDAO;
import br.ifsp.padraodao.modelo.entidade.Aluno;

public class AlunoPostgresDAO implements AlunoDAO {

	public void inserir(Aluno aluno) throws Exception {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/padraodao", "postgres",
					"postgres");
			String sql = "insert into aluno (nome, cpf) values (?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getCpf());
			statement.execute();
			statement.close();
			System.out.println("Aluno inserido com sucesso no Postgres");
		} catch (SQLException e) {
			throw new Exception("Não foi possível inserir o aluno");
		}

	}

	public void atualizar(Aluno aluno) throws Exception {
	}

	public void remover(Long id) throws Exception {
	}

	public List<Aluno> listarTodos() throws Exception {
		return null;
	}

	public Aluno encontrarPorId(Long id) throws Exception {
		return null;
	}

}
