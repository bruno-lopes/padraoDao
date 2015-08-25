package br.ifsp.padraodao.modelo.negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ifsp.padraodao.modelo.entidade.Aluno;

public class AlunoService {

	public void inserirAluno(Aluno novoAluno) throws Exception {
		// this.validarAluno(novoAluno)
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/padraodao", "postgres",
					"postgres");
			String sql = "insert into aluno (nome, cpf) values (?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, novoAluno.getNome());
			statement.setString(2, novoAluno.getCpf());
			statement.execute();
			statement.close();
			System.out.println("Aluno inserido com sucesso no Postgres");
		} catch (SQLException e) {
			throw new Exception("Não foi possível inserir o aluno");
		}
	}
}
