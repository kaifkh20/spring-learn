 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaif.learnJpa.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author kaifsaif
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(nullable=false,name="name")
    private String name;
    
    @Column(nullable=false,name="email")
    private String email;

    @Column(nullable=false,name="password")    
    private String password;
    
    @OneToMany(mappedBy="user")
    @Builder.Default
    private List<Address> addresses = new ArrayList<>();
    
    public void addAddress(Address address){
        addresses.add(address);
        address.setUser(this);
    }
    public void removeAddress(Address address){
        addresses.remove(address);
        address.setUser(null);
    }
    
    @Builder.Default
    @ManyToMany
    @JoinTable(
            name = "user_tags",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="tag_id")
    )
    private Set<Tag> tags = new HashSet<>();
    
    public void addTags(String name){
        Tag tag = new Tag(name);
        tags.add(tag);
        tag.getUsers().add(this);
    }
    
    @OneToOne(mappedBy="user")
    private Profiles profile;
    
    @Builder.Default
    @ManyToMany
    @JoinTable(
            name = "wishlists",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="product_id")
    )
    private Set<Products> products = new HashSet<>();
}
