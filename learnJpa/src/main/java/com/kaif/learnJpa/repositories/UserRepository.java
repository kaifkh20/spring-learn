/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.kaif.learnJpa.repositories;

import com.kaif.learnJpa.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author kaifsaif
 */
public interface UserRepository extends CrudRepository<User,Long>{
    
}
