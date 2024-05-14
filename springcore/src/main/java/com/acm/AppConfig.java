package com.acm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.acm.models.Parqueadero;
import com.acm.models.Usuario;
import com.acm.services.IServiceEmail;
import com.acm.services.ServiceEmailImplCC;
import com.acm.services.ServiceEmailImplCCO;

@Configuration
public class AppConfig {
    @Bean
    public Usuario getUsuario(){
        return new Usuario(1,"alejandro","riveros",new Parqueadero(1, 100));
    }
    @Bean
    public IServiceEmail getServicioEmail(){
        return new ServiceEmailImplCC();
    }
    @Bean
    public IServiceEmail getServicioEmail2(){
        return new ServiceEmailImplCCO();
    }
}