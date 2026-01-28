package com.devsuperior.projeto_componente_injecao_dependencia;

import com.devsuperior.projeto_componente_injecao_dependencia.entities.Order;
import com.devsuperior.projeto_componente_injecao_dependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ProjetoComponenteInjecaoDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoComponenteInjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		int code = 1034;
		double basic = 150.0;
		double discount = 20.0;

        //Order order = new Order(1034, 150.0, 20.0);
		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código " + order.getCode());
		//System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order)));
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
	}
}
