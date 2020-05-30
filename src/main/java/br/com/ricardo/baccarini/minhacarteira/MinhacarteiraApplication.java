package br.com.ricardo.baccarini.minhacarteira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ricardo.baccarini.minhacarteira.model.Usuario;

@SpringBootApplication
public class MinhacarteiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhacarteiraApplication.class, args);
		
		Usuario usuario = new Usuario();
		usuario.setNome("Ricardo");
	}

}
