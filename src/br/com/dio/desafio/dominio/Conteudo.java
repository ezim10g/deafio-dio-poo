package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	//procted as classes filhas terão acesso ao atributo
	protected static final double XP_PADRAO = 10d; //CRIAR UMA CONSTANTE TODO CONTEUDO CRIADO TERÁ UM XP PADRAO 
	private String titulo;
	private String descricao;
	
	
	//criar um metodo abristract para alcular xp, automaticamente a classe precisa ser abstrac
	//uma classe abtract nao pode ser instaciada 
	
	public abstract double calcularXp();
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Conteudo [titulo=" + titulo + ", descricao=" + descricao + "]";
	}
	
	
	
}
