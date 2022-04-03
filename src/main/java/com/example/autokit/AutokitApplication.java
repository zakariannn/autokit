package com.example.autokit;

import com.example.autokit.model.Role;
import com.example.autokit.model.User;
import com.example.autokit.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class AutokitApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutokitApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(UserService userService) {
//		return args -> {
//			userService.saveRole(new Role(null, "ADMIN"));
//			userService.saveRole(new Role(null, "USER"));
//
//
//			userService.saveUser(new User(null, "user1", "username1", "password1", new ArrayList<>()));
//			userService.saveUser(new User(null, "user2", "username2", "password2", new ArrayList<>()));
//
//			userService.addRoleToUser("username1", "ADMIN");
//			userService.addRoleToUser("username2", "ADMIN");
//			userService.addRoleToUser("username2", "USER");};
//	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
