package br.com.ecommerce.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		System.out.println("Teste de start spring boot");
		SpringApplication.run(EcommerceApplication.class, args);
	}

}