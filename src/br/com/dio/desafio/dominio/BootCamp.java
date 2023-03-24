package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now(); // data atual
	private final LocalDate dataFinal = dataInicial.plusDays(45); // data final será a data apos 45 do inicio	
	//final porque nao vai poder alterar as datas ao logo da execução
	
	// criaremos um SEt de <Dev> para que não posaam ser duplicado o memso dev no bootcamp
	Set<Dev> devInscritos = new HashSet<>(); //HasSet<> porque a ordem irrelevante
	
	//criar um grupo de conteudos para o boot camp que serão os cursos e as mentorias que fazerm parte do bootcamp
	Set<Conteudo> conteudo = new LinkedHashSet<>(); // Linked porque a ordem  ods conteudo é importante
	//vamos gerar os equals e Hashcode para poder fazer comparações etc...
	
	//GETTERS AND SETTERS
	
	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public String getDescricao() {return descricao;}

	public void setDescricao(String descricao) {this.descricao = descricao;}

	public Set<Dev> getDevInscritos() {return devInscritos;}

	public void setDevInscritos(Set<Dev> devInscritos) {this.devInscritos = devInscritos;}

	public Set<Conteudo> getConteudo() {return conteudo;}

	public void setConteudo(Set<Conteudo> conteudo) {this.conteudo = conteudo;}

	public LocalDate getDataInicial() {		return dataInicial;}

	public LocalDate getDataFinal() {return dataFinal;}
	
	
	
	// EQUALS E HASHCODE

	@Override
	public int hashCode() {
		return Objects.hash(conteudo, dataFinal, dataInicial, descricao, devInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootCamp other = (BootCamp) obj;
		return Objects.equals(conteudo, other.conteudo) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devInscritos, other.devInscritos) && Objects.equals(nome, other.nome);
	}
	

	
	
	
	
	
	
}
