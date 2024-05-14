package com.acm.springbootinit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.acm.springbootinit.models.Usuario;
import com.acm.springbootinit.repository.IUsuarioRepository;
import java.util.Collections;

@Service
@Qualifier(value = "usuarioServicio2")
public class ServiceUsuarioImpl2 implements IServiceUsuario{

    private IUsuarioRepository usuarioRepository;

    public ServiceUsuarioImpl2(@Autowired IUsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        System.err.println("usuarioServicio2 save");
    }

    @Override
    public List<Usuario> getAll() {
        System.out.println("usuarioServicio 2 listar usuarios");
        return Collections.emptyList();
    }
    
}
