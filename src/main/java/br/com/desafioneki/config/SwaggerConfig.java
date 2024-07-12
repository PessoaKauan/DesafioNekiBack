package br.com.desafioneki.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
@SecurityScheme(name = "Bearer Auth", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", scheme = "bearer")
public class SwaggerConfig {

	@Bean
	OpenAPI myOpenAPI() {
		Server devServer = new Server();

		devServer.setUrl("http://localhost:8080/back/");
		

		devServer.setDescription("server Url - Ambiente de Desenvolvimento");

		Contact contact = new Contact();
		contact.setEmail("kauankpp@hotmail.com");
		contact.setName("Kauan");
		contact.setUrl("https://github.com/PessoaKauan");

		Info info = new Info().title("Desafio Neki").version("1.0.0").contact(contact)
				.description("API com endpoints do desafio Skills.");

		return new OpenAPI().info(info).servers(List.of(devServer));

	}

}