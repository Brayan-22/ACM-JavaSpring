package com.acm.springbootinit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.acm.springbootinit.models.Usuario;
import com.acm.springbootinit.repository.IUsuarioRepository;

@Service
@Qualifier(value = "usuarioServicio1")
public class ServiceUsuarioImpl implements IServiceUsuario{

    private IUsuarioRepository usuarioRepository;

    public ServiceUsuarioImpl(@Autowired IUsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }



    @Override
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }
}
