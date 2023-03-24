package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	
	@Override
	public double calcularXp() {
		//ao concluír o curso vamos pegar o xp padrao e multiplicar pela carga horária do curso
		return XP_PADRAO * cargaHoraria;
	}
	
	
	public Curso() {
		
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [Titulo=" +getTitulo() + " ,Descricao=" + getDescricao() + " ,cargaHoraria=" + cargaHoraria + "]";
	}


	
	
	
}
