package br.ifsp.padraodao.dao;

import java.util.List;

import br.ifsp.padraodao.modelo.entidade.Professor;

public interface ProfessorDAO {
	public void inserir(Professor professor) throws Exception;

	public void atualizar(Professor professor) throws Exception;

	public void remover(Long id) throws Exception;

	public List<Professor> listarTodos() throws Exception;

	public Professor encontrarPorId(Long id) throws Exception;

	public List<Professor> listarPorNivel(String nivel) throws Exception;
}
