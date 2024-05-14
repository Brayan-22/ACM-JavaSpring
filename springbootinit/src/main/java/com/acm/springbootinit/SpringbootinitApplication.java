package com.acm.springbootinit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acm.springbootinit.models.Usuario;
import com.acm.springbootinit.services.IServiceUsuario;

@SpringBootApplication
public class SpringbootinitApplication implements CommandLineRunner {
	@Autowired
	@Qualifier(value = "usuarioServicio2")
	private IServiceUsuario usuarioServicio;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootinitApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// usuarioServicio.saveUsuario(new Usuario(1,"ALEJANDRO","RIVEROS"));
		List<Usuario> usuarios = usuarioServicio.getAll();
		System.out.println(usuarios);
	}

}
