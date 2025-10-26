/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.store;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author kaifsaif
 */
@Component
@Lazy
public class HeavyResource {
    public HeavyResource(){
        System.out.println("Heavy Resouce created.");
    }
}
