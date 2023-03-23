package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("Java");
		curso1.setDescricao("Descricao java");
		curso1.setCargaHoraria(8);

		
		curso2.setTitulo("Html");
		curso2.setDescricao("Descricao html");
		curso2.setCargaHoraria(2);
		
		System.out.println(curso1 +" \n"+ curso2);
		
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria java");
		mentoria1.setDescricao("Descricao Mentoria Java");
		mentoria1.setDataDasMentorias(LocalDate.now());
		
		
		System.out.println(mentoria1);
	}

}
