package br.com.ricardo.baccarini.minhacarteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ricardo.baccarini.minhacarteira.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	// Se fosse no banco faria:
	// select * from usuario where EXIST
	
	// Utilizando JPA Query Methods
	//boolean existsByEmailAndNome(String email, String nome);
	boolean existsByEmail(String email);
}
