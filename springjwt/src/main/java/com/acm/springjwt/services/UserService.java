package com.acm.springjwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acm.springjwt.models.UserEntity;
import com.acm.springjwt.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUsuario(UserEntity userEntity){
        userRepository.save(userEntity);
    }
}
