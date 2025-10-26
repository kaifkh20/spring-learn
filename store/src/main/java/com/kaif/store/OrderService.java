/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author kaifsaif
 */
//@Service
public class OrderService {
      final private PaymentService paymentService;
//      
//      @Value("${payment.service}")
//      private String serviceName; 
      
      public OrderService(PaymentService paymentService){
//          System.out.println("The service being used is"+serviceName);
          this.paymentService = paymentService;
      }
      
      public void placeOrder(){
          paymentService.processOrder();
      }
}
