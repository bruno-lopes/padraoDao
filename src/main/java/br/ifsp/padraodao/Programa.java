package br.ifsp.padraodao;

import br.ifsp.padraodao.modelo.entidade.Aluno;
import br.ifsp.padraodao.modelo.negocio.AlunoService;

public class Programa {
	public static void main(String[] args) {
		AlunoService alunoService = new AlunoService();
		Aluno novoAluno = new Aluno("João", "999.999.999-99");
		try {
			alunoService.inserirAluno(novoAluno);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
