package br.ifsp.padraodao.modelo.negocio;

import br.ifsp.padraodao.dao.AlunoDAO;
import br.ifsp.padraodao.modelo.entidade.Aluno;

public class AlunoService {

	AlunoDAO alunoDAO = null;

	public AlunoService(AlunoDAO alunoDAO) {
		this.alunoDAO = alunoDAO;
	}

	public void inserirAluno(Aluno novoAluno) throws Exception {
		// this.validarAluno(novoAluno)
		alunoDAO.inserir(novoAluno);
	}
}
