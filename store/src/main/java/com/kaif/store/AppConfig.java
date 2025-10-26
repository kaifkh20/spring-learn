/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author kaifsaif
 */

@Configuration
public class AppConfig {
    
    @Value("${payment.service}")
    private String paymentServiceName;
  
    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }
    
    @Bean
    public PaymentService paypal(){
        return new PaypalPaymentService();
    }
    
    @Bean 
    public OrderService orderService(){
        PaymentService paymentService = (paymentServiceName.equals("paypal"))?paypal():stripe();
        return new OrderService(paymentService);
    }
    
}
