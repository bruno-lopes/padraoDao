package br.ifsp.padraodao.dao;

import java.util.List;

public interface GenericDAO<T> {
	public void inserir(T objeto) throws Exception;

	public void atualizar(T objeto) throws Exception;

	public void remover(Long id) throws Exception;

	public List<T> listarTodos() throws Exception;

	public T encontrarPorId(Long id) throws Exception;
}
