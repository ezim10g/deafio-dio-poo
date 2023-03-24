package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>(); // declarado como Linked hass set para serem guardados na mesma orden de inserção
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();// tambem só será permitido que o dev só esteja cadastrado uma vez em cada item 
	
	// usamos herança da classe conteudo para conseguir agrupar cursos e mentorias inscritos e concluídos
	//sendo assim ficou mais fácil criar um Set de tipo <Conteudo>

	// também está sendo usado polimorfismo quando instaciamos new Linked atravez da classe Set<>
	
	
	// agora vamos criar os métodos
	public void increverBootCamp(BootCamp bootCamp) {
		
			//QUANDO UM DEV SE INSCREVE EM UM BOOT CAMP TODOS OS CONTEUDOS DO BOOTCAMP É INSERIDO NA LISTA conteudoInscrito
		this.conteudoInscrito.addAll(bootCamp.getConteudo());
			//precisamos tabem adicinar o DEv a lista de dev em BootCamp
		bootCamp.getDevInscritos().add(this);
			//this neste caso ´se refere ao Dev instanciado.
		
	}
	
	public void progredir(){
			// A MEDIDA QUE O DEV VAI PROGREDINDO VAI ADICIONANDO NA ORDEM OS CONTEUDOS INSCRITOS PARA A LISTA DE CONTEUDOS CONCLUÍDOS
		Optional<Conteudo> conteudo =  this.conteudoInscrito.stream().findFirst();
			// optional resolve problemas relacionado a conteudo NULL
		if(conteudo.isPresent()) {
			this.conteudoConcluido.add(conteudo.get());
				//depois de adicionado em concluido, removemos este conteudo dos inscritos
			this.conteudoInscrito.remove(conteudo.get());
		}else {
				//caso nao tenhaconteudo mostrar mensaggem de erro
			System.err.println("Voce nao esta inscrito em nenhum curso");
		}
	}
	
	public double calcularTotalXp(){
		return this.conteudoConcluido
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
				//pegou cada conteudo, de cada conteudo pedou cada calcular xp e somou no final
	}
	

	//getters and setters	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Conteudo> getConteudoIncrito() {
		return conteudoInscrito;
	}
	
	public void setConteudoIncrito(Set<Conteudo> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}
	
	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}
	
	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}

	//metodos equals e rashcode
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluido, conteudoInscrito, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluido, other.conteudoConcluido)
				&& Objects.equals(conteudoInscrito, other.conteudoInscrito) && Objects.equals(nome, other.nome);
	}
	
	
	
	
}
