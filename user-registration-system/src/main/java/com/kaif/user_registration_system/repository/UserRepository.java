/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.kaif.user_registration_system.repository;

import com.kaif.user_registration_system.model.User;

/**
 *
 * @author kaifsaif
 */
public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
