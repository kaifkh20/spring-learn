package com.kaif.user_registration_system;

import com.kaif.user_registration_system.model.User;
import com.kaif.user_registration_system.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UsrApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UsrApplication.class, args);
                UserService usc = ctx.getBean(UserService.class);
                usc.registerUser(new User(1L,"Kaif Khan","kaifkhan@gmail.com","Kaif1234"));
	}
}
