package br.com.dio.desafio.dominio;
	import java.time.LocalDate;
	
public class Mentoria {
	private String titulo;
	private String descricao;
	private LocalDate dataDasMentorias;
	
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
	public LocalDate getDataDasMentorias() {
		return dataDasMentorias;
	}
	public void setDataDasMentorias(LocalDate dataDasMentorias) {
		this.dataDasMentorias = dataDasMentorias;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", dataDasMentorias=" + dataDasMentorias
				+ "]";
	}
	
	
	
	
}
