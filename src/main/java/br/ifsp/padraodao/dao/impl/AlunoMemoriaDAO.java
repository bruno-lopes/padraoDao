package br.ifsp.padraodao.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.ifsp.padraodao.dao.AlunoDAO;
import br.ifsp.padraodao.modelo.entidade.Aluno;

public class AlunoMemoriaDAO implements AlunoDAO {

	List<Aluno> alunos = new ArrayList<Aluno>();

	public void inserir(Aluno aluno) throws Exception {
		this.alunos.add(aluno);
		System.out.println("Aluno inserido com sucesso na memória");
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
