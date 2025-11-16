/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.learnJpa.entities;

import lombok.*;
import jakarta.persistence.*;

/**
 *
 * @author kaifsaif
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString
@Table(name="addresses")
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="street",nullable=false)
    private String street;
    
    @Column(name="country",nullable=false)
    private String country;
    
    @ManyToOne
    @JoinColumn(name="user_id")
    @ToString.Exclude
    private User user;
}
