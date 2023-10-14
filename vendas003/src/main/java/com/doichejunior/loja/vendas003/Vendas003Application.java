package com.doichejunior.loja.vendas003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Vendas003Application {

	public static void main(String[] args) {
		SpringApplication.run(Vendas003Application.class, args);
	}

}
