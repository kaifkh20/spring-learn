/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.user_registration_system.repository;

import com.kaif.user_registration_system.model.User;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kaifsaif
 */
@Repository
public class InMemoryRepository implements UserRepository {
    private final Map<String,User> users = new HashMap<>();
    
    @Override
    public void save(User user){
        System.out.println("Saving User....");
        users.put(user.getEmail(),user);        
    }
    
    @Override
    public User findByEmail(String email){
        return users.getOrDefault(email,null);
    }
    
}
