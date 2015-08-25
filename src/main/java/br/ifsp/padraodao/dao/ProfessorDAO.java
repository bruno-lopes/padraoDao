package br.ifsp.padraodao.dao;

import java.util.List;

import br.ifsp.padraodao.modelo.entidade.Professor;

public interface ProfessorDAO extends GenericDAO<Professor> {

	public List<Professor> listarPorNivel(String nivel) throws Exception;
}
