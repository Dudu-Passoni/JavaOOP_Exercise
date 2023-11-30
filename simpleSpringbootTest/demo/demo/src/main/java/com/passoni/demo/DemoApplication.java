package com.passoni.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Carro saveiro = new Carro("Saveiro Surf", "Volkswagen", 1997, "Vermelho");
		saveiro.ligar();
		System.out.println(saveiro.toString());
	}

}
