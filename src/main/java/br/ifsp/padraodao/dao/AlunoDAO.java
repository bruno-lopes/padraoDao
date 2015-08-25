package br.ifsp.padraodao.dao;

import java.util.List;

import br.ifsp.padraodao.modelo.entidade.Aluno;

public interface AlunoDAO {
	public void inserir(Aluno aluno) throws Exception;

	public void atualizar(Aluno aluno) throws Exception;

	public void remover(Long id) throws Exception;

	public List<Aluno> listarTodos() throws Exception;

	public Aluno encontrarPorId(Long id) throws Exception;
}
