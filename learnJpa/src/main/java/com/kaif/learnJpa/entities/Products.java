/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.learnJpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author kaifsaif
 */
@Entity
@Table(name="products")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Products {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="name",nullable=false)
    private String name;
    
    @Column(name="price",nullable=false,precision=10,scale=2)
    private BigDecimal price;

    @ManyToOne(fetch=FetchType.LAZY)
    @OnDelete(action=OnDeleteAction.SET_NULL)
    @JoinColumn(name="category_id",nullable=false)
    private Categories category;
    
    @ManyToMany(mappedBy="products")
    @Builder.Default
    private Set<User> users = new HashSet<>();
    
    
}
