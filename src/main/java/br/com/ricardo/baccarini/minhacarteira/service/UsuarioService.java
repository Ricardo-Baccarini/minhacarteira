package br.com.ricardo.baccarini.minhacarteira.service;

import br.com.ricardo.baccarini.minhacarteira.model.Usuario;

public interface UsuarioService {
	
	
	//TDD Test driven Development (Desenvolvimento Guiado por teste) 
	Usuario autenticar(String email, String senha);
	
	Usuario cadastrarUsuario(Usuario usuario);
	
	void validarEmail(String email);

}
