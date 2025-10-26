/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.user_registration_system.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author kaifsaif
 */
@Service
public class EmailNotificationService implements NotificationService{
    
    @Override
    public void send(String message,String recipientEmail){
        System.out.println("Recipient Email: "+recipientEmail);
        System.out.println("Message: "+message);
    }
    
    
}
