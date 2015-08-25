package br.ifsp.padraodao;

import br.ifsp.padraodao.dao.impl.AlunoPostgresDAO;
import br.ifsp.padraodao.dao.impl.ProfessorPostgresDAO;
import br.ifsp.padraodao.modelo.entidade.Aluno;
import br.ifsp.padraodao.modelo.entidade.Professor;
import br.ifsp.padraodao.modelo.negocio.AlunoService;
import br.ifsp.padraodao.modelo.negocio.ProfessorService;

public class Programa {
	public static void main(String[] args) {
		AlunoService alunoService = new AlunoService(new AlunoPostgresDAO());
		Aluno novoAluno = new Aluno("João", "999.999.999-99");
		try {
			alunoService.inserirAluno(novoAluno);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		ProfessorService professorService = new ProfessorService(new ProfessorPostgresDAO());
		Professor novoProfessor = new Professor("Alberto", "111.111.111-11", "Associado");
		try {
			professorService.inserirProfessor(novoProfessor);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
