/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author kaifsaif
 */
//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService{

    @Override
    public void processOrder() {
        System.out.println("STRIPE PROCESSING ORDER");
        System.out.println("STRIPE PROCESSED ORDER");
    }
    
}
