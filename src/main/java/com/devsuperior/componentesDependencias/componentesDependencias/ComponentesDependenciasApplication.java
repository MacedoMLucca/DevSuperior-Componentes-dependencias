package com.devsuperior.componentesDependencias.componentesDependencias;

import com.devsuperior.componentesDependencias.componentesDependencias.entities.Order;
import com.devsuperior.componentesDependencias.componentesDependencias.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComponentesDependenciasApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(ComponentesDependenciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("===================");
		Order orderUm = new Order(1034,150.00,20.0);
		System.out.println("PEDIDO CÓDIGO:"+orderUm.getCode());
		System.out.println("Valor Total: R$ "+ orderService.total(orderUm));

		System.out.println("===================");
		Order orderDois = new Order(2282,800.00,10.0);
		System.out.println("PEDIDO CÓDIGO:"+orderDois.getCode());
		System.out.println("Valor Total: R$ "+ orderService.total(orderDois));

		System.out.println("===================");
		Order orderTres = new Order(1309,95.90,0.0);
		System.out.println("PEDIDO CÓDIGO:"+orderTres.getCode());
		System.out.println("Valor Total: R$ "+ orderService.total(orderTres));

	}
}
