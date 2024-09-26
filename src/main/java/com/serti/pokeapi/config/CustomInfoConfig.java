package com.serti.pokeapi.config;

import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomInfoConfig {

    @Bean
    public InfoContributor customInfo() {
        return builder -> builder.withDetail("app", "Api Pokemons")
        						 .withDetail("version", "1.0.0")
                				 .withDetail("author", "Luis Hernandez")
                				 .withDetail("description", "API rest para exponer información de pokemons y registrar peticiones y respuestas ")
                				 .build();
    }
}