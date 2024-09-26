package com.serti.pokeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.serti.pokeapi.mdl.AccessLog;


@SpringBootApplication
@ComponentScan(basePackages  = {"com.serti.pokeapi.mdl"},
basePackageClasses = AccessLog.class)
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class PokeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeapiApplication.class, args);
	}

}
