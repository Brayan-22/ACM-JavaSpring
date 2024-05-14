package com.acm.springbootinit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.acm.springbootinit.models.Usuario;
import com.acm.springbootinit.services.IServiceUsuario;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import com.acm.springbootinit.models.dto.*;
import java.time.LocalDate;
import java.util.Arrays;
@RestController
@RequestMapping(path = "/api/prueba")
public class UsuarioController{

    @GetMapping(path = "/main" , produces={"application/json"})
    public ResponseEntity<UsuarioDTO> getMethod(){
        Usuario usuario = new Usuario(1000, "alejandro", "riveros","contraseña");
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuario.getNombre().concat(" ").concat(usuario.getApellido()),Arrays.asList(new RecibosDTO(1,LocalDate.now(),100),new RecibosDTO(2,LocalDate.of(2010, 5, 22),90)));
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(usuarioDTO,headers, HttpStatus.CREATED);
    }

}
