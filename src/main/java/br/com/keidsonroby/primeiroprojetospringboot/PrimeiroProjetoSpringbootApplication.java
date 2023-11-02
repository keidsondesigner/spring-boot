package br.com.keidsonroby.primeiroprojetospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.keidsonroby")
public class PrimeiroProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringbootApplication.class, args);
	}

}
