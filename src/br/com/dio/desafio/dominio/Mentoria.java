package br.com.dio.desafio.dominio;
	import java.time.LocalDate;
	
public class Mentoria extends Conteudo {
	
	private LocalDate dataDasMentorias;
	
	// quando criar uma mentoria o xp padrão incrementará 10
	@Override
	public double calcularXp() {
		return XP_PADRAO +10;
	}
	
	
		
	public Mentoria() {
		
	}
	

	public LocalDate getDataDasMentorias() {
		return dataDasMentorias;
	}
	public void setDataDasMentorias(LocalDate dataDasMentorias) {
		this.dataDasMentorias = dataDasMentorias;
	}
	
	@Override
	public String toString() {
		return "Mentoria [Titulo=" + getTitulo() + " ,Descricao=" + getDescricao() + " ,dataDasMentorias=" + dataDasMentorias
				+ "]";
	}


	
	
	
}
