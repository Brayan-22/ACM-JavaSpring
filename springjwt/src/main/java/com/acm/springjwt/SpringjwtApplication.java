package com.acm.springjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acm.springjwt.models.UserEntity;
import com.acm.springjwt.services.UserService;

@SpringBootApplication
public class SpringjwtApplication implements CommandLineRunner{


	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringjwtApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		userService.saveUsuario(UserEntity.builder().userName("alejandro").email("asdasdas@casjdsa.com").password("asdasd").build());
	}

}
