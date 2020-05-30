package br.com.ricardo.baccarini.minhacarteira;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production") // arquivo de producao que vai trabalhar
public class MensagemService {

	// Busca nome da aplicacao no application.properties
	@Value("{$application.name}")
	private String appname;
}
