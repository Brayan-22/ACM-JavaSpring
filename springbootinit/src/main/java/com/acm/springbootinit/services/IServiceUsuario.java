package com.acm.springbootinit.services;

import java.util.List;

import com.acm.springbootinit.models.Usuario;

public interface IServiceUsuario {
    public void saveUsuario(Usuario usuario);
    public List<Usuario> getAll();
}
