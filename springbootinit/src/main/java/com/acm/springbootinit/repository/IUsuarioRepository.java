package com.acm.springbootinit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acm.springbootinit.models.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer>{
    
}
