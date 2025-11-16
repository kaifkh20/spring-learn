package com.kaif.learnJpa;

import com.kaif.learnJpa.entities.Address;
import com.kaif.learnJpa.entities.Profiles;
import com.kaif.learnJpa.entities.Tag;
import com.kaif.learnJpa.entities.User;
import com.kaif.learnJpa.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LearnJpaApplication.class, args);
                var repository = ctx.getBean(UserRepository.class);
                
                var user = User.builder()
                        .name("Kaif")
                        .email("kaif@gmail.com")
                        .password("Hello123")
                        .build();
                
                repository.save(user);

//                var address = Address.builder()
//                            .country("India")
//                            .street("St.1 Jamshedpur")
//                            .build();
//                
//                user.getAddresses().add(address);
//                address.setUser(user);
//                
//                var tag = Tag.builder().id(Long.valueOf("1")).name("Beginner").build();
//                
//                user.getTags().add(tag);
//                tag.getUsers().add(user);
//                
//                var profile = Profiles.builder().bio("New to this field.").build();
//                
//                user.setProfile(profile);
//                profile.setUser(user);
//                
//                System.out.println(user);
                            
	}

}
