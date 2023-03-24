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
		
		//não é possivel criar um objeto conteudo pq a classe Conteudo é abstrada
		// POLIMORFISMO 
		//podemos criar um curso a partir da classe Conteudo
		
//**************************************************
		/*	Conteudo conteudo = new Curso(); */
//**************************************************
		
		// todos os elementos de conteudo contem em curso
		// nem todos os elementos de curso contem em conteudo
		// ou seja
		// o objeto conteudo sereberá somente os elementos da Classe conteudo
		// isso é possivel por que a classe Curso extends por herança Conteudo.
		// o mesmo acontece para a Classe Mentoria x Conteudo
		
		//System.out.println(curso1 +" \n"+ curso2);
		
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria java");
		mentoria1.setDescricao("Descricao Mentoria Java");
		mentoria1.setDataDasMentorias(LocalDate.now());
		
		
	//	System.out.println(mentoria1);
		
		
		// implementação do bootcampo
		BootCamp bootcamp = new BootCamp();
		
		bootcamp.setNome("BootCamp Java");
		bootcamp.setDescricao("Descrição do boot camp Java aqui...");
		bootcamp.getConteudo().add(curso1);
		bootcamp.getConteudo().add(curso2);
		bootcamp.getConteudo().add(mentoria1);
		
		
		// implementação dos devs
		
		Dev ezio = new Dev();
		ezio.setNome("Ezio Veiria");
		ezio.increverBootCamp(bootcamp);
		ezio.progredir();
		ezio.progredir(); 
		System.out.println("Conteudo inscritos ezio = " + ezio.getConteudoIncrito());
		System.out.println("Conteudo concluidos ezio = " + ezio.getConteudoConcluido());
		System.out.println("Calculo de xp ezio =" + ezio.calcularTotalXp());
		
		Dev camila = new Dev();
		camila.setNome("Camila Fera da Dio");
		camila.increverBootCamp(bootcamp);
		camila.progredir();
		System.out.println("Conteudo inscritos Camila = " + camila.getConteudoIncrito());
		System.out.println("Conteudo concluidos Camila = " + camila.getConteudoConcluido());
		System.out.println("Calculo de xp Camila =" + camila.calcularTotalXp());
		
	}

}
