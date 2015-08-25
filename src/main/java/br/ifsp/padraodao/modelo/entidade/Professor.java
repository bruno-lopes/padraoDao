package br.ifsp.padraodao.modelo.entidade;

public class Professor {

	private Long id;
	private String nome;
	private String cpf;
	private String nivel;

	public Professor(String nome, String cpf, String nivel) {
		this.nome = nome;
		this.cpf = cpf;
		this.nivel = nivel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
