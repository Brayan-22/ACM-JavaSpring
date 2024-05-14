package com.acm.springjwt.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acm.springjwt.dto.CreateUserDTO;
import com.acm.springjwt.models.ERole;
import com.acm.springjwt.models.RoleEntity;
import com.acm.springjwt.models.UserEntity;
import com.acm.springjwt.repository.UserRepository;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class PrincipalController {
    
    @Autowired
    private UserRepository userRepository;

    
    @GetMapping("/prueba")
    public ResponseEntity<UserEntity> getMethodName() {
        UserEntity user = UserEntity.builder().userName("alejandro").email("correo@correo.com").password("12345").build();
        userRepository.save(user);
        ResponseEntity<UserEntity> res = ResponseEntity.ok(user);
        return res;
    }
    
    @PostMapping("/createUser")
    public ResponseEntity<?> getMethodName(@RequestBody@Valid CreateUserDTO createUserDTO) {
        UserEntity user = UserEntity.builder()
        .userName(createUserDTO.getUserName())
        .email(createUserDTO.getEmail())
        .password(createUserDTO.getPassword())
        .build();
        userRepository.save(user);
        return ResponseEntity.status(200).build();
    }
    


    // @PostMapping("/createUser")
    // public ResponseEntity<?> createUser(@RequestBody@Valid CreateUser createUser) {
        

    //     // UserEntity userEntity = UserEntity.builder()
    //     // .userName(createUser.getUserName())
    //     // .email(createUser.getEmail())
    //     // .password(createUser.getPassword())
    //     // .role(RoleEntity.builder().role(ERole.valueOf(createUser.getRole())).build())
    //     // .build();


    //     // userRepository.save(userEntity);
    //     // return ResponseEntity.ok(userEntity);
    // }
    

}
