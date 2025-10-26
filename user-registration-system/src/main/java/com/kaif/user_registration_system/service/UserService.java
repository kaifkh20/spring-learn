/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.user_registration_system.service;

import com.kaif.user_registration_system.model.User;
import com.kaif.user_registration_system.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author kaifsaif
 */

@Service
public class UserService {
    
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(NotificationService notificationService,UserRepository userRepository) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }
    
    public void registerUser(User user){
        userRepository.save(user);
        notificationService.send("Thanks for registering", user.getEmail());
        
    }
    
}
