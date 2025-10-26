/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.store;

import org.springframework.stereotype.Service;

/**
 *
 * @author kaifsaif
 */
//@Service("paypal")
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processOrder(){
        System.out.println("PAYPAL PROCESSING ORDER");
        System.out.println("PAYPAL PROCESSED ORDER");
    }
}
