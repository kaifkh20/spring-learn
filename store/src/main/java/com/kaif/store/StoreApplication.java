package com.kaif.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(StoreApplication.class, args);
//                OrderService orderService = new OrderService(new StripePaymentService());
                var orderService = ctx.getBean(OrderService.class);
                orderService.placeOrder();
	}

}
