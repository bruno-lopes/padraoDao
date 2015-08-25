package br.ifsp.padraodao.modelo.negocio;

import br.ifsp.padraodao.dao.ProfessorDAO;
import br.ifsp.padraodao.modelo.entidade.Professor;

public class ProfessorService {

	ProfessorDAO professorDAO = null;

	public ProfessorService(ProfessorDAO professorDAO) {
		this.professorDAO = professorDAO;
	}

	public void inserirProfessor(Professor novoProfessor) throws Exception {
		// this.validarProfessor(novoProfessor)
		professorDAO.inserir(novoProfessor);
	}
}
