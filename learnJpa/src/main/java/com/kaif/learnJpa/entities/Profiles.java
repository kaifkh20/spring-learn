/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.learnJpa.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;

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
@Table(name="profiles")
public class Profiles {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="bio")
    private String bio;
    
    @Column(name="phone_number")
    private Integer phoneNumber;
    
    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;
    
    @Column(name="loyalty_points")
    private Integer loyalPoints;
    
    
    @OneToOne
    @JoinColumn(name="id")
    @MapsId
    @ToString.Exclude
    private User user;
    
}
