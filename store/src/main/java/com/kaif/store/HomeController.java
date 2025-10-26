/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author kaifsaif
 */
@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String name;
    
    @RequestMapping("/")
    public String index(){
        System.out.println(name);
        return "index.html";
    }
}
